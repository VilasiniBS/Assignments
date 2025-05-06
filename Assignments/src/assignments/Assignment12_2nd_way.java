package assignments;

public class Assignment12_2nd_way {

    public static double pow(double x, int n) {
        if (n == 0) 
        return 1;            
        if (n < 0) {
            x = 1 / x;                    
            n = -n;
        }
        return fastPow(x, n);
    }
    private static double fastPow(double x, int n) {
        if (n == 0) 
        return 1;
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
        return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        double x = 2.0000;
        int n = 10;
        System.out.println("pow(" + x + ", " + n + ") = " + pow(x, n));
    
}
}