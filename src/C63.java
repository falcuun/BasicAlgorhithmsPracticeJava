import java.util.Scanner;

public class C63 {
    public static void main(String[] arg)
    {
        int[] userInput = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < userInput.length; i++){
            System.out.println("Please enter a number at position: " + i);
            userInput[i] = scanner.nextInt();
        }

        int minimumValue = userInput[0];
        int maximumValue = userInput[0];

        for(int i = 0; i < userInput.length; i++){
            if(userInput[i] < minimumValue){
                minimumValue = userInput[i];
            }
            if(userInput[i] > maximumValue){
                maximumValue = userInput[i];
            }
        }

        System.out.println("Minimum value: " + minimumValue);
        System.out.println("Maximum value: " + maximumValue);

    }
    /*
     3. Write a program that will ask the user to give five numbers and the it will search for the biggest
     and smallest number in the given list from the users input values.
     */
}
