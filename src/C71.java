import java.util.Scanner;

public class C71 {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);

        String[] wordsOfSentence;

        System.out.print("Please Enter A Sentence you want to reverse: ");
        String userInput = scanner.nextLine();

        wordsOfSentence = userInput.split(" ");

        for(int i = wordsOfSentence.length - 1; i >= 0; i--){
            System.out.print(wordsOfSentence[i] + " ");
        }
    }
}
