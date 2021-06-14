package com.javaex.ex08;

public class Friend {

//	필드
	private String name;
	private String hp;
	private String school;
	
//	생성자
	public Friend(String _friendInfo) {
		String[] fArray = _friendInfo.split(" ");
		this.name = fArray[0];
		this.hp = fArray[1];
		this.school = fArray[2];
	}
	
//	메소드 일반
	
	public void showInfo() {
		System.out.println("이름:" + this.name + " 핸드폰:" + this.hp + " 학교:" + this.school);
	}
	
}
