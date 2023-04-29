package section03;
/*
 * 6. 비트연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 * 	& : 대응되는 비트가 모두 1이면 1을 반환(비트 AND연산자)
 *  | : 대응되는 비트중에서 하나라도 1이면 1을 반환(비트 OR연산자)
 *  ^ : 대응되는 비트가 서로 다르면 1을 반환 (비트 XOR연산자)
 *  ~ : 비트가 1이면 0으로, 0이면 1로 반전시킴(비트 NOT연산자)
 *  
 *  7. 쉬프트 연산자
 *  << : 저장한 수 만큼 비트들을 전부 왼쪽으로 이동시킴(left shift 연산자)
 *  >> : 부호를 유지하면서 지정한 수 만큼 비트를 전부 오른쪽으로 이동시킴(right shift 연산자)
 * 
 */
public class Operator06 {
	public static void main(String[] args) {
		int num1 = 3; // 0 0011
		int num2 = 5; // 0 0101
		
		System.out.println("num1 & num2 :" + (num1 &num2));
		System.out.println("num1 | num2 :" + (num1 | num2));
		System.out.println("num1 ^ num2 :" + (num1 ^ num2));
		// 3 -> 0 0011
		// ~ -> 1 1100
 		System.out.println("~num1:" + ~num1);
 		
 		int x, y;
 		x = 3; //0011
 		y = x << 2; //1100 -> 12
 		System.out.printf("%d << 2 = %d\n", x, y);
 		y = x >> 2; // 0000 -> 0
 		System.out.printf("%d >> 2 = %d\n", x, y);
 		
 		
		
	}

}
