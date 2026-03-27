// applied OOP concepts through week 4 tutorial at Melbourne Polytechnic Preston Bachelor Of IT course.
// without concentrating on these OOP concepts we achieve them anyway.

import java.util.Scanner;

public class MainApp {
    

    public static void main(String[] args) {
        System.out.println("Enter how many students you want to enter: ");
        int numberOfStudents;
        Scanner scanner = new Scanner(System.in);
        numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        Greeting greeting = new Greeting();

        greeting.setName("Michael"); // set via setter

        Greeting greeting2 = new Greeting();
        greeting2.setName("Tom"); // set via setter

        greeting.sayHello(); // call method
        greeting2.sayHello(); // call method

        if (numberOfStudents <= 0) {
            System.out.println("You need to enter at least one student.");
            return;
        }

        for (int i = 0; i < numberOfStudents; i++) {
            studentInfoEntry(scanner);
        }
    }  

    public static void studentInfoEntry(Scanner scanner) {


        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character


        Student student = new Student(studentId, name, age);
        student.displayInfo();
    }
    
}

    
    
