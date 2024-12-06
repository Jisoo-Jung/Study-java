package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		String message = "두 정수를 입력하세요.\n예)1 4";
		boolean condition1 = false, condition2 = false;
		String result = null;
		
		System.out.println(message); 
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		condition1 = number1 > number2;
		condition2 = number2 > number1;
		
		if(condition1) {
			result = "큰 값: " + number1;
		}
		else if(condition2) {
			result = "큰 값: " + number2;
		}
		else {
			result = "두 수가 같습니다.";
		}
		
		System.out.println(result);
	}
}

















