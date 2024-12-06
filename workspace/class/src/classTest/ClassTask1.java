package classTest;

import javax.swing.JOptionPane;

// 슈퍼카
class SuperCar {
//	브랜드
	String brand;
//	색상
	String color;
//	가격
	int price;

//	Alt + Shift + s, o
//	초기화할 필드를 체크하고 Generate
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public SuperCar(String brand) {
		this.brand = brand;
	}

//	시동 켜기
	void engineStart() {
//		지역 변수에 같은 이름의 변수가 없다면 this를 생략할 수 있다.
		System.out.println(brand + "시동 켜짐");
	}

//	시동 끄기
	void engineStop() {
	}
}

public class ClassTask1 {

	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("페라리", "빨간색", 75_000);
		SuperCar bentley = new SuperCar("벤틀리");

		System.out.println(ferrari.brand);
		ferrari.engineStart();
		bentley.engineStart();
	}
}
