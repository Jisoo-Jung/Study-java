package my_job;

import java.util.Scanner;



public class jobTest {
	public static void main(String[] args) {
		String title = "<<농사의 달인이 되자>>";
		String message = "1. 심기\n2. 기르기\n3. 정보 확인\n4. 수확한 작물 정보\n5. 종료";
		String message2 = "1. 버팀목 설치!! 비닐터널로 고정!!\n2. 대비하는 것 귀찮고 힘들어 안할래...";
		String typhoonMessage1 = "매우 강력한 태풍이었다. 태풍 대비를 하였지만 작물의 반이 날라갔다.\n";
		String typhoonMessage1_2 = "매우 강력한 태풍이었다. 태풍 대비를 안해서 작물이 다 날라갔다.\n";
		String typhoonMessage2 = "강력한 태풍이었다. 태풍 대비를 하여서 작물을 무사히 보호하였다.\n";
		String typhoonMessage2_2 = "강력한 태풍이었다. 태풍 대비를 안해서 작물의 반이 날라갔다.\n";
		Scanner sc = new Scanner(System.in);
		Farmer farmer = new Farmer("정지수", 0, 70, 20, 0);
		
		int choice = 0;
		int typhoonChoice = 0;
		int goodHarvest = 0, sosoHarverst = 0;
		int plantCount = 0;
		
		while(true) {
			System.out.println(title);
			System.out.println(message);
			choice = sc.nextInt();
			
			if(choice == 5) {
				break;
			}
			
			if(choice == 1) {
				String infoMessage = "심은 작물 갯수: ";
				System.out.print(infoMessage);
				plantCount = sc.nextInt();
			}
			
			switch(choice) {
			case 2: 
				if(farmer.move()) {
					System.out.println("!!물주기/잡초뽑기/약제살포!!\n");
					farmer.money += 1_000;
					farmer.goodHarvest ++;
					goodHarvest++;
					sosoHarverst = 0;
					
					farmer.money += 500;
					farmer.sosoHarverst ++;
					sosoHarverst ++;
					goodHarvest = 0;
					
					if(farmer.typhoon()) {
						System.out.println("*****!!태풍 경보!!*******");
						System.out.println("*****!!태풍 경보!!*******");
						System.out.println("*****!!태풍 경보!!*******");
						System.out.println("*****!!태풍 경보!!*******");
						System.out.println("*****!!태풍 경보!!*******");
						System.out.println("*****!!태풍 경보!!******");
						System.out.println("***!!태풍을 대비하세요!!****\n");
						
						System.out.println(message2);
						typhoonChoice = sc.nextInt();
						
						switch(typhoonChoice) {
							case 1: if(farmer.typhoon1()) {
								System.out.println(typhoonMessage1);
								break; 
							}
								System.out.println(typhoonMessage1_2);
							break; 

							case 2: if(farmer.typhoon2()) {
								System.out.println(typhoonMessage2);
								break; 
							}
								System.out.println(typhoonMessage2_2);
								break; 
							}
						}
				
				
					}
			
					break;
				
			case 3 :
				farmer.printInfo();
				break;
			case 4 :
				farmer.harvestInfo();
				break;
			}
			
		}
	}
}

		
		
	



