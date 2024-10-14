package patterns;

public class NumberRevBox {

	static void pattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=0;j<n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		pattern(5);

	}

}

/* OUTPUT:

5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1       
  

 */
