package section02;
/*
 * 2. 문자형(char)
 * 	문자 한글자 저장가능
 * 	전 세계에서 쓰이는 문자 형태 대부분 표현 가능
 * 	데이터를 작은 따옴표 ''로 감쌈 ex) 'a', '가'
 *  2byte
 *  
 *  
 * 선언 방법
 *  char 변수명;
 * 
 * 
 */

public class Variable02 {
	public static void main(String[] args) {
		//char 형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		System.out.println("char형 변수에 저장된 문서:" + ch1);
		
		char ch2 = '金';
		char ch3 = '뷁';
		
		int num = ch1; //char형을  int 정수형으로  형변환
		System.out.println("대문자 A에 해당하는 숫자코드: " + num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자:" + ch4);
		
		int num2 = 110;
		char ch5 = (char)num2; //int형을 char형으로 강제 형변환
		System.out.println(ch5);
	}
}
