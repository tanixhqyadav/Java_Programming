import java.util.Scanner;
public class loops10 {
    public static void main(String[] args){
    Scanner gh=new Scanner(System.in);
    int hg=gh.nextInt();
    int d=0;
    while(hg!=0){
        d=d*10+hg%10;
        hg=hg/10;
    }
    System.out.println(d);
}
}