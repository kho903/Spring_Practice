package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// 자바 프로젝트의 문제점
		// 클래스가 변경되면 객체 생성 부분과 참조 변수 선언 부분 모두를 수정해야 한다.
//		HelloWorldEn hello1 = new HelloWorldEn();
//		callMethod(hello1);
//		HelloWorldEn hello2 = new HelloWorldEn();
//		callMethod(hello2);
		
		HelloWorldKo hello3 = new HelloWorldKo();
		callMethod(hello3);
		HelloWorldKo hello4 = new HelloWorldKo();
		callMethod(hello4);
	}
	
//	public static void callMethod(HelloWorldEn hello) {
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}

}
