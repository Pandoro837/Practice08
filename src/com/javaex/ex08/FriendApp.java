package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//스캐너 임포트
		
		System.out.println("친구를 3명 등록해주세요");
		
		Friend[] fArray = new Friend[3];	//친구의 정보를 담을 배열
		
//		입력받은 값을 추가
		for(int i = 0; i < fArray.length; i++) {
			fArray[i] = new Friend(sc.nextLine());	
		}
		
		sc.close();
		
//		입력받은 값을 출력
		for(int i = 0; i < fArray.length; i++) {
			fArray[i].showInfo();	
		}
		
		
		
	}

}
