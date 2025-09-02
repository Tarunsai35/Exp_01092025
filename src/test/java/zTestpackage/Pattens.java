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
	
	public static void main(String[] args) {
		
//		day_1(5);
		day_2(5);
	}
	
}
