import java.util.Scanner;

public class Student{
    String firstName;
    String lastName;
    int age;
    double GPA;
    boolean hasPerfectAttendance;

    public static void main(String[] args) {
        Student ryan = new Student();
        ryan.firstName = "Ryan";
        ryan.lastName = "Schock";
        ryan.age = 28;
        ryan.GPA = 4.0;
        char firstInit = ryan.firstName.charAt(0);
        char lastInit = ryan.lastName.charAt(0);
        ryan.hasPerfectAttendance = true;
        System.out.println(ryan.firstName + " " + ryan.lastName + " " + firstInit + " " + lastInit + " " +
                ryan.age + " " + ryan.GPA + " " + ryan.hasPerfectAttendance);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        ryan.GPA = input.nextDouble();
        System.out.println(ryan.firstName + " " + ryan.lastName + " " + firstInit + lastInit + " " + ryan.age + " "
                + ryan.GPA + " "+ ryan.hasPerfectAttendance);
    }
    }
