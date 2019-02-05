import java.util.Scanner;

public class C64 {
    public void start()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input How Many Items you want to processed: ");
        int rangeOfItems = scanner.nextInt();

        System.out.println("You can enter " + rangeOfItems + " items in the list!");

        int[] arrayOfItems = new int[rangeOfItems];
        for(int i = 0; i < arrayOfItems.length; i++){
            System.out.print("Please Input Number at position: " + i + ": ");
            arrayOfItems[i] = scanner.nextInt();
        }

        int occurrences = 0;
        System.out.print("Please Input the Number to count occurrence of: ");
        int searchValue = scanner.nextInt();

        for(int i = 0; i < arrayOfItems.length; i++){
            if(arrayOfItems[i] == searchValue){
                occurrences++;
            }
        }

        System.out.println("The " + searchValue + " occurs " + occurrences + " Times");
    }

    /*
    4. Write a program that will ask the user how many items to be processed and
      then the program will ask the user to enter a series of number
      after which the program will count the number of occurrence of a
      certain number being given by the user.
     */

}
