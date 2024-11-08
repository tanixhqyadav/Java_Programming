import java.util.*;
public class rotatedsearchva{
    static int binaryinroatated(int araa[],int t){
        int st=0;
        int end=araa.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(araa[mid]==t){
                return mid;
            }
            else{
                if(araa[mid]<araa[end]){
                    if(araa[mid]<t && araa[end]>=t){
                        st=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
                else{
                    if((araa[st]<=t) && (araa[mid]>t)){
                        end=mid-1;
                    }
                    else{
                        st=mid+1;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        int ar[]={8,7,6,5,5,2,2,3,4,5};
        System.out.println(binaryinroatated(ar,7));
    }
}