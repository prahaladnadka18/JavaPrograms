package patterns;

public class AlphaRevBox2 {

	static void pattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<n;j++) {
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

E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A         


 */
