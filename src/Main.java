import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        C61 biggestNumberInList = new C61();
        C62 findNumberInArray = new C62();
        C63 biggestAndSmallest = new C63();
        C64 occurranceCount = new C64();
        C65 secondHighest = new C65();
        C66 salesReport = new C66();
        C67 temperatureArray = new C67();
        C68 twentyQuestionsQuiz = new C68();
        C69 employeesInformation = new C69();
        C610 divisableBy3 = new C610();
        C71 reverseString = new C71();
        C72 palindrome = new C72();
        C73 stringCopy = new C73();
        C74 vowelsReplacement = new C74();
        C75 nameToCaps = new C75();
        ZodiacClass zc = new ZodiacClass();

        String menu = "Choose which program you want to run: \n" +
                "1. Biggest Number in list\n" +
                "2. Find Number In Array\n" +
                "3. Biggest And Smallest in Array\n" +
                "4. Occurrence Count\n" +
                "5. Second to Highest in Array\n" +
                "6. Sales Report\n" +
                "7. Temperature Array\n" +
                "8. 20 Questions Quiz\n" +
                "9. Employees Information\n" +
                "10. Divisible by 3\n" +
                "11. Reverse String\n" +
                "12. Palindrome\n" +
                "13. Copy String\n" +
                "14. Vowels Replacement\n" +
                "15. Name To Capital\n" +
                "16. Zodiac Sign\n" +
                "Q. Quit\n\n" +
                "Enter your Option: ";
        while (running) {
            System.out.println(menu);
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    biggestNumberInList.start();
                    break;
                case "2":
                    findNumberInArray.start();
                    break;
                case "3":
                    biggestAndSmallest.start();
                    break;
                case "4":
                    occurranceCount.start();
                    break;
                case "5":
                    secondHighest.start();
                    break;
                case "6":
                    salesReport.start();
                    break;
                case "7":
                    temperatureArray.start();
                    break;
                case "8":
                    twentyQuestionsQuiz.start();
                    break;
                case "9":
                    employeesInformation.start();
                    break;
                case "10":
                    divisableBy3.start();
                    break;
                case "11":
                    reverseString.start();
                    break;
                case "12":
                    palindrome.start();
                    break;
                case "13":
                    stringCopy.start();
                    break;
                case "14":
                    vowelsReplacement.start();
                    break;
                case "15":
                    nameToCaps.start();
                    break;
                case "16":
                    zc.start();
                    break;
                case "Q":
                    running = false;
                    System.exit(0);
                    break;
            }
        }
    }
}
