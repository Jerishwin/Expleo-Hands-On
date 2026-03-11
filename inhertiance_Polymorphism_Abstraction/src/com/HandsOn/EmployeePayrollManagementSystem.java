package com.HandsOn;

class Employee {
    protected String empId;
    protected String empName;
    protected double baseSalary;

    Employee(String empId, String empName, double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
    }

    public String getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public double getBaseSalary() { return baseSalary; }

    public double calculateSalary() {
        return baseSalary; // mandatory default
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Salary: " + calculateSalary();
    }
}

//Permanent Employee
class PermanentEmployee extends Employee {
 private double bonus;

 public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
     super(empId, empName, baseSalary);
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + bonus;
 }
}

//Contract Employee
class ContractEmployee extends Employee {
 private double taxRate;
 private double serviceCharge;

 public ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
     super(empId, empName, baseSalary);
     this.taxRate = taxRate;
     this.serviceCharge = serviceCharge;
 }

 @Override
 public double calculateSalary() {
     return baseSalary - (baseSalary * taxRate) - serviceCharge;
 }
}

//Intern
class Intern extends Employee {
 private double stipend;

 public Intern(String empId, String empName, double stipend) {
     super(empId, empName, 0); // baseSalary not used
     this.stipend = stipend;
 }

 @Override
 public double calculateSalary() {
     return stipend;
 }
}

public class EmployeePayrollManagementSystem {

	public static void main(String[] args) {
		
		Employee e1 = new PermanentEmployee("P101", "Alice", 50000.0, 10000.0); 
		Employee e2 = new ContractEmployee("C202", "Bob", 40000.0, 0.10, 2000.0); 
		Employee e3 = new Intern("I303", "Charlie", 15000.0); 
		System.out.println(e1); 
		System.out.println(e2); 
		System.out.println(e3); 
	}

}
