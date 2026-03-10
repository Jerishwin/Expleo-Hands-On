package com.medium;
import java.util.*;

public class GrossSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        double basicSalary, hra = 0, da = 0, grossSalary;

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        if (basicSalary<=10000) {
            hra = basicSalary*0.20;
            da = basicSalary*0.80;
        }
        else if (basicSalary>=10001 && basicSalary<=20000) {
            hra = basicSalary*0.25;
            da = basicSalary*0.90;
        }
        else if (basicSalary>=20001) {
            hra = basicSalary*0.30;
            da = basicSalary*0.95;
        }

        grossSalary = basicSalary+hra+da;

        System.out.println("HRA = "+hra);
        System.out.println("DA = "+da);
        System.out.println("Gross Salary = "+grossSalary);

        sc.close();
	}

}
