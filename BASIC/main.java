class student {
    // created a new class but it is not public class
    int rollno;
    String username;
}

public class main {
    public static void main(String[] args) {
        student obj = new student();// created a new objet
        obj.rollno = 12;
        obj.username = "TANISHQ YADAV";
        System.out.println(obj.rollno);
        System.out.println(obj.username);
    }

}
