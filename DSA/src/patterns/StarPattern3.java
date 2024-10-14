package patterns;

public class StarPattern3 {

	static void pattern(int n) {

		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {

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

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 


 */


