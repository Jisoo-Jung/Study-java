package inheritanceTest;

class Animal {
	String name;
	int age;
	String feed;
	
	public Animal() {;}
	
	public Animal(String name, int age, String feed) {
		super();
		this.name = name;
		this.age = age;
		this.feed = feed;
	}

	void walk() {
		System.out.println("걷기");
	}
	
	void run() {
		System.out.println("뛰자");
	}
	
	void eat() {
		System.out.println("먹자");
	}
}

class Lion extends Animal {
	
	public Lion() {;}
	
	void hunt() {
		System.out.println("사냥하기");
	}
	
//	재정의할 부모의 메소드 이름을 적당히 작성한 뒤 Ctrl + space 입력
	@Override // 어노테이션
	void walk() {
		System.out.println("네 발로");
		super.walk();
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		
		lion.walk();
		lion.hunt();
		lion.eat();
	}
}













