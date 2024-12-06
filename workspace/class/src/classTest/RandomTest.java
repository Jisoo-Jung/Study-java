package classTest;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
//		
//		System.out.println(random.nextInt(5));
		int rating = 30;
		
		int[] arData = new int[10];
		
		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;
		}
		
		if(arData[random.nextInt(arData.length)] == 1) {
//			30% 확률로 들어옴
			System.out.println("주문서 발림");
		}else {
//			70% 확률로 들어옴
			System.out.println("주문서 실패");
		}
	}
}











