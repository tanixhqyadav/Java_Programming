package PrimeSieve;
public class primesieve {
    public static void main(String[] args) {
        int z=100;
        Prime_Sieve(z);
    }
    // complexity n*log(log2(n))
    public static void Prime_Sieve(int n){
        //false 
        boolean[] prime=new boolean[n+1];
        prime[0]=true;//not prime
        prime[1]=true;//not prime
        for (int i = 2; i*i<=prime.length; i++) {
            if(prime[i]==false){//prime
            for(int j=2;i*j<prime.length;j++){
                prime[i*j]=true;// tabular cutting
            }
            }
        }
        for (int i = 2; i < prime.length; i++) {
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
