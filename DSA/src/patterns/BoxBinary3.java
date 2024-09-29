package patterns;

public class BoxBinary3 {
	
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		pattern(5);
		
	}

}

/* OUTPUT:

1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1   
  

 */
