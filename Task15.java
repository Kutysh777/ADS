public class Task15 {

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;

        if (arr[index] > arr[index + 1]) return false;

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 9};

        if (isSorted(arr, 0))
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");
    }
}