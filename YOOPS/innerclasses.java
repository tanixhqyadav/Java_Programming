class papola{
    String shola;
    int rola;
}
public class innerclasses {
    // * agar hum static nhi lgaynge toh class xanishq is dependent on innerclasses
    static class xanishq{//! static vali cheeze object pe depend nhi krti 

        String name;
        int hola;
        // public tanishq(String name, int hola){
        //     this.name=name;
        //     this.hola=hola; 
        // }
    }
    public static void main(String[] args) {
        papola xx=new papola();
        xx.rola=97;
        System.out.println(xx.rola);
        xanishq pp=new xanishq();
        pp.name="yahoo!";
        System.out.println(pp.name);
    }
}
