package assignments;

public class Assign17 {

	public static void main(String[] args) {
		int n = 5;


			//left triangle 

			//print spaces
			for(int j=0; j<5; j++)
			{
				for(int i=2*(n-j); i>=0 ;i--) 
				{
					System.out.print(" ");
				}
				for(int k=0; k<=j; k++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}       


