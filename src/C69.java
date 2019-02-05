import java.util.Scanner;

public class C69 {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of employees: ");
        String numberOfEmployeesInput = scanner.nextLine();
        int numberOfEmployees;

        if (numberOfEmployeesInput.isEmpty() || !Character.isDigit(numberOfEmployeesInput.charAt(0))) {
            numberOfEmployees = 30;
        } else {
            numberOfEmployees = Integer.parseInt(numberOfEmployeesInput);
        }
        System.out.println("The number of employees is: " + numberOfEmployeesInput);
        String[][] emlpoyeesInformation = new String[numberOfEmployees][2];

        for (int i = 0; i < emlpoyeesInformation.length; i++) {
            System.out.print("Enter Employee's name: ");
            String name = scanner.nextLine();
            emlpoyeesInformation[i][0] = name;
            for (int j = 1; j < emlpoyeesInformation[0].length; j++) {
                System.out.print("Enter " + name + "'s job description: ");
                String desc = scanner.nextLine();
                emlpoyeesInformation[i][j] = desc;
            }
        }

    }
}
/*
Write a program of a list to 30 employee's name, job description and store them in the array employee's information.
*/