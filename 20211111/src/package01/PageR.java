package package01;

public class PageR {
	int num;
	String name;
	String head;
	int read;
	String content;
			
	//default 생성자
	public PageR() {

	}
	
	//글작성 페이지 사용 생성자
	public PageR(String name, String head, String content) {
		this.name = name;
		this.head = head;
		this.content = content;
	}
	
	
	public PageR(String name, String head) {
		super();
		this.name = name;
		this.head = head;
	}

	public PageR(int num, String name, String head, int read, String content) {
		this.num = num;
		this.name = name;
		this.head = head;
		this.read = read;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getRead() {
		return read;
	}

	public void setRead(int read) {
		this.read = read;
	}
	
	
	
	
}
