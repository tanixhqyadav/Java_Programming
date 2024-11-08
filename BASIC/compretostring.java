public class compretostring {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        int result1 = str1.compareTo(str2); // Returns a negative value (-1) because "apple" < "banana"
        int result2 = str2.compareTo(str1); // Returns a positive value (1) because "banana" > "apple"
        int result3 = str1.compareTo(str3); // Returns 0 because "apple" is equal to "apple"

    }
}
