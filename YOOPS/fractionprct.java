import java.util.*;
public class fractionprct{
    int num;
    int den;

    public static int hcf(int a, int b) {
        while (b % a != 0) {
            int temp = b % a;
            b = a;
            a = temp;
        }
        return a;
    }

    public fractionprct(int num, int den){
        this.den=den;
        this.num=num;
        simplify();
    }
    public void simplify(){
        int h=hcf(num, den);
        num/=h;
        den/=h;
    }
        public static fractionprct add(fractionprct p ,fractionprct q){
            int numerator=p.num*q.den +q.den*p.num;
            int denominator=p.den*q.den;
        fractionprct ok=new fractionprct(numerator,denominator);
        return ok;
    }
    public static int sub(int num ,int den){
        return Math.abs(num-den);
    }
    public static int mul(int num ,int den){
        return num*den;
    }
}

