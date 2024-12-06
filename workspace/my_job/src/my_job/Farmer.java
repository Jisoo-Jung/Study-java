package my_job;

import java.util.Random;

//<기획>
//
//농부
//
//1. 심고 거둔다.
//2. 정보 확인
//3. 종료
//
//<랜덤>
//주의!! 날씨(태풍)
//건강하게 잘 자라는 경우도 랜덤
//   
//1. 심기
//      심을 작물의 갯수 : 
//2. 기르기
//      물주기/잡초뽑기/약제살포
//
//*태풍 경보! 태풍을 대비하세요! //태풍 no 80%, 태풍 20%
//1. 버팀목 설치 및 비닐터널로 고정하자!
//2. 대비하는 것 귀찮고 힘들어 안할래~
//
//*태풍 발생
//1. 매우 강력한 태풍이었다. 태풍 대비를 하였지만 작물의 반이 날라갔다. 50%
//2. 매우 강력한 태풍이었다. 태풍 대비를 안해서 작물이 다 날라갔다. 50%
//
//3. 강력한 태풍이었다. 태풍 대비를 하여서 작물을 무사히 보호하였다. 50%
//4. 강력한 태풍이었다. 태풍 대비를 안해서 작물의 반이 날라갔다. 50%
//
//10회 때마다 수확//
//
//3. 정보 확인
//      심은 작물 갯수 
//      태풍에 날아간 작물 갯수
//		수확한 작물 갯수
//
//4. 수확한 작물 정보
//건강하게 잘 자란 작물 : 1개 (단가: 1000원)
//비실비실 겨우 자란 작물 : 1개 (단가: 500원)
//예상 수익금 : 

public class Farmer {
	String name;
	int plantCount;
	int harvestCount;
	int beBlownCount;
	int money;
	int rating;
	int rating2;
	int rating3;
	int rank;
	int goodHarvest;
	int sosoHarverst;
	

	public Farmer(String name, int money, int rating, int rating2, int rank) {
		this.name = name;
		this.money = money;
		this.rating = rating;
		this.rating2 = rating2;
		this.rank = rank;
	}

	boolean move(){
		Random random = new Random();
		int[] arData = new int[10];
		int randomIndex = 0;
		
		for (int i = 0; i < rating / 10; i++) {
			arData[i] = 1;
		}
		
		randomIndex = random.nextInt(arData.length);
		
		if(arData[randomIndex] == 1) {
			return true;
		}
		
		return false;
	}
	
	boolean typhoon(){
		Random random = new Random();
		int[] arData = new int[10];
		int randomIndex = 0;
		
		for (int i = 0; i < rating2 / 10; i++) {
			arData[i] = 1;
		}
		
		randomIndex = random.nextInt(arData.length);
		
		if(arData[randomIndex] == 1) {
			return true;
		}
		
		return false;
	}
	
	boolean typhoon1(){
		Random random = new Random();
		int[] arData = new int[10];
		int randomIndex = 0;
		
		for (int i = 0; i < 50 / 10; i++) {
			arData[i] = 1;
		}
		
		randomIndex = random.nextInt(arData.length);
		
		if(arData[randomIndex] == 1) {
			return true;
		}
		
		return false;
	}
	
	boolean typhoon2(){
		Random random = new Random();
		int[] arData = new int[10];
		int randomIndex = 0;
		
		for (int i = 0; i < 50 / 10; i++) {
			arData[i] = 1;
		}
		
		randomIndex = random.nextInt(arData.length);
		
		if(arData[randomIndex] == 1) {
			return true;
		}
		
		return false;
	}
	
	
	
	void printInfo() {
		String infoMessage = "심은 작물 갯수: " + this.plantCount + "개\n"
				+ "태풍에 날아간 작물 갯수: " + this.beBlownCount + "개\n"
						+ "수확된 작물 갯수: " + this.harvestCount + "개";
		System.out.println(infoMessage);
	}
	
	void harvestInfo() {
		String infoMessage = "건강하게 잘 자란 작물: " + this.goodHarvest + "개(단가: 1,000원)\n"
				+ "비실비실 겨우 자란 작물: " + this.sosoHarverst + "개(단가: 500원)\n"
						+ "예상 수익금: " + this.money + "원";
		System.out.println(infoMessage);
	}
}

