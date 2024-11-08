import java.util.*;
public class basicoops {
    // passing a class object into a function 
    public static void lora(Student x){
        System.out.println(x.name);
        // System.out.println(x.age);
    }public static class Student{
        String name;
        int age;
        double percent;
    }
    // WE CAN USE CLASSES IN DIFFRENT FILE BUT IN SAME PACKAGE>>
    public static void change(Student x){
        x.name="chutiya";
    }
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        Student ola=new Student();
        ola.name="tanishq";
        ola.age=909;
        ola.percent=90.3;
        // System.out.println(ola.name);
        lora(ola);


        // updation we can change also>>
        ola.name="joker";
        
        // Student bola =new Student();
        // bola.name="aryan";
        // bola.age=60;
        // bola.percent=99.9;
        // System.out.println(bola.name);


        // classes are pass by reference {here the name is changing >>>}
        change(ola);
        System.out.println(ola.name);
    }
}
