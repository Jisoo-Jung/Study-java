package set.test;

import java.util.HashSet;

public class SetTask {
	public static void main(String[] args) {
//		태극기 색깔
//		흰색, 검은색, 빨간색, 파란색
//		HashSet 자료구조의 메소드 사용하기
//		HashSet에서 중복검사를 진행할 때에는 hashCode로 비교하기 때문에,
//		객체끼리의 비교가 아닌, 원하는 필드의 비교를 원한다면 hashCode()를 재정의 해야한다.
		HashSet<Color> colors = new HashSet<Color>();
		
		Color[] arColor = {
				new Color(1, "흰색"),
				new Color(2, "검은색"),
				new Color(3, "빨간색"),
				new Color(4, "파란색")
		};
		
		for (int i = 0; i < arColor.length; i++) {
			colors.add(arColor[i]);
		}
		
		System.out.println(colors.size());
		
		colors.add(new Color(1, "흰색"));
		
		System.out.println(colors.size());
		
	}
}
















