package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요

		String[] sNumLine = numLine.split(" "); // split 한 numline의 값을 배열로 바꾼다

		for(int i = 0 ; i < sNumLine.length; i++) {
			sum = sum + Integer.parseInt(sNumLine[i]); //sNumLine에 들어있는 문자열로 저장된 숫자를 바꿔서 더해준다
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
