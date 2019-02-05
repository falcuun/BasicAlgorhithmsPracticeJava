import java.util.Scanner;

public class C75 {
    public void start()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstName = scanner.nextLine().toUpperCase();
        System.out.print("Enter your Second name: ");
        String lastName = scanner.nextLine().toUpperCase();

        System.out.println("Your name in all capitals is: " + firstName + " " + lastName);
    }
}
