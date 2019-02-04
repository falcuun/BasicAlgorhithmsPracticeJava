import java.util.Scanner;

public class C72 {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the String you want to check: ");
        String input = scanner.nextLine();

        String cleanInput, reversedInput = "";
        cleanInput = input.replace(" ", "");

        for(int i = cleanInput.length() - 1; i >= 0; i--){
            reversedInput += cleanInput.charAt(i);
        }

        if(reversedInput.equalsIgnoreCase(cleanInput)){
            System.out.println(input + " Is Palindrome!");
        } else
            System.out.println(input + " Is not Palindrome!");
    }
}
