package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1.통신요금조회\n2.번호변경\n3.통신사변경\n0.상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println(message);
			choice = sc.nextInt();
			
			System.out.println("들어옴");
		} while(choice != 0);
		
	}
}
