import java.util.Scanner;
public class Task5 {
    public static int PowerOfNumber(int a,int b){
        if (b == 0) return 1;
        return a * PowerOfNumber(a,b-1);
    }
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int result = PowerOfNumber(a,b);
        System.out.println(result);

    }
}