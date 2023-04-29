package section03;
/*
 * 2. 증감연산자
 * 	++: 1씩 증가
 * 	--: 1씩 감소
 * 
 * 
 */
public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num); //출력 1
		num++; //증감연산자 1증가
		System.out.println(num); //출력 2
		//전위 증감연산자
		System.out.println(++num); //출력 3
		//후위 증감연산자
		System.out.println(num++); // 출력 3 프린트를 실행하고 증감됨.
		//num = 4 
		System.out.println(num); //출력 4
		
	}

}
