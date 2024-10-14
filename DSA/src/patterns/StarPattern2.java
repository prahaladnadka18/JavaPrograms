package patterns;

public class StarPattern2 {

	static void pattern(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
		
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		pattern(5);

	}

}

/* OUTPUT:

* * * * * 
* * * * 
* * * 
* * 
* 
    


 */


