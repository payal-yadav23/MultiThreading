package com.practice;

public class Appliances extends Thread implements Runnable {

	@Override
	public void run() {

		System.out.print("4.  APPLIANCES :=");
		System.out.println("1.MultiStyler" + "\n\t\t 2.Hair Straightner" + "\n\t\t 3.Gua Sha Massage Kit"
				+ "\n\t\t 4.Hair Dryers" + "\n\t\t 5.Brushes Cleansers");
		System.out.println("------------------------------------------------------------------------------------");

	}

}
