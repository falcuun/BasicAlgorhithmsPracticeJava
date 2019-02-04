import java.util.Scanner;

public class C74 {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Input string you want to encrypt: ");
        String userInput = scanner.nextLine();
        System.out.print("Please Input Special character you want to use for encryption: ");
        String encryptionCharacter = scanner.nextLine();

        String encryptedString = userInput.replaceAll("[AEIOUaeiou]", encryptionCharacter);

        System.out.println("Original Input: " + userInput);
        System.out.println("Encrypted Input: " + encryptedString);
    }
}
