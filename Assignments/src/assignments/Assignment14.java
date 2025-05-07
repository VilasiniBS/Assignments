package assignments;

public class Assignment14 
{
	public static void main(String[] args) {


		int n = 5;
		//Upper pyramid

		for(int i=1; i<=5 ;i++) {
			//print spaces
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print( k + " ");
			}
			System.out.println();
		}


		//Lower pyramid
		for(int i=n-1; i>=1;i--) {
			//print spaces
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print( k + " ");
			}
			System.out.println();
		}
	}
}


