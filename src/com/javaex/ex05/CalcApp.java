package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Add add = new Add();
    	Div div = new Div();
    	Mul mul = new Mul();
    	Sub sub = new Sub();
    	Scanner sc = new Scanner(System.in);
    	
		int iNum01 = 0; 
		int iNum02 = 0; 
		
		while(true) {
			System.out.print(">> ");
			String sCal = sc.nextLine();
			
			if(sCal.equals("/q")) {
				System.out.println("종료합니다.");
				sc.close();
				break;
			}
			
			String[] sCalArray = sCal.split(" ");
			iNum01 = Integer.parseInt(sCalArray[0]);
			iNum02 = Integer.parseInt(sCalArray[2]);
			
			switch(sCalArray[1]) {
				case "+": 
					add.setValue(iNum01, iNum02);
					System.out.println(">> " + add.calculate());
					break;
				case "-": 
					sub.setValue(iNum01, iNum02);
					System.out.println(">> " + sub.calculate());
					break;
				case "*": 
					mul.setValue(iNum01, iNum02);
					System.out.println(">> " + mul.calculate());
					break;
				case "/":
					div.setValue(iNum01, iNum02);
					System.out.println(">> " + div.calculate());
					break;
				default: System.out.println("알 수 없는 연산입니다.");
					break;
			}
			
		}
		
    }
    
}
