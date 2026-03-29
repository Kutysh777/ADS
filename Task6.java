import java.util.Scanner;
public class Task6{
    public static int SumOfDigitsNumber (int a){
        if (a == 0) return 0;
        return a%10 + SumOfDigitsNumber(a/10);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        int result =SumOfDigitsNumber(n);
        System.out.println(result);
    }
}