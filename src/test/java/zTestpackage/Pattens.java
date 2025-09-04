package zTestpackage;

public class Pattens {

	public static void day_1(int n) {
/*
 		* * * * *
		* * * * *
		* * * * *
		* * * * *
		* * * * *
*/
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		return;
	}
	
	public static void day_2(int n) {
/*
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
*/
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		return;
	}
	
	public static void day_3(int n) {
		
/*		
		* * * * *
		* * * *
		* * *
		* *
		*
		
		     *
		   * *
     	 * * *
	   * * * *
	 * * * * *
*/	
//	for(int i = 1; i <= n; i++) {
//		for(int j = n; j >= i; j--) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
	
		for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
		}
		return;
	}
	
	
	public static void main(String[] args) {
		
//		day_1(5);
//		day_2(5);
		day_3(5);
	}
	
}
