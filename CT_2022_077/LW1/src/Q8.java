import java.util.Scanner;
    public class Q8 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter two string with !(Exclamation mark) : ");
            String text = input.nextLine();

            String[] parts = text.split("!");

            if (parts.length >= 2) {

                System.out.println("Before ! : " + parts[0]);
                System.out.println("After !  : " + parts[1]);

            }else {
                    System.out.println("No '!' found in the string. ");
                }
            }
        }



