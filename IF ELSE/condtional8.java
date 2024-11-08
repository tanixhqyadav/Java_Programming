import java.util.Scanner;

public class condtional8 {
    public static void main(String[] args){
        Scanner v=new Scanner(System.in);
        System.out.println("Enyer any character");
        char n=v.next().charAt(0);
        if((n>='a' && n<='z')  || (n>='A' && n<='Z')){
            System.out.println("Alphabet  :"+n);
        }
        else{
            System.out.println("Not an Alphabet");
        }

        
    }
}
