package Seminar01;

public class FindIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        // System.out.println(sumRight(nums, 0));
        System.out.println(findingIndex(nums));
    }

    public static int sumRight(int[] arr, int startIndex) {
        int result = 0;
        if (startIndex >= arr.length - 1)
            return 0;
        for (int i = startIndex + 1; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static int findingIndex(int[] arr) {
        int left = arr[0];
        int right = 0;
        for (int i = 1; i < arr.length; i++) {
            right = sumRight(arr, i);
            // System.out.print(left + " ");
            // System.out.println(right);
            if (left == right)
                return i;
            left += arr[i];
        }
        return -1;
    }
}
