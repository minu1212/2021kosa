
public class Board {
	// 번호, 제목, 글쓴이, 내용, 글쓴이의 ip주소, 방문자수
	// 멤버필드
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readerCount;

	public Board() {
	}

	// 생성자 : alt + shift + s > o
	public Board(int num, String subject, String writer, String content, String ip, int readerCount) {
		this.num = num;
		this.subject = subject;
		this.writer = writer;
		this.content = content;
		this.ip = ip;
		this.readerCount = readerCount;
	}

	// 메소드
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
