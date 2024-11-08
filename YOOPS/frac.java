public class frac {
    public static void main(String[] args) {
        fractionprct o=new fractionprct(12, 60);
        o.simplify();
        System.out.println(o.num+"/"+o.den);
        fractionprct p=new fractionprct(2, 8);
        System.out.println(p.num+"/"+p.den);

        fractionprct addition=o.add(p, o);
        System.out.println(addition.num+"/"+addition.den);
        
    }
}
