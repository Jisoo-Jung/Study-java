package ambiguity;

public class ClassC implements InterA, InterB{
	
	@Override
	public void printName() {
		InterB.super.printName();
	}
	
	public static void main(String[] args) {
		
		new ClassC().printName();
	}
	
}
