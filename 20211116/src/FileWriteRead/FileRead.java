package FileWriteRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	// 문자열
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("out.txt");
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			//한줄식 데이터 블러오기 readLine()
			String line = br.readLine();
			if (line == null)
				//불러올 값이 없으면 break
				break;
			System.out.println(line);
		}
	}
}
