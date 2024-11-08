public class accessmodifiers1 {
    public String str="I am Tanishq yadav";
    void printfromclass(){
        System.out.println("with in class");
    }
    public static void main(String[] args) {
        accessmodifiers1 h=new accessmodifiers1();
        h.printfromclass();
        System.out.println(h.str);
        app hhj=new app();
        hhj.printfromclass();
    }
}
class app{
    void jk(){
        System.out.println("print outside class");
        System.out.println("within paackage outside class");
//  this will be done later while the lecture of loops 
    }
}
