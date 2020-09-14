package com.riigsoft.test;

import java.util.Scanner;

import com.riigsoft.account.Deposit;
import com.riigsoft.account.Payment;
import com.riigsoft.account.WithDraw;
import com.riigsoft.validate.Validate;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		xyz: while (true) {
			System.out.println("Enter pinNo:");
			String pinNo = sc.nextLine();
			if (pinNo.length() == 4) {
				Validate validate = new Validate();
				boolean flag = validate.validate(Integer.parseInt(pinNo));
				if (flag) {
					System.out.println("===MENU============");
					System.out.println("1.Deposit\n2.WithDraw\n3.Payment\n4.Exit");
					int choice = Integer.parseInt(sc.nextLine());
					switch (choice) {
					case 1:
						Deposit d = new Deposit();
						System.out.println("Enter Amount:");
						int damt = Integer.parseInt(sc.nextLine());
						if (damt > 0 && damt % 100 == 0) {
							d.process(damt);
						} else {
							System.out.println("Invalid Amount.");
						}
						break xyz;
					case 2:
						WithDraw wd = new WithDraw();
						System.out.println("Enter Amount:");
						int wamt = Integer.parseInt(sc.nextLine());
						if (wamt > 0 && wamt % 100 == 0) {
							wd.process(wamt);
						} else {
							System.out.println("Invalid Amount.");
						}
						break xyz;

					case 3:
						Payment p = new Payment();
						System.out.println("Enter Amount:");
						float pamt = Float.parseFloat(sc.nextLine());
						if (pamt > 0) {
							p.process(pamt);
						} else {
							System.out.println("Invalid Amount.");
						}
						break xyz;
					case 4:
						System.out.println("Logout");
						System.exit(0);
						break xyz;
					default:
						System.out.println("Invalid Choice");
						break xyz;
					}// end switch
				} // end inner if
				else {
					System.out.println("PinNo not Exist.");
					count++;
				}
			} // end outer if
			else {
				System.out.println("Invalid Pin Number.");
				count++;
			}
			if(count==3) {
				System.out.println("Transaction has been Blocked!");
				break xyz;
			}
		} // end loop
		sc.close();
	}

}
