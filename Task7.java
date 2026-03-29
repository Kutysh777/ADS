import java.util.Scanner;
public class Task7{
    public static int NumberOfDigits (int a){
        if (a == 0) return 0;
        return 1 + NumberOfDigits(a/10);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        int result =NumberOfDigits(n);
        System.out.println(result);
    }
}