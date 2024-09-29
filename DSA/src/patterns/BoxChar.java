package patterns;

public class BoxChar {
	
	static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("A ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		pattern(5);
		
	}

}

