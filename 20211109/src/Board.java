
public class Board {
	// ��ȣ, ����, �۾���, ����, �۾����� ip�ּ�, �湮�ڼ�
	// ����ʵ�
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readerCount;

	public Board() {
	}

	// ������ : alt + shift + s > o
	public Board(int num, String subject, String writer, String content, String ip, int readerCount) {
		this.num = num;
		this.subject = subject;
		this.writer = writer;
		this.content = content;
		this.ip = ip;
		this.readerCount = readerCount;
	}

	// �޼ҵ�
	// getter,setter : alt + shift + s > R
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getReaderCount() {
		return this.readerCount;
	}

	public void setReaderCount(int readerCount) {
		this.readerCount = readerCount;
	}

}
