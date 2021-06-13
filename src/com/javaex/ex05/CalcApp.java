package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print(">> ");
    	String sCal = sc.nextLine();
		sc.close();
		
		String[] sCalArray = sCal.split(" ");
		
		
		
		switch(sCalArray[1]) {
			case "+":
				break;
			case "-":
				break;
			case "*":
				break;
			case "/":
				break;
		}
		
    }
}
