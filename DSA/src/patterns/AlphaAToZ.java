package patterns;

public class AlphaAToZ {
	
	static void pattern(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n;j++) {
				if(k<=26)
				System.out.print((char)(64+k)+" ");
				k++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		pattern(6);
		
	}

}

/* OUTPUT:

A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y 
Z  

 */
