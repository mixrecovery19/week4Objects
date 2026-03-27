An example of the Bachelor Of I.T. level tutorials at Meblourne Polytechnic Preston - 2026

Week 3 Exercises –Classes and Objects
Purpose
The objective here is to move from “static world” to the “object world”
Sample Code
Here’s sample code you may find useful
public class MainApp { // User-defined class
public static void main(String[] args) { // program start
Calculator calc = new Calculator(); // instantiate object
System.out.println(calc.divide(10, 2)); // call object method
}
}
public class Calculator { // User-defined class
public double divide(double a, double b) { // non-static method
return a / b;
}
}
Exercise 1 – setting things up
1. Create a new folder in Windows Explorer or Finder called week04Objects or similar.
2. Open VS Code
3. Open that folder in VS Code
4. Create your first file:
• Right-click → New File
• Name it exactly: MainApp.java
5. In your MainApp.java file, create a class called MainApp and include a main() method.
Important: The file name must match the class name.
6. Print the message
Hello from my first class
Bachelor of Information Technology
BIT235 Object Oriented Programming, 2026 Semester 1 Page 2 of 3
Exercise 2 – Creating a Second Class
Now create a second file: Greeting.java
In this file:
• Create a class called Greeting
• Add a method called sayHello() that contains this code:
System.out.println(“Hi there!”)
Note: This method should NOT be static.
Exercise 3 – Creating an Object
Go back to MainApp.java.
Inside main:
• Create an object of the Greeting class
• Call the sayHello method
Expected output:
Hi there!
Exercise 4 – Adding Data (Fields)
In Greeting.java add a field
String name;
Modify the sayHello method so it prints that name variable, for example:
Hello <name>
Exercise 5 – Using the Object Properly
Back in MainApp.java:
• Create a Greeting object
• Set the name to your own name
• Call the method
Example output:
Hello Sally
Bachelor of Information Technology
BIT235 Object Oriented Programming, 2026 Semester 1 Page 3 of 3
Exercise 6 – Multiple Objects (Key Concept)
In MainApp.java:
Create two Greeting objects:
• One with your name
• One with a friend’s name
Call the method on both objects
Expected behaviour: Each object prints its own name
Exercise 7 – Thinking in Objects
Create a new class: Student.java
Add:
• field: studentId
• method: displayId()
In MainApp.java:
• Create two Student objects
• Give them different IDs
• Call displayId() for each
