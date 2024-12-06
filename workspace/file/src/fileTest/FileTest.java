package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	throws
//	메소드 안에서 반복되는 Exception에 대해 try catch를 작성해야 할 때,
//	메소드를 사용하는 쪽에서 한 번만 try catch를 작성하는 것이 편하다.
//	이럴 때 메소드 소괄호 뒤에 throws를 작성하여 사용하는 쪽으로 해당 예외 처리를 넘겨준다.
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//
//		//		bufferedWriter.write("피자\n");
////		bufferedWriter.write("갈비\n");
//		bufferedWriter.write("불고기");
//		bufferedWriter.newLine();
//		bufferedWriter.write("제육볶음");
//		bufferedWriter.newLine();
//		
//		bufferedWriter.close();
		
		BufferedReader bufferedReader = null;
		String line = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));
			
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하지 않는 파일입니다.");
		}
		bufferedReader.close();
	}
}



















