import java.util.Scanner;

public class Main {
//mmmmm programming
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a Scanner in to read from the console
        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine(); // clear the buffer

            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        } else {
            System.out.println("Please enter a valid age.");
        }

        in.close();
    }
}
