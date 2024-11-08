import java.util.Scanner;
// NOT WORKING SO WORK AGAIN ON IT .....
class tyab{
    static int[] smallandlarge(int arr[]){
        int newarr[]=new int[2];
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newarr[0]=arr[i];
            }
        }
        int t=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>t){
                newarr[1]=arr[i];
            }
        }
        return newarr;
    }
}

public class array10 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        tyab hj=new tyab();
        System.out.println("enter the size of array");
        int j=n.nextInt();
        int g[]=new int[j];
        for(int i=0;i<j;i++){
            g[i]=n.nextInt();
        }
        int result[]=hj.smallandlarge(g);
        System.out.println("change array+:"+result);
    }
}
