public class Concept{
    public static void main(String[] args) {
        char a='5';
        char b='0';
        System.out.println(a-b);// here internally Ascii values are subtracting ( 53 - 48 ) which is equal to 5 only
        //this concept can be used to convert String to integer without in built function and others too
        System.out.println('9'-'4');// 5 
        System.out.println('45'-'67');// it will no give because ascii value in char is for 0 to 9.... 
    }
}