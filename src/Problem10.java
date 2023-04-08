import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(GCD(a,b));
    }

    /**
     * GCD - method to find the GCD of the two integers
     * @param a - first integer
     * @param b - second integer
     * @return - returns the number which is GCD of the 2 integer
     */
    public static int GCD(int a, int b){
        if (b == 0)
            return a;
        return GCD(b, a%b);
    }
}
