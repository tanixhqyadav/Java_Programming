public class A_Class  implements A{
    @Override
    public void funB(){

    }
    public void Display(){
        
    }
    public void funA(){
        
    }
    public void funC(){
        
    }
    // @Override
    public int pay(){
        return 0;
    }
    public static void main(String[] args) {
        // !It is the example of multiple inheritence B,C are interface extended in A And A is a interface which is   implemented in class A_Class.java
        A_Class kl=new A_Class();
        kl.Display();
    }
}
