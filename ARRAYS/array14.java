import java.util.Scanner;
/// second largest code 
class ghj {
    static int findSecondLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}

public class array14 {
    public static void main(String[] args) {
        int gh[] = { 1, 2, 3, 22, 3, 4, 78 };
        ghj n = new ghj();
        int secondLargest = n.findSecondLargest(gh);
        System.out.println("The second largest number is: " + secondLargest);
        
    }
}
