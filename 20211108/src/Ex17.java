
public class Ex17 {
	public static void main(String[] args) {
		int [] i = {1,2,3,4,5,6};
		
		String [] str = {"이숭무","이상법","이장법","김찬중"};
		
		double [] d = {10.5, 20.6, 40.7, 200.8};
		
		WEEK1 [] days = WEEK1.values();// WEEK1 [월요일,화요일....]
	
		String [][] locations = {{"영등포", " 노량진","종로"},
								{"가", "나", "다"},
								{"모란","수내","미금"}};
		
		int [][] vals = {{1,2,3},{4,5},{6,7,8,9}};
		
		for(int k = 0; k < locations.length; k++) {
			for(int j = 0; j < locations[k].length; j++) {
				System.out.println("location["+k+"]["+j+"] : "+locations[k][j]);
			}
		}
		
		for(int k = 0; k < vals.length; k++) {
			for(int j = 0; j < vals[k].length; j++) {
				System.out.println("location["+k+"]["+j+"] : "+vals[k][j]);
			}
		}
		
		for(String [] loc : locations) {
			for(String s : loc) {
				System.out.println(s);
			}
		}
		
		for(int [] val : vals) {
			for(int s : val) {
				System.out.println(s);
			}
		}
		
	}
}
