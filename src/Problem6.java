import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a,n));
    }

    /**
     * power - it calculates the integer a in pow n
     * @param a - integer
     * @param n - power
     * @return - returns a in n degree
     */
    public static int power(int a, int n){
        if (a == 0 && (n > 0 || n < 0))
            return 0;
        if(n == 0)
            return 1;
        return a*power(a, n-1);
    }
}
