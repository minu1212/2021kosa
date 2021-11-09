
public class MemberTest {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member(10);
		Member m3 = new Member("이승무");
		Member m4 = new Member(10,17.5,"이상범");
		Member m5 = new Member(175.5,20,"박준현");
		
		
		String name = m1.getName();
		System.out.println(name);
		
		
		name = m2.getName();
		System.out.println(name);
		
		m3.setAge(50);
		m3.setHeight(176.5);
		int age = m3.getAge();
		double height = m3.getHeight();
		System.out.println(age);
		System.out.println(height);
	}
}
