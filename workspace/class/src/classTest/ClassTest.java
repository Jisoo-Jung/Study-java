package classTest;

class A {
//	전역 변수
	int data;
	
//	지역 변수
	A(int data){
		System.out.println("생성자 호출");
		System.out.println(this);
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
//		객체화
		A a = new A(10);
		A b = new A(20);
		
		a.printData();
		b.printData();
		
//		System.out.println(a);
//		System.out.println(a.data);
//		a.data = 10;
//		System.out.println(a.data);
//		
//		System.out.println(b.data);
//		
//		System.out.println(a);
//		System.out.println(b);
	}
}





























