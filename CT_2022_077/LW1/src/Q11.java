import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);

        System.out.println("Enter your full name (include First Name , Middle Name & Last Name) : ");
        String name = newScanner.nextLine();
        String[] partsOfName = name.split(" ");

        if (partsOfName.length == 3){
            String firstName = partsOfName[0];
            String middleName = partsOfName[1];
            String lastName = partsOfName[2];

            System.out.println(firstName +", "+ lastName + " "+ middleName.charAt(0));
        }
        else {
            System.out.println("Please input your name include First Name, Middle Name & Last Name");
        }
    }
}
