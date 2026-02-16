package school2;
import java.util.Scanner;
public class dashboard {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int menuItem;
            System.out.println("Welcome to the School Dashboard");
            System.out.println("1. Add Student");
            System.out.println("2. Add Employee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            menuItem = input.nextInt();
            
            if (menuItem == 1) {
                student aStudent = new student();
                aStudent.addStudent();
            } else if (menuItem == 2) {
                employee anEmployee = new employee();
                anEmployee.addEmployee();
            } else if (menuItem == 3) {
                System.out.println("Exiting the dashboard. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            
        // student aStudent = new student();
        // aStudent.addStudent();
    }
}