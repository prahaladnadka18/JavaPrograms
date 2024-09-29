package patterns;

public class AlphaPattern {

	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				if(j%2==0)
					System.out.print("A ");
				else
					System.out.print("B ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		pattern(5);

	}

}

/* OUTPUT:

A B A B A 
A B A B A 
A B A B A 
A B A B A 
A B A B A 

 */
