public class Task13 {

    public static int count(int[] arr, int n, int target) {
        if (n == 0) return 0;   // base case

        int countRest = count(arr, n - 1, target);

        if (arr[n - 1] == target)
            return 1 + countRest;
        else
            return countRest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 5};
        int target = 2;

        int result = count(arr, arr.length, target);
        System.out.println(result);
    }
}