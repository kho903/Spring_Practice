package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	public void method1() throws Exception {
		// 예외 호출 코드
//		int a = 1/ 0;
		System.out.println("TestBean1의 method1 호출");
	}
}
