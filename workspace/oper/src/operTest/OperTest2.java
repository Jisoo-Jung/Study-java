package operTest;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		두 정수 입력받기
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
//		int result = 0;
		String result = null;
		String message = "두 정수를 입력하세요.\n예)1 4";
		
		System.out.println(message); 
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
//		두 정수 비교
		
//		참과 거짓 자리에 들어갈 값은 자료형이 서로 달라도 된다.
//		System.out.println(number1 > number2 ? "큰 값:" + number1 : number2);
		
//		result = number1 > number2 ? number1 : number2;
//		System.out.println(result);
		
		result = number1 > number2 ? "큰 값: " + number1 : 
			number1 == number2 ? "두 수가 같습니다." : "큰 값: " + number2;
		
		System.out.println(result);
	}
}















