
public class equal {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s1==s2);//TRUE because both are same and refering to same address but 
        // where as in s3 a new string is formed in heap  having totally diffrent address:
        System.out.println(s1==s3);//FALSE
        System.out.println(s1.equals(s3));// TRUE because it is checking not checking the address  it is checking the string directly
    }
}
