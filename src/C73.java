import java.util.Scanner;

public class C73 {
    public void start()
    {
        String userInput, copiedString;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input String you want copied: ");
        userInput = scanner.nextLine();

        copiedString = String.copyValueOf(userInput.toCharArray());

        System.out.println("Value of Input is: " + userInput);
        System.out.println("Value of Copied String is: " + copiedString);
    }
}
