package DesignPattern;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {

	MobilePhoneOperator[] mobilePhoneOperator= {new Airtel(),new Banglalink(),new GrameenPhone(),new Robi()};
	int[] arr=new int[4];
	public static void main(String[] args) {
		
		MainClass mainclass=new MainClass();
		mainclass.makePhoneCall();
	}
	
	public void makePhoneCall() {
		
		System.out.println("Airtel Offer:\n1.Pick Hour Bill Per Minutes : 40 poisha. \n2.Off Hour Bill Per Minutes : 60 poisha.\n3.On Hour Bill Per Minutes : 50 poisha.\n4.Special Hour Bill Per Minutes : 30 poisha.\n");
		
		System.out.println();
		System.out.println("Banglalink Offer:\n1.Pick Hour Bill Per Minutes : 25 poisha.\n2.Off Hour Bill Per Minutes : 50 poisha. \n3.On Hour Bill Per Minutes : 40 poisha. \n4.Special Hour Bill Per Minutes : 20 poisha. \n");
		
		System.out.println();
		System.out.println("GrameenPhone Offer:\n1.Pick Hour Bill Per Minutes : 15 poisha. \n2.Off Hour Bill Per Minutes : 50 poisha. \n3.On Hour Bill Per Minutes : 20 poisha. \n4.Special Hour Bill Per Minutes : 10 poisha. \n");
	
		System.out.println();
		System.out.println("Robi Offer:\n1.Pick Hour Bill Per Minutes : 50 poisha. \n2.Off Hour Bill Per Minutes : 80 poisha.\n3.On Hour Bill Per Minutes : 60 poisha. \n4.Special Hour Bill Per Minutes : 60 poisha. \n");
		
		System.out.println();
		Scanner scr=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Choose Moblie Phone Operator:\n 1.Airtel\n 2.Banglalink\n 3.GrameenPhone\n 4.Robi.");
			int item=scr.nextInt();
			MobilePhoneOperator operator=mobilePhoneOperator[item-1];
			
			for(int i=0;i<4;i++) {
	
				System.out.println("Choose Hour:\n 1.Pick Hour\n 2.Off Hour\n 3.On Hour\n 4.Special Hour.");
				int hour=scr.nextInt();
				scr.nextLine();
				System.out.println("Write call for make call");
				String call=scr.nextLine();
				int start=(int) getTime();
				System.out.println("Write end for make call end");
				String finish=scr.nextLine();
				int end=(int) getTime();
				arr[hour-1]=end-start;
				System.out.println("Call Duration:"+arr[hour-1]+" minutes");
			}
			
			String call=scr.nextLine();
			double bill=operator.generateBill(arr);
			System.out.println("Total Bill:"+bill);
			scr.nextLine();
			
		}
		
		
	
	}
	
	public long getTime() {
		
		long timeMillis = System.currentTimeMillis();
		long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
		
		return timeSeconds;
	}

}
