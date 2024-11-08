class complex {
    static int sum(int a, int b) {
        return a + b;
    }

    static int pro(int a, int b) {
        return a * b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static void print(int a) {
        System.out.println(a);
    }
}

public class prct1 {
    public static void main(String[] args) {
        complex c = new complex();
        c.print(c.sum(4, 4));
        c.print(c.pro(4, 4));
        c.print(c.sub(4, 4));
    }
}
