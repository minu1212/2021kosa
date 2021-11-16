package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {
	// 문자열로 저장
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("ouput1.txt");
		f.write("1번째 입니다 \n");
		f.write("2번째 입니다 \n");
		f.write("3번째 입니다 \n");

		for (int i = 1; i <= 10; i++) {
			f.write(i + "번째 입니다.\n");
		}
		
		f.close();
	}

}
