package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {
	// ���ڿ��� ����
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("ouput1.txt");
		f.write("1��° �Դϴ� \n");
		f.write("2��° �Դϴ� \n");
		f.write("3��° �Դϴ� \n");

		for (int i = 1; i <= 10; i++) {
			f.write(i + "��° �Դϴ�.\n");
		}
		
		f.close();
	}

}
