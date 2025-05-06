package assignments;

public class Assignment13 {


	public static void main(String[] args) {
		int n = 1; 
		boolean Prime = true;
		//prime number is divisible by 1 or by itself 
		if (n <= 1) {
			Prime = false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					Prime = false;
					break;
				}
			}
		}

		if (Prime) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}

	}

}


