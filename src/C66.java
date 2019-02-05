import java.util.Random;

public class C66 {
    public void start() {
        int[][] salesReport = new int[3][12];
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Random random = new Random();

        for (int i = 0; i < salesReport[1].length; i++) {
            salesReport[0][i] = random.nextInt(500);
            salesReport[1][i] = random.nextInt(100);
        }
        System.out.print("Months:    ");
        for (int i = 0; i < months.length; i++) {
            System.out.format("%-4s", months[i]);
        }

        System.out.println();
        System.out.print("Product 1: ");
        for (int i = 0; i < salesReport[0].length; i++) {
            System.out.format("%-4d", salesReport[0][i]);
        }
        System.out.println();
        System.out.print("Product 2: ");
        for (int i = 0; i < salesReport[1].length; i++) {
            System.out.format("%-4d", salesReport[1][i]);
        }

        System.out.println();
        System.out.print("Total:     ");

        int[] colsums = new int[12];

        for (int i = 0; i < salesReport.length; i++) {
            for (int j = 0; j < salesReport[i].length; j++) {
                colsums[j] += salesReport[i][j];
            }
        }
        int index_min = 0;
        int index_max = 0;

        for(int i=0; i< colsums.length; i++){
            System.out.format("%-4d", colsums[i]);

            if(colsums[i] < colsums[index_min]) index_min = i;
            if(colsums[i] > colsums[index_max]) index_max = i;
        }

        System.out.println();
        System.out.println("Lowest month of sales: " + months[index_min]);
        System.out.println("Highest month of sales: " + months[index_max]);

    }

    /*
    6. Write a program in Java using two dimensional array
    that creates the sales report from January to December in Allie Marketing Incorporated.
    Determine the highest and lowest month of sales.
     */
}