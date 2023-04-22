package section01;
/* 여러줄 주석
 *
 *
 */

public class Hello {
		public static void main(String[] args) {
			// 한줄 주석
			System.out.println("Hello, JAVA!!!");
			
			printNum(422);
		}
		
		/**
		 * JavaDoc주석 - 입력받은 정수 출력
		 * 
		 * @param num
		 */
		public static void printNum(int num) {
			System.out.println("num: " + num);
		}
}
