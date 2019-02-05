import java.util.Scanner;

public class C62 {
    public void start() {
        int[] userInput = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < userInput.length; i++) {
            System.out.print("Please input number on position: " + i);
            userInput[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Enter the Search Number");
        int searchCriteria = scanner.nextInt();
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] == searchCriteria) {
                System.out.println("The number exists and is at position: " + i + " In the list");
                break;
            }else if(i  == userInput.length - 1 && i != userInput[i]){
                System.out.println("The number does not exist in the list");
            }
        }
    }
    /*
    2. Write a program that will ask the user to give five numbers and
       then the user can select a number to be searched by the program
       if the number is found the program will tell the location of the number,
       if not, the program will inform the user that the number is not found in the list.
     */
}
