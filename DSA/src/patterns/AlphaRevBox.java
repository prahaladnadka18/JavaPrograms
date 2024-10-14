package patterns;

public class AlphaRevBox {

	static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>0;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		pattern(5);

	}

}

/* OUTPUT:

E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A         


 */