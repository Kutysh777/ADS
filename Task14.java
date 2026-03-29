public class Task14 {

    public static boolean search(int[] arr, int index, int target) {
        if (index == arr.length) return false;

        if (arr[index] == target) return true;

        return search(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int target = 9;

        if (search(arr, 0, target))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}