class algebra{
    static void changevalue(int a){
        a*=100;
    }

}

public class passbyvalueandpassbyreference {
    public static void main(String[] args) {
        algebra hk=new algebra();
        int a=10;
        System.out.println("Before changing the value "+a);
        hk.changevalue(a);//it happens because a passed here is pass by value it is also printing 10  only
        System.out.println("after changeing the value"+a);
    }
}
