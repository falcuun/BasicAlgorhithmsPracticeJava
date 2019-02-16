import java.util.Scanner;

public class ZodiacClass {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your name: ");
        String name = scanner.nextLine();
        System.out.print("Please input your date of birth (DD/MM/YYYY)");
        String dob = scanner.nextLine(); // Date of Birth

        int day = Integer.parseInt(dob.substring(0, 2));
        int month = Integer.parseInt(dob.substring(3, 5));
        System.out.print("Your Zodiac Sign is: ");
        if ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
            System.out.println("Capricorn");
        else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
            System.out.println("Aquarius");
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
            System.out.println("Pisces");
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
            System.out.println("Aries");
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
            System.out.println("Taurus");
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
            System.out.println("Gemini");
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
            System.out.println("Cancer");
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
            System.out.println("Leo");
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
            System.out.println("Virgo");
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
            System.out.println("Libra");
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            System.out.println("Scorpio");
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
            System.out.println("Sagittarius");
        else
            System.out.println("Illegal date");
    }
}
/*
Zodiac - write a program that will ask the user for the name and Date of Birth for the program able to tell their Zodiac Sign.
 */