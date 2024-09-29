package patterns;

public class BoxAlpha {
	
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		pattern(5);
		
	}

}

/* OUTPUT:

A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
  

 */
