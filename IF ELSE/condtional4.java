import java.util.Scanner;
public class condtional4 {
    public static void main(String[] args){
        Scanner cv= new Scanner(System.in);
        int v=cv.nextInt();
        String gh;
        gh=v>=18 ? "Adult" :"Not Adult";
        System.out.println(gh);
    }
}
