package com.practice;

import java.util.Scanner;

public class Makeup extends Thread {

	@Override
	public void run() {

		System.out.print("3.  MAKEUP PRODUCTS :=");
		System.out.println(" 1.Primer" + "\n\t\t\t 2.Conceler" + "\n\t\t\t 3.Foundation" + "\n\t\t\t 4.Blush"
				+ "\n\t\t\t 5.LipTint/Lipsticks");
		System.out.println("----------------------------------------------------------------------------------------");

	}

	public void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which product you want to look for :=");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Primer cost : 199rs");
			break;
		case 2:
			System.out.println("Conceler cost : 259rs");
			break;
		case 3:
			System.out.println("Foundation cost : 199rs");
			break;
		case 4:
			System.out.println("Blush cost : 149rs");
			break;
		case 5:
			System.out.println("Liptint cost : 299rs");
			break;
		}
	}

}
