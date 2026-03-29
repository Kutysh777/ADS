import java.util.Scanner;

public class Task10 {

    public static boolean Palindrome(String a) {
        if (a.length() <= 1) return true;

        if (a.charAt(0) != a.charAt(a.length() - 1)) {
            return false;
        }

        return Palindrome(a.substring(1, a.length() - 1));
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        String n = scanner.nextLine();

        if (Palindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}