import java.util.Scanner;
public class task1 {
    public static void PrintNumber(int n){
        if(n==0)return;
        System.out.println(n);
        PrintNumber(n-1);

    };

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        PrintNumber(n);

    }



}
