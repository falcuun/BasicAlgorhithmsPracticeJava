import java.util.Scanner;

public class C72 {
    public void start()
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

    /*
    Could you also check the Chapter 7 Item 2

    It seems that when typed the string, it also records the previously typed characters even I backspaced

    For example, I typed radar but I mistyped it as rardar then I backspaced then typed the correct one

    the program also records it as rardar
     */
}
