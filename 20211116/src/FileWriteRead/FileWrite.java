package FileWriteRead;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {//파일입출력
	//byte로 저장
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("out.txt");
		output.write("1번재 입니다.".getBytes());
		output.write("2번재 입니다.".getBytes());
		//for문으로 반복하기
		for (int i = 1; i <= 10; i++) {
			String data = i + "번째 입니다.\n";
			output.write(data.getBytes());
		}
		output.close();
	}
}
