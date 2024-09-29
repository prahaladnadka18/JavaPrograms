package patterns;

public class BoxBinary2 {
	
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		pattern(5);
		
	}

}
