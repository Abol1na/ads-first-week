import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(findBinom(n,k));
    }

    /**
     * findBinom - this method calculates Binomial coefficient
     * @param n - total number of items
     * @param k - number of items to be chosen
     * @return - returns Bin coeff
     */
    public static int findBinom(int n, int k){
        if(n == k || k == 0)
            return 1;
        else
            return findBinom(n-1,k-1) + findBinom(n-1,k);
    }
}
