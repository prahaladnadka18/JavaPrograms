package patterns;

public class NumberRev2 {

	static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		pattern(5);

	}

}

/* OUTPUT:

5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1        


 */