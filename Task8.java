import java.util.Scanner;
public class Task8{
    public static void ReverseOfNumber (int a){
        if (a == 0) return;
        System.out.print(a%10);
        ReverseOfNumber(a/10);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        ReverseOfNumber(n);
    }
}