package section07;
/*
 * OOP (Object Oriented Programming)
 * - 객체지향프로그래밍
 * - 프로그램을 작성할 때 데이터와 데이터를 조작하는 메소드(함수)를
 * 	 하나의 논리적 단위인 객체로 묶는 방식
 * 
 *  객체(Object)
 *  - 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서
 *    정의 가능하고 식별 가능한 것을 말함
 *
 *  ex) 물리적인 객체 - 사람, 모니터, 상품, 회원
 * 		추상적인 객체 = 주문, 회계장부, 생산 등..
 * 
 * 객체의 구성요소
 * 1) 속성
 * 2) 기능
 * 
 * ex) 티모 (객체)
 * 	- 속성 : 공격력 10 / 방어력 3 / hp 800
 *  - 기능 : 
 * Class
 * -객체를 만들기 위한 설계도
 * -Class에 작성된 코드를 읽어 인스턴스(객체)화 한다 => 메모리에 저장 또는 업로드
 * 
 * 
 * 클래스 구조
 * (접근제한자) class 클래스명 (extends 상숙) (implements 인터페이스 상속) { //클래스 선언부
 * 		(생성자) => 초기화 목적
 *      변수(멤버변수, 멤버필드) => 속성
 * 		메소드(멤버 메소드) => 기능
 * 
 * }
 * 
 * 	객체화 - new연산자로 인스턴스화 가능
 * 	클래스명(타입) 변수명 = new 클래스();
 * 
 * 
 */

public class OOP01 {
	public static void main(String[] args) {
		Car c = new Car(); // 클래스 이용해서 객체 생성
		Car c2 = new Car(); // 새로운 메모리 생성
		
		System.out.println("wheel의 개수는" + c.wheel+"개 입니다");
		System.out.println("c2 wheel의 개수는" + c2.wheel+"개 입니다");
		
		c.wheel=12;
		System.out.println("wheel의 개수는" + c.wheel+"개 입니다");
		System.out.println("c2 wheel의 개수는" + c2.wheel+"개 입니다");
		
	}

}
