import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(findPrime(n,2))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }

    /**
     * findPrime - this function checks whether a given number is Prime
     * @param n - integer num
     * @return - return true if it is Prime, return false if it otherwise
     */
    public static boolean findPrime(int n, int i){
        if(n<=2) {
            return (n == 2) ? true : false;
        }
        if(n % i == 0){
            return false;
        }
        if(i * i > n){
            return true;
        }
        return findPrime(n, i + 1);
    }
}
