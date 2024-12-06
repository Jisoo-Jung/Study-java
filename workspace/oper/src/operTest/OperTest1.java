package operTest;

public class OperTest1 {
	public static void main(String[] args) {
		
		boolean isTrue = 10 == 11;
		boolean result = isTrue && 10 <= 20;
		
		System.out.println(10 == 11);
		System.out.println(10 > 3);
		System.out.println(isTrue);
		
		System.out.println("=====================");
		
		System.out.println(result);
		
//		isTrue && 10 <= 20 의 결과를 true가 나오게 변경하기
		System.out.println(isTrue || 10 <= 20);
		System.out.println(!isTrue && 10 <= 20);
	}
}













