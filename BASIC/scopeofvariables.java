class algebra{
    int a=10;//member varible of this class
    int b=5;

    int add(){
        return a+b;
    }
    int sub(){
        int p=5;
        int q=10;
        return p-q; 
    }
    int pro(){
        return 0;
        //return p*q;//this is will not execute because p and q canot be acessed
    }
    void demo(){
        int a=23;
        System.out.println(a);
        //System.out.println(//z);// this z canot be accesed outside the block because block level scope 
        {
            int z=9;
        }
    }   
    
}

public class scopeofvariables {
    public static void main(String[] args) {
        algebra n=new algebra();
        n.demo();
    }
}
