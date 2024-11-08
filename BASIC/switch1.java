import java.util.Scanner;
public class switch1 {
    public static void main(String[] args){
        Scanner xf=new Scanner(System.in);
        int day= xf.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break; 
            case 6:
            System.out.println("saturday");
            break;
            default:
            System.out.println("invalid");
            break;
        }

    }
}
