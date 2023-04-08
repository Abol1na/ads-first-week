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

    /**
     * arrReverse - it reverses the written order
     * @param arr - array of elements
     * @param a - the starting index of the array
     * @param b - the ending index of the array
     * @return - returns array in reverse order
     */
    public static void arrReverse(int[] arr, int a, int b){
        if(a >= b){
            return;
        }
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
        arrReverse(arr, a+1, b-1);
    }
}