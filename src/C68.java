import java.util.Scanner;



/* For User Input
 String[][] questions = new String[20][6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.print("Please enter " + (i + 1) + " question: ");
            String question = scanner.nextLine();
            questions[i][0] = question;
            for (int j = 0; j < questions[0].length - 1; j++) {
                if (j == questions[0].length - 2) {
                    System.out.print("Please Enter the Answer Letter: ");
                    String answer = scanner.nextLine().toUpperCase();
                    questions[i][j] = answer;
                } else {
                    System.out.print("Please Enter the " + (j + 1) + " choice: ");
                    String choice = scanner.nextLine();
                    questions[i][j] = choice;
                }
            }
        }

 * */


public class C68 {
    public void start() {
        String[][] questions =
                {
                        {"What was the name of first computer designed by Charlse Babbage?", "A) Analytical Engine", "B) Difference Engine", "C) Colossus", "D) ENIAC", "B"},
                        {"Which was the first electronics digital programmable computing device?", "A) Analytical Engine", "B) Difference Engine", "C) Colossus", "D) ENIAC", "C"},
                        {"EDSAC stands for __________.", "A) Electronic Delay Storage Automatic Calculator", "B) Electronic Delay Storage Automatic Computer", "C) Electronic Data Storage Automatic Calculator", "D) Electronic Data Storage Automatic Computer", "A"},
                        {"EDVAC stands for __________.", "A) Electronic Discrete Variable Automatic Calculator", "B) Electronic Discrete Variable Automatic Computer", "C) Electronic Data Variable Automatic Calculator", "D) Electronic Data Variable Automatic Computer", "B"},
                        {"Which was the first commercial computer?", "A) Ferranti Mark 1", "B) Analytical Engine", "C) Difference Engine", "D) Colossus", "A"},
                        {"UNIAC stands for __________.", "A) Universal Automatic Calculator", "B) Universal Native Input Automatic computer", "C) Universal Native Input Automatic calculator", "D) Universal Automatic Computer", "D"},
                        {"ENIAC stands for __________.", "A) Electronic Numerical Integrator And Computer", "B) Electronic Numerical Integrator And Calculator", "C) Electronic Numerical Integrator Automatic Computer", "D) Electronic Numerical Integrator Automatic Calculator", "A"},
                        {"John Mauchly and J. Presper Eckert are the inventors of __________ computer.", "A) UNIAC", "B) ENIAC", "C) EDSAC", "D) Ferranti Mark 1", "B"},
                        {"Who invented the punch card?", "A) Charles Babbage", "B) Semen Korsakov", "C) Herman Hollerith", "D) Joseph Marie Jacquard", "C"},
                        {"In the late __________, Herman Hollerith invented data storage on punched cards that could then be read by a machine.", "A) 1860", "B) 1900", "C) 1890", "D) 1880", "D"},
                        {"Which electronic components are used in First Generation Computers?", "A) Transistors", "B) Integrated Circuits", "C) Vacuum Tubes", "D) VLSI Microprocessor", "C"},
                        {"Which electronic components are used in Second Generation Computers?", "A) Transistors", "B) Integrated Circuits", "C) Vacuum Tubes", "D) VLSI Microprocessor", "A"},
                        {"Which electronic components are used in Third Generation Computers?", "A) Transistors", "B) Integrated Circuits", "C) Vacuum Tubes", "D) VLSI Microprocessor", "B"},
                        {"Which electronic components are used in Fourth Generation Computers?", "A) Transistors", "B) Integrated Circuits", "C) Vacuum Tubes", "D) VLSI Microprocessor", "D"},
                        {"Which electronic components are used in Fifth Generation Computers?", "A) Integrated Circuits", "B) Vacuum Tubes", "C) VLSI Microprocessor", "D) ULSI Microprocessor", "D"},
                        {"ENIAC Computer belongs to __________.", "A) First Generation Computers", "B) Second Generation Computers", "C) Third Generation Computers", "D) Fourth Generation Computers", "A"},
                        {"VLSI Stands for __________.", "A) Very Large Storage Integration", "B) Very Large Storage Integrator", "C) Very Large Scale Integration", "D) Very Large Scale Integrator", "C"},
                        {"ULSI Stands for __________.", "A) Ultra Large Storage Integration", "B) Ultra Large Scale Integration", "C) Ultra Large Storage Integrator", "D) Ultra Large Scale Integrator", "B"},
                        {"__________ is used as a programming language in first generation computers?", "A) FORTRAN", "B) COBOL", "C) BASIC", "D) Machine Language", "D"},
                        {"FORTRAN stands for __________.", "A) For Translation", "B) Format Transformation", "C) Fork Transformation", "D) Formula Translation", "D"},
                };


        String[] allAnswers = new String[20];
        for (int i = 0; i < questions.length; i++) {
            allAnswers[i] = questions[i][5];
        }

        //Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question number " + (i + 1));
            System.out.format("%-4s\n", questions[i][0]);

            for (int j = 1; j < questions[0].length - 1; j++) {
                System.out.format("%4s\n", questions[i][j]);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input your Answer: ");
            String answer = scanner.nextLine().toUpperCase();
            System.out.println();
            if (answer.equals(allAnswers[i])) {
                score++;
                System.out.println("Good Job! Your score now is: " + score);
            } else {
                System.out.println("Incorrect, better luck next time!");
            }
            System.out.println();
        }

        System.out.println("Your Final Score is: " + score);
    }
}