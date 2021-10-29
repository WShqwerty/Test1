import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        System.out.println("Test 1");

        System.out.println(add(1, 2)+"\thello world!");

        ArrayList<Student> Stus = new ArrayList<Student>();

        Student student1 = new Student();

        student1.setId(1);

        System.out.println(student1.toString());

        Stus.add(student1);

        for(Student stu : Stus){
            System.out.println(stu.toString());
        }

    }

    public static int add(int a, int b) {
        return a+b;
    }
}
