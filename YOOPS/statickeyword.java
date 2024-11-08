public class statickeyword {
    public static void main(String[] args) {

    // static
    System.out.println(Student.getnoofstudent());// we can only prefer a static variable like this 

        Student i=new Student("uiuj", 890, 0.0);
        // System.out.println(i.noofstudent);
        Student o=new Student("jil", 333, 90.0);
        System.out.println(o.getnoofstudent());
        Student l=new Student("jijl", 8909, 9090.90);
        // System.out.println(l.noofstudent);
    }
}
