import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (checkDigits(s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean checkDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        else{
            return true
        }
    }
}
