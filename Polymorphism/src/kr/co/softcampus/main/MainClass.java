package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	// 다형성의 문제점
	// 참조 변수 선언 부분은 수정하지 않아도 되지만 객체를 생성하는 부분의 코드는 변경되어 한다.
	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldKo(); // new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldKo(); // new HelloWorldEn();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
