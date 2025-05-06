package assignments;

public class Assignment12 {

	public static void main(String[] args) {
	 double x =2.00000;
	 int n = -2;
	 double pow=1.0;
	 boolean num = true;
	 if(n>0) {
		 num =true;
	 } 
	 else if (n<0) {
	     num= false;
	     n= n*-1;
	 }
	 for(int i=0; i<n; i++) {
		 pow= pow * x;
	 }
	if(num== false) {
		pow= 1/pow;
	}
	 System.out.println("power of the num is " + pow);
	}

}
