package classTest;

class Result {
	int max;
	int min;

	public Result() {
		;
	}
}

public class ClassTask4 {
	void getMaxAndMin(int[] arData, Result result) {

		result.max = arData[0];
		result.min = arData[0];

		for (int i = 1; i < arData.length; i++) {
			if (result.max < arData[i]) {
				result.max = arData[i];
			}

			if (result.min > arData[i]) {
				result.min = arData[i];
			}
		}
	}
	
	public static void main(String[] args) {
		Result result = new Result();
		ClassTask4 classTask4 = new ClassTask4();
		classTask4.getMaxAndMin(new int[] {3, 6, 2, 1, 7}, result);
		
		System.out.println(result.max);
		System.out.println(result.min);
	}
	
	
}


















