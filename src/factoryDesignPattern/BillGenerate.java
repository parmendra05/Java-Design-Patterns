package factoryDesignPattern;

import java.util.Scanner;

public class BillGenerate {

	public static void main(String[] args) {
		GetPlaneFactory factory=new GetPlaneFactory();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Plan Type");
		String planType=sc.next();
		System.out.println("Enter the total units");
		Scanner sc2=new Scanner(System.in);
		int unit=sc2.nextInt();
		
		
		Plane p=factory.getPlane(planType);
		
		System.out.println("--------------------------------------");
		System.out.println("Bill Ammount For "+planType+" of Unit "+unit );
		p.getRate();
		p.calculateBill(unit);

	}

}
