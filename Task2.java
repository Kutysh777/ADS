import java.util.Scanner;
public class Task2{
    public static void PrintNumber(int a,int b){

        if (a > b )return;
        System.out.println(a);
        PrintNumber(a+1,b);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        PrintNumber(1,n);
    }


}
