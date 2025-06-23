package com.practice;

import java.util.Scanner;

public class NykaaGlow {

	public void GlowUp() {

		System.out.println("* * * * WELCOME TO NYKAA SUMMER SALE * * * *");
		System.out.println();
		System.out.println("SALE !!  SALE !!  SALE !!");

		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SkinCare bp = new SkinCare();
			bp.start();

			HairCare hc = new HairCare();
			Thread t = new Thread(hc);
			t.start();

			Makeup m = new Makeup();
			m.start();

			Appliances ap = new Appliances();
			ap.start();

//			System.out.println("=====================================");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("***CATEGORIES*** \n 1.SkinCare \n 2.HairCare \n 3.Makeup \n 4.Appliances");
		System.out.println("Enter which category you want to visit :=");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			SkinCare bp = new SkinCare();
			bp.start();
			bp.m1();
			break;
		case 2:
			HairCare hc = new HairCare();
			Thread t = new Thread(hc);
			t.start();
			break;
		case 3:
			Makeup m = new Makeup();
			m.start();
			m.m1();
			break;
		case 4:
			Appliances ap = new Appliances();
			ap.start();
			break;
		default:
			System.out.println("Thank you for visiting..!!!");
		}

	}
}
