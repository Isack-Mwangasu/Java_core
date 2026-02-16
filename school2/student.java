package school2;
import java.util.Scanner;
public class student {
    String fullName;
    String gender;
    int idno;
    double balance;
    
    void addStudent(){
        Scanner input= new Scanner(System.in);
        System.out.println("Student Registration");
        System.out.println("Enter full name:");
        fullName = input.nextLine();
        System.out.println("Enter gender:");
        gender = input.nextLine();
        System.out.println("Enter ID number:");
        idno = input.nextInt();
        System.out.println("Enter balance:");
        balance = input.nextDouble();

    // output variables
        System.out.println("Student Details:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Gender: " + gender);
        System.out.println("ID Number: " + idno);
        System.out.println("Balance: " + balance);
    }
}
