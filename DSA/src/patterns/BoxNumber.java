package patterns;

public class BoxNumber {
	
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		pattern(9);
		
	}

}

/* OUTPUT:

1 1 1 1 1 1 1 1 1 
2 2 2 2 2 2 2 2 2 
3 3 3 3 3 3 3 3 3 
4 4 4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 
6 6 6 6 6 6 6 6 6 
7 7 7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9     
  

 */
