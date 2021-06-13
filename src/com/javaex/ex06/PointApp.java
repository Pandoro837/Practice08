package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
//		모든 클래스는 선언하지 않았다 하더라도 Object.java를 부모로서 상속받는다
//		.equals는 Object 클래스의 메소드이기 때문에, 자식인 Point 클래스에서도 사용할 수 있다
		
		System.out.println(p1 == p2);	//false == 연산자는 좌항과 우항의 주소값을 비교하고 있으므로
		System.out.println(p2 == p3);	//false == 연산자는 좌항과 우항의 주소값을 비교하고 있으므로
		System.out.println(p3 == p4);	//false == 연산자는 좌항과 우항의 주소값을 비교하고 있으므로
		System.out.println(p4 == p1);	//true == p4 = p1 에서 p4의 참조값에 p1의 주소값을 넣었으므로	
		System.out.println(p1.equals(p2));	//false Object 클래스의 .equals는 기본적으로 객체 간의 주소값을 비교하여 준다 
		System.out.println(p4.equals(p1));	//true Object 클래스의 .equals는 기본적으로 객체 간의 주소값을 비교하여 준다
											//이 경우, p4는 p1과 완전히 동일한 주소값을 갖고 있으므로 true가 나온다
	}

}


