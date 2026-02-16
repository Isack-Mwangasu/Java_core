package school2;
import java.util.Scanner;
public class employee extends person { 
    String staffno;
    String department;

    void addEmployee()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Employee Registration");
        System.out.println("Enter full name:");
        fullName = input.nextLine();
        System.out.println("Enter gender:");
        gender = input.nextLine();
        System.out.println("Enter staff number:");
        staffno = input.nextLine();
        System.out.println("Enter department:");
        department = input.nextLine();
    // output variables
        System.out.println("Employee Details:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Gender: " + gender);
        System.out.println("Staff Number: " + staffno);
        System.out.println("Department: " + department);
    }
}
