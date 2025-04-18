package assignments;

public class Assignment7 {


	static int credScore = 720;
	static String cusName = " John Doe ";
	static  float income = 55000.0f;
	static  boolean  isEmployed = true;
	static float debtTolIncRatio= 35.0f;


	public static void main(String[] args) {

		if( credScore >750) {
			System.out.println("Loan is approved");
		}
		else if(credScore<=750 && credScore >=650){
			if(income>=50000) {

				if(isEmployed==true) {
					if(debtTolIncRatio < 40.0) {
						System.out.println("Customer is approved for loan");

					}else {
						System.out.println("Loan is dined ");
					}

				}else {
					System.out.println(" Loan is dined");
				}

			}else {
				System.out.println("Loan is dined , customer not eligible");
			}

		}
		else {
			System.out.println("Loan is denied");


		}
	}

}
