public class Task12 {

    public static int max(int[] arr, int n) {
        if (n == 1) return arr[0];

        int maxRest = max(arr, n - 1);

        return Math.max(arr[n - 1], maxRest);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 7, 3};

        int result = max(arr, arr.length);
        System.out.println(result);
    }
}