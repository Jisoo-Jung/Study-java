package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 3.56, 'A', false, "ABC"
//		위의 5개 값을 하나의 배열에 모두 담는다.
		Object[] arObject = {1, 3.56, 'A', false, "ABC"};
		
		for (int i = 0; i < arObject.length; i++) {
			System.out.println(arObject[i]);
		}
	}
}
