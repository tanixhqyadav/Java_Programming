public class array22 {
    // TWO POINTERS APPROACH
    static void sort(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer until an odd element is found
            while (arr[left] % 2 == 0 && left < right)
                left++;

            // Move right pointer until an even element is found
            while (arr[right] % 2 == 1 && left < right)
                right--;

            // Swap the even and odd elements
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sort(arr);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
