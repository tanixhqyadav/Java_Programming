import java.util.Arrays;

class arry {
    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class array6 {
    // CLONING AN ARRAY
    public static void main(String[] args) {
        arry as = new arry();
        int arr1[] = new int[5];
        arr1[0] = 23;
        arr1[3] = 34;
        arr1[2] = 78;
        arr1[1] = 99;
        arr1[4] = 12;
        System.out.println("original array");
        as.printarray(arr1);
        //
        int arr2[] = arr1.clone();
        int arr3[] = Arrays.copyOf(arr1, arr1.length);
        int arr4[] = Arrays.copyOfRange(arr1, 0, 2);
        arr2[2] = 999;
        arr2[1] = 128;
        System.out.println("Array 2 which copied from 1");
        // NOW IT IS CHANGED BECAUSE IT HAS MADE A DEEP COPY
        as.printarray(arr2);
        System.out.println("copy of method");
        as.printarray(arr3);
        System.out.println("copy of range method");
        as.printarray(arr4);

    }
}
