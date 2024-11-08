import java.util.*;
public class ques {
    public static void main(String args[]) {
		Scanner jk=new Scanner(System.in);
		int t=jk.nextInt();
		while(t-->0){
			String a=jk.next();
			String b=jk.next();
			String str="";
			char chr1[]=a.toCharArray();
			char chr2[]=b.toCharArray();
			for(int i=0;i<chr1.length;i++){
				if(chr1[i]==chr2[i]){
					str+="0";
				}
				else{
					str+="1";
				}
			}
			System.out.println(str);
		}
    }
}