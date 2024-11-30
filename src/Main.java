import java.util.Scanner;

//public is an access ,modifier used with  main class so it can be accessed from all over the program
//static keyword is used so the program called the function without creating objects
//void ==return type
//string[] arg ==command line argument-it used by compiler to enter the program
// used to take input from console
//class -Pascal
//function -camelCasing
//literal - if constant value is assigned to the variable then it is known as literal
public class Main {
    public static void main(String[] args) {
        //taking input from the user
        System.out.println("Please enter your name without using spaces");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        //print VS println
        System.out.print("system works properly");
        System.out.println("system isn't working");

        System.out.println("system is working properly");
        System.out.println("system isn't working");

        GetterSetter gs = new GetterSetter();
        gs.setId(40);
        //gs.getId();



    }
}