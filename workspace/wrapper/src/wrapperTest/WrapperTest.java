package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i = 10;
		
//		boxing
//		deprecated: 현재 버전부터는 사용하지 않는 것을 권장한다.
//		Integer data_I = new Integer(data_i);
//		Integer data_I = Integer.valueOf(data_i);
		Integer data_I = data_i;
		
//		unboxing
//		data_i = data_I.intValue();
		data_i = data_I;
	}
}











