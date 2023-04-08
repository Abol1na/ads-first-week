import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        arrReverse(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrReverse(int[] arr, int a, int b){
        for(int i = a; i < (a+b)/2; i++){
            int c = arr[i];
            arr[i] = arr[b-i];
            arr[b-i] = c;
        }
    }
}