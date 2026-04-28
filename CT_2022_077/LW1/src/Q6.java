import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter the width : ");
        int x = myscanner.nextInt();

        System.out.println("Enter the height : ");
        int y = myscanner.nextInt();

        System.out.println("Enter the First Name");
        String firstname = myscanner.nextLine();


        JFrame myWindow = new JFrame();
        myWindow.setSize(x,y);
        myWindow.setTitle(firstname);
        myWindow.setVisible(true);
    }
}
