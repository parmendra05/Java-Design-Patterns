package factoryDesignPattern;

import java.util.Scanner;

public class BillGenerate {

	public static void main(String[] args) {
		BillFactory factory = new BillFactory();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the plan type");
		String planType = sc.next();
		System.out.println("Enter the total units");
		Scanner sc2 = new Scanner(System.in);
		int unit = sc2.nextInt();

		Bill_Planner bill = factory.getPlan(planType);

		System.out.println("--------------------------------------");
		System.out.println("Bill details for " + unit + " Unit ");
		bill.getRate();
		bill.calculateBill(unit);

	}

}
