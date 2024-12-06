package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		new LambdaInter() {
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				number % 10 == 0;
//			}
//		};
		LambdaInter lambdaInter = (number) -> number % 10 == 0;
		System.out.println(lambdaInter.checkMultipleOf10(97));
	}
}
