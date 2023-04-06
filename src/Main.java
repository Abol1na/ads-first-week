public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        double average = findAverage(arr, arr.length);
        System.out.println("Average is " + average);
    }

    public static double findAverage(int[] arr, int n) {
        double sum = 0;
        if (n == 1)
            return arr[0];
        else{
            for(int i = 0; i < n;i++){
                sum += arr[i];
            }
            return sum/n;
        }
    }
}
