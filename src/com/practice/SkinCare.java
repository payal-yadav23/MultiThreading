package com.practice;

import java.util.Scanner;

public class SkinCare extends Thread {

	@Override
	public void run() {

		System.out.print("1. SKIN CARE PRODUCTS := ");

		System.out.println("1.Cleanser" + "\n\t\t\t 2.Toner" + "\n\t\t\t 3.Serum/Correct" + "\n\t\t\t 4.Moisturizer"
				+ "\n\t\t\t 5.Sunscreen");

		System.out.println("--------------------------------------------------------------------------------------");

	}

	public void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which product you want to look for :=");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Cleanser cost : 199rs");
			break;
		case 2:
			System.out.println("Toner cost : 259rs");
			break;
		case 3:
			System.out.println("Serum cost : 199rs");
			break;
		case 4:
			System.out.println("Moisturizer cost : 449rs");
			break;
		case 5:
			System.out.println("Sunscreen cost : 599rs");
			break;
		}
	}

}

