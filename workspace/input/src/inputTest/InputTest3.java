package inputTest;

import java.util.Scanner;

public class InputTest3 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//		nextInt(): 사용자가 입력한 정수 값
		
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
		String message = "3개의 정수를 아래와 같이 입력해주세요.";
		String exampleMessage = "예)1 3 5", format = "%d + %d + %d = %d";		
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		
		result = number1 + number2 + number3;
		
		System.out.printf(format, number1, number2, number3, result);
	}
}









