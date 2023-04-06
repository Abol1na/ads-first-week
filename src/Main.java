import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        double average = findAverage(arr, arr.length);
        System.out.println("Average is " + average);
    }

    /**
     * findAverage() - this function calculates the average of the numbers
     * @param arr - array of elements, that contains numbers to find average
     * @param n - size of array
     * @return - return average value
     */
    public static double findAverage(int[] arr, int n) {
        double sum = 0;
        if (n == 1)
            return arr[0];
        else{
            sum = findAverage(arr, n-1)*(double)(n-1);
            sum += arr[n-1];
            return sum / (double)n;
        }
    }
}
