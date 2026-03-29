import java.util.Scanner;
public class Task3{
    public static int SumOfFirstNaturalNumbers(int n){
        if (n == 0) return 0;
        return n + SumOfFirstNaturalNumbers(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int result =SumOfFirstNaturalNumbers(n);
        System.out.println(result);

    }
}