class Student{

    public Student(int i) {
        System.out.println("The value of i is : " + i);
    }

    public Student(){
        System.out.println("constructor has been called");
    }
    public static void main(String[] args) {
        Student st = new Student();
        Student st1 = new Student(10);
    }
}
public class Constructor {
}
