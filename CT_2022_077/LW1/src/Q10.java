import java.util.Scanner;

public class Q10 {
    static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String input = newScanner.nextLine();

        if (input.length() % 2 != 0){

            int middleString = input.length()/2;
            System.out.println(input.charAt(middleString));
        }
        else{
            System.out.println("The word doesn't have an odd lenght");
        }
    }
}
