import java.util.Scanner;

public class Q9 {
    static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String input = newScanner.nextLine();

        if (input.length() > 0){
            System.out.println(input.length());
            System.out.println(input.charAt(0));
            System.out.println(input.charAt(input.length() - 1));
        }
        else{
            System.out.println("String is empty");
        }

        newScanner.close();
    }
}
