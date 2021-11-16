package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {
	public static void main(String[] args) throws IOException {//파일에 내용 추가하기
		FileWriter fw = new FileWriter("ouput1.txt", true);// true를 추가해주면 override가 아닌 appen를 할수있다.
		for (int i = 11; i < 20; i++) {
			fw.write(i + "번째 입니다.\n");
		}
		fw.close();
	}
}
