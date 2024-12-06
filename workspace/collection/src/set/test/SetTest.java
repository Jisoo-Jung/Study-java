package set.test;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
//		HashSet<String> bloodTypeSet = new HashSet<String>();
//		
//		bloodTypeSet.add("A");
//		bloodTypeSet.add("B");
//		bloodTypeSet.add("AB");
//		bloodTypeSet.add("O");
//		bloodTypeSet.add("O");
//		bloodTypeSet.add("O");
//		bloodTypeSet.add("O");
//		
//		System.out.println(bloodTypeSet.toString());
//		System.out.println(bloodTypeSet.size());
//		System.out.println(bloodTypeSet.contains("C"));
		
//		회원들의 혈액형만 모아놓은 List이다.
		ArrayList<String> userBloodTypes = new ArrayList<String>();
		HashSet<String> bloodTypeSet = null;
		ArrayList<String> bloodTypeResults = null;
		
//		List에는 당연히 중복된 데이터가 들어간다.
		userBloodTypes.add("A");
		userBloodTypes.add("A");
		userBloodTypes.add("A");
		userBloodTypes.add("A");
		userBloodTypes.add("B");
		userBloodTypes.add("O");
		userBloodTypes.add("AB");
		
//		중복을 제거하기 위해 Collection 타입의 userBloodTypes를 HashSet 생성자에 전달한다.
		System.out.println(userBloodTypes);
		bloodTypeSet = new HashSet<String>(userBloodTypes);
		
//		중복이 제거된 것을 확인한다.
		System.out.println(bloodTypeSet);
		
//		값을 다시 가져와서 사용하기 위해 ArrayList로 변경해준다.
		bloodTypeResults = new ArrayList<String>(bloodTypeSet);
//		중복이 제거된 데이터를 가져와서 사용한다.
		for (int i = 0; i < bloodTypeResults.size(); i++) {
			System.out.println(bloodTypeResults.get(i));
		}
	}
}























