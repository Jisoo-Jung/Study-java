package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		브론즈
//		1 ~ 10까지 배열에 담고 출력
//		10번 반복하는 for문 만들기
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//			arData[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
//		10 ~ 1까지 중 짝수만 배열에 담고 출력
//		int[] arData = new int[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		1 ~ 100까지 배열에 담은 후 홀수만 출력
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
		
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 2 == 1) {
//				System.out.println(arData[i]);
//			}
//		}
		
//		for (int i = 0; i < 50; i++) {
//			System.out.println(arData[i * 2]);
//		}
		
//		실버
//		1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[100];
//		int result = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			if (arData[i] % 2 == 0) {
//				result += arData[i];
//			}
//		}
//		
//		System.out.println(result);
		
		
//		A ~ F까지 배열에 담고 출력
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		비교하기 위해서는 항이 2개가 필요하다.
		
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//		String message = "5개의 정수를 입력하세요.\n예)1 3 2 4 6";
//		int max = 0, min = 0;
//		
//		System.out.println(message);
//		
////		사용자가 length만큼 값을 입력한다. 
//		for (int i = 0; i < arData.length; i++) {
////			각 방에 순서대로 입력한 값을 저장한다.
//			arData[i] = sc.nextInt();
//		}
//		
////		입력이 끝나면, 첫번째 방에 있는 값을 max와 min에 각각 담아준다.
////		(다른 값과의 비교를 위해)
//		max = arData[0];
//		min = arData[0];
//		
////		이미 max와 min에 0번째 값을 담아놓았기 때문에, 1부터 시작한다.
//		for (int i = 1; i < arData.length; i++) {
////			max에 담긴 값과 다른 값들을 비교하여, 
////			max에 담긴 값보다 더 큰 값이 있다면,
//			if(max < arData[i]) {
////				기존에 있던 max 값을 더 큰 값인 arData[i]값으로 대체한다.
//				max = arData[i];
//			}
//			
////			min에 담긴 값과 다른 값들을 비교하여, 
////			min에 담긴 값보다 더 작은 값이 있다면,
//			if(min > arData[i]) {
////				기존에 있던 min 값을 더 작은 값인 arData[i]값으로 대체한다.
//				min = arData[i];
//			}
//		}
//		
////		반복문이 다 끝났다는 것은 최대와 최소값이 모두 구해졌다는 것을 의미한다.
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
//		
		
		
//		다이아
//		사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
		int[] arData = null;
		Scanner sc = new Scanner(System.in);
		String message1 = "몇 개의 정수를 입력하시나요?";
		String message2 = "번 정수: ";
		
		int size = 0, total = 0;
		
//		사용자에게 칸 수를 입력받는다.
		System.out.println(message1);
		size = sc.nextInt();
		
//		사용자가 입력한 칸 수만큼 배열을 Heap 메모리에 할당한다.
		arData = new int[size];
		
//		만들어진 칸 수만큼 정수를 입력받는다.
		for (int i = 0; i < arData.length; i++) {
			System.out.print(i + 1 + message2);
			arData[i] = sc.nextInt();
		}
		
//		입력이 끝나면, 모든 값을 누적해서 총 합을 구한다.
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		
//		전체 개수로 나누어서 평균을 구한 뒤 출력한다.
		System.out.println((double)total / arData.length);
	}
}














