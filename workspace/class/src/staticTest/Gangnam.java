package staticTest;

public class Gangnam {
	public static void main(String[] args) {
		Company 박슬기 = new Company();
		Company 하민지 = new Company();
		Company 최대환 = new Company();
		
//		박슬기.income = 1_000_000;
//		하민지.income = 500_000;
//		최대환.income = 1_500_000;
		
//		Company.totalIncome = 박슬기.income + 하민지.income + 최대환.income;

		박슬기.getIncome(1_000_000);
		하민지.getIncome(500_000);
		최대환.getIncome(1_500_000);
		
		System.out.println(Company.totalIncome);
	}
}
