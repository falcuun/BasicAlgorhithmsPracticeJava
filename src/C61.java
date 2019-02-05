import java.util.Scanner;

public class C61 {
    public void start()
    {
        int[] userInput = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < userInput.length; i++){
            System.out.print("Please input number on position: " + i + ": ");
            userInput[i] = scanner.nextInt();
        }

        int biggestNumber = 0;
        for(int i = 0; i < userInput.length; i++){
            if(userInput[i] > biggestNumber){
                biggestNumber = userInput[i];
            }
        }

        System.out.println("The Biggest Number from the list is: " + biggestNumber);
    }

    /*
    1. Write a program that will ask the user to give five numbers and then it will search for the biggest number in the given list from the user. User two dimensional array.
     */
}
