import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your First Name : ");
        String firstName = myScanner.next();

        System.out.println("Enter your Middle Name : ");
        String middleName = myScanner.next();

        System.out.println("Enter your Last Name : ");
        String lastName = myScanner.next();

        System.out.println(firstName + " " + middleName.charAt(0) + ". " + lastName);
    }
}
