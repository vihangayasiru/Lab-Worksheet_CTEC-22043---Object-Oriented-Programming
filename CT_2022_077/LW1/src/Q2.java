import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);

        System.out.println("Enter your first name :");
        String firstName = MyScanner.next();

        System.out.println("Enter your last name");
        String lastName = MyScanner.next();

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle(fullName);
        myWindow.setVisible(true);
    }
}
