public class MergeSort {

    /**
     * This method merges two sorted halves of an array into one sorted array.
     * 
     * @param arr   The original array
     * @param left  The starting index of the left subarray
     * @param mid   The ending index of the left subarray
     * @param right The ending index of the right subarray
     */
    public static void conquer(int[] arr, int left, int mid, int right) {
        int[] merged = new int[right - left + 1];  // Temp array for merged result

        int idx1 = left;      // Pointer for left subarray
        int idx2 = mid + 1;   // Pointer for right subarray
        int x = 0;            // Pointer for merged array

        // Compare elements of both subarrays and copy the smaller one
        while (idx1 <= mid && idx2 <= right) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left subarray, if any
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from right subarray, if any
        while (idx2 <= right) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged elements back into the original array
        for (int i = 0; i < merged.length; i++) {
            arr[left + i] = merged[i];
        }
    }

    /**
     * Recursively divides the array into halves, then sorts and merges them.
     * 
     * @param arr   The original array
     * @param left  Starting index
     * @param right Ending index
     */
    public static void divide(int[] arr, int left, int right) {
        if (left >= right) {
            return;  // Base case: 1 or 0 elements
        }

        int mid = left + (right - left) / 2;  // Find the middle index

        // Recursively divide the left and right halves
        divide(arr, left, mid);
        divide(arr, mid + 1, right);

        // Merge the sorted halves
        conquer(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };  // Unsorted array
        int n = arr.length;

        System.out.print("Unsorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Perform merge sort
        divide(arr, 0, n - 1);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
