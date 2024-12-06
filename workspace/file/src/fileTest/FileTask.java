package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
		final String PATH = "fish.txt";
		
		
//		생선 종류를 출력한 뒤
//		입력받은 내용을 모두 출력한다.
//		현재 경로에 fish.txt 이름의 파일로 생성한다.
//		생선은 3개 출력한다.
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fish.txt"));
//		
//		bufferedWriter.write("고등어\n");
//		bufferedWriter.write("참돔\n");
//		bufferedWriter.write("광어\n");
//		
//		bufferedWriter.close();
		
//		참돔을 연어로 수정
		
//		BufferedReader bufferedReader = null;
//		String temp = "";
//		
//		try {
//			bufferedReader = new BufferedReader(new FileReader("fish.txt"));
//		} catch (FileNotFoundException e) {
//			System.out.println("경로를 확인해주세요.");
//		}
//		
//		String line = null;
//		
//		while((line = bufferedReader.readLine()) != null) {
//			if(line.equals("참돔")) {
//				temp += "연어\n";
//				continue;
//			}
//			temp += line + "\n";
//		}
		
//		bufferedReader.close();
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH));
//		bufferedWriter.write(temp);
//		bufferedWriter.close();
		
//		고등어 삭제
		BufferedReader bufferedReader = null;
		String temp = "";
		
		try {
			bufferedReader = new BufferedReader(new FileReader("fish.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("경로를 확인해주세요.");
		}
		
		String line = null;
		
		while((line = bufferedReader.readLine()) != null) {
			if(line.equals("고등어")) {
				continue;
			}
			temp += line + "\n";
		}
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH));
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
}


















