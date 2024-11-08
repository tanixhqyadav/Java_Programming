import java.util.Scanner;

public class lexographicprct1 {
    static void lexo(String a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(a[j].compareTo(a[index])<0)
                index=j;
            }
            String temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
    }
    static void print(String a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("enter the size of array :: ");
        int n = jk.nextInt();System.out.println();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = jk.nextLine();
        }
        lexo(array);
        print(array);

    }
}
