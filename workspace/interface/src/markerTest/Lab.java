package markerTest;

public class Lab {
	public void checkKinds(Animal[] arAnimal) {
		for (int i = 0; i < arAnimal.length; i++) {
			if(arAnimal[i] instanceof CarnivoreMarker) {
				System.out.println("육식 동물");
			}else if(arAnimal[i] instanceof HerbivoreMarker) {
				System.out.println("초식 동물");
			}else {
				System.out.println("잡식 동물");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Animal[] arAnimal = {
				new Dog(),
				new Bear(),
				new Tiger(),
				new Cow()
		};
		
		new Lab().checkKinds(arAnimal);
	}
}













