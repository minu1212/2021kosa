package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {
	public static void main(String[] args) throws IOException {//���Ͽ� ���� �߰��ϱ�
		FileWriter fw = new FileWriter("ouput1.txt", true);// true�� �߰����ָ� override�� �ƴ� appen�� �Ҽ��ִ�.
		for (int i = 11; i < 20; i++) {
			fw.write(i + "��° �Դϴ�.\n");
		}
		fw.close();
	}
}
