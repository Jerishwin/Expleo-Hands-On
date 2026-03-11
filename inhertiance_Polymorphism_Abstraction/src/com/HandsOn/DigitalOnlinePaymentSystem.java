package com.HandsOn;

public class DigitalOnlinePaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1 = new CreditCardPayment("TXN101", 2500.0, "Alice", "1234567812345678", "123", "12/27"); 
		Payment p2 = new UPIPayment("TXN202", 1500.0, "Bob", "bob@bank", "4321"); 
		Payment p3 = new NetBankingPayment("TXN303", 5000.0, "Charlie", "HDFC", "12345678", "HDFC0001234"); 
		p1.executeTransaction(); 
		p2.executeTransaction(); 
		p3.executeTransaction();
	}

}

abstract class Payment {
	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus;
	
	public Payment(String transactionId, double amount, String customerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
		this.paymentStatus = "Pending";
	}
	
	public abstract boolean validatePayment();
	public abstract boolean processPayment();
	
	public void executeTransaction() {
		if(validatePayment()) {
			if (processPayment()) { 
				setPaymentStatus("Success"); 
			} else { 
				setPaymentStatus("Failed");
			}
		} else { 
			setPaymentStatus("Validation Failed"); 
		} 
		generateReceipt();
	}
	
	public void generateReceipt() { 
		System.out.println("----- Transaction Receipt -----"); 
		System.out.println("Transaction ID: " + transactionId); 
		System.out.println("Customer: " + customerName); 
		System.out.println("Amount: " + amount);
		System.out.println("Status: " + paymentStatus); 
	    System.out.println("-------------------------------"); 
	    }
	
	public String getTransactionId() {
		return transactionId;
		} 
	
	public double getAmount() {
		return amount;
		} 
	public String getPaymentStatus() {
		return paymentStatus;
		} 
	public void setPaymentStatus(String status) {
		this.paymentStatus = status;
		}
}

class CreditCardPayment extends Payment { 
	private String cardNumber; 
	private String cvv; 
	private String expiryDate; 
	
	public CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv, String expiryDate) { 
		super(transactionId, amount, customerName); 
		this.cardNumber = cardNumber; 
		this.cvv = cvv; 
		this.expiryDate = expiryDate; 
		}
	
	@Override 
	public boolean validatePayment() { 
		return cardNumber.length() == 16 && cvv.length() == 3 && expiryDate.matches("\\d{2}/\\d{2}"); 
	} 
	
	@Override
	public boolean processPayment() { 
		return true;  
	} 
}

class UPIPayment extends Payment { 
	private String upiId; 
	private String upiPin; 

	public UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) { 
		super(transactionId, amount, customerName); 
		this.upiId = upiId; 
		this.upiPin = upiPin; 
	}
	@Override 
	public boolean validatePayment() { 
		return upiId.contains("@") && upiPin.length() == 4; 
	} 
	@Override 
	public boolean processPayment() { 
		return true;  
	} 
}

class NetBankingPayment extends Payment { 
	private String bankName; 
	private String accountNumber; 
	private String ifscCode; 

	public NetBankingPayment(String transactionId, double amount, String customerName, String bankName, String accountNumber, String ifscCode) { 
		super(transactionId, amount, customerName); 
		this.bankName = bankName; 
		this.accountNumber = accountNumber; 
		this.ifscCode = ifscCode; 
	}
	@Override 
	public boolean validatePayment() { 
		return accountNumber.length() >= 8 && ifscCode.matches("[A-Z]{4}[0-9]{7}"); 
	} 
	@Override 
	public boolean processPayment() { 
		return true;
	} 
}

