import java.util.*;

public class countingsort {
    public static void main(String[] args) {
        int lr[] = {2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9};
        prin(lr);
        int hr[] = sorta( lr);
        prin(hr);
    }

    public static int[] sorta(int ar[]) {
        int max = Arrays.stream(ar).max().getAsInt();
        int cr[] = new int[max + 1];
        
        // Count occurrences of each element in ar
        for (int i = 0; i < ar.length; i++) {
            cr[ar[i]]++;
        }
        
        System.out.print("Count Array: ");
        prin(cr); // Display the count array for debugging
        
        int index = ar.length - 1; // Start filling ar from the end for descending order
        
        for (int j = max; j >= 0; j--) {
            while (cr[j] > 0) {
                ar[index--] = j; 
                cr[j]--; 
            }
        }
        
        return ar;
    }

    public static void prin(int hr[]) {
        for (int i = 0; i < hr.length; i++) {
            System.out.print(hr[i] + " ");
        }
        System.out.println();
    }
}
