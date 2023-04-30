package section05;
/*
 * 중첩 for문
 * 	for문 안에 for문
 * 
 */
public class Loop05 {
	public static void main(String[] args) {
		/*
		 * i = 0 -> true ->
		 *  j = 0 -> true -> print (*) ->
		 *  j = 1 -> true -> print (*) ->
		 *  j = 2 
		 *  .
		 *  .
		 *  .
		 *  .
		 *  j =7 -> false -> 반복문 종료 
		 * -> 개행 (줄 바꿈)
		 *  
		 * i = 1 -> true ->
		 *  j= 0 -> true -> print (*) ->
		 *  .
		 *  .
		 * i = 7 -> false -> 반복문 종료
		 * 
		 *   j 0 1 2 3 4 5 6 
		 * i)0 * * * * * * *
         * i)1 * * * * * * *
         * i)2 * * * * * * *
         * i)3 * * * * * * *
         * i)4 * * * * * * *
         * i)5 * * * * * * *
         * i)6 * * * * * * *
		 * 
		 */
		for(int i = 0; i < 7 ; i++) {
			
			for(int j = 0; j< i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(); // 개행
		}
		/* i : 0 ~ 7
		 * i = 0
		 * 		j : 0+ 1 = 1
		 * 	    j = 0
		 *      *
		 * i = 1
		 *  	j= 0, 1
		 *  	**
		 * 
		 * print 시 
		   *
           **
           ***
           ****
           *****
           ******
           ******* 
		 */
	}   
	

}
