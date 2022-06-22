package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsoucedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employee ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + "data");
			System.out.print("Outsourced  (y/n) ? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours : ");
			int hours = sc.nextInt();
			System.out.print("Value per hour : ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.println("AdditionalCharge: ");
				double addtionalCharge = sc.nextDouble();
				Employee emp = new OutsoucedEmployee(name, hours, valuePerHour, addtionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);

			}
		}
		System.out.println();
		System.out.println("Payments");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment() ));
		}

		sc.close();
	}

}
