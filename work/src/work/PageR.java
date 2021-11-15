package work;

public class PageR {
	int pasnum;
	int reader;
	String name;
	String head;
	String content;

	// default 생성자
	public PageR() {

	}

	// 글작성 페이지 사용 생성자

	public PageR(int pasnum, int reader, String name, String head, String content) {
		super();
		this.pasnum = pasnum;
		this.reader = reader;
		this.name = name;
		this.head = head;
		this.content = content;
	}

	
	public int getPasnum() {
		return pasnum;
	}

	public void setPasnum(int pasnum) {
		this.pasnum = pasnum;
	}

	public int getReader() {
		return reader;
	}

	public void setReader(int reader) {
		this.reader = reader;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

}
