import java.util.Scanner;
public class Task9{
    public static int Fibonacci(int a){
        if (a == 0) return 0;
        if (a == 1) return 1;
        return Fibonacci(a-1)+Fibonacci(a-2);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
    }
}