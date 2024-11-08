import java.util.Scanner;
import java.util.ArrayList;

public class arraylist2 {

    public static void main(String[] args) {
        Scanner ty = new Scanner(System.in);
        System.out.println("enter the size of list  ");
        int n = ty.nextInt();
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = ty.nextLine();
            l.add(s);
        }
        System.out.print(l);
    }

}
/*int val=0;
for(int i=0;i<=N;i*=2){
    for(int j=0;j<i;j++){
    val++;}
}  
 */