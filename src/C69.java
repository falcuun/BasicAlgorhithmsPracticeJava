import java.util.Scanner;

public class C69 {
    public static void main(String[] arg)
    {
        String[][] emlpoyeesInformation = new String[30][2];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < emlpoyeesInformation.length; i++){
            System.out.print("Enter Employees name: ");
            String name = scanner.nextLine();
            emlpoyeesInformation[i][0] = name;
            for(int j = 1; j < emlpoyeesInformation[0].length; j++){
                System.out.print("Enter " + name + "'s job description");
                String desc = scanner.nextLine();
                emlpoyeesInformation[i][j] = desc;
            }
        }
    }
}
/*
Write a program of a list to 30 employee's name, job description and store them in the array employee's information.
*/