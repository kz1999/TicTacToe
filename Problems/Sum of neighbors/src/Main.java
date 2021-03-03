import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //File file = new File("C:\\Users\\Kruno\\Downloads\\hyperskill-1932-test-09.txt");

        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(file);

        String text = "";
        String line;

        while(true) {
            if (sc.hasNextLine()) {
                line = sc.nextLine();
                if(!line.equals("end")) {
                    text += line + ':';
                }
            } else {
                break;
            }
        }
        String[] splitRows = text.split(":");

        String[] collumCount = splitRows[0].split(" ");

        int rows = splitRows.length;
        int columns = collumCount.length;

        int[][] mat = new int[rows][columns];
        int i = 0;
        int j = 0;


        for (int x = 0;x < splitRows.length;x++) {
            Scanner input = new Scanner(splitRows[x]);
            while(input.hasNextInt()) {
                mat[i][j] = input.nextInt();
                if (j + 1 < columns) {
                    j++;
                }
            }
            i++;
            j = 0;
        }


        int[][] sum = new int[rows][columns];

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                int add = 0;
                if (b - 1 >= 0) {
                    add += mat[a][b - 1];
                } else {
                    add += mat[a][columns - 1];
                }

                if (b + 1 < columns) {
                    add += mat[a][b + 1];
                } else {
                    add += mat[a][0];
                }

                if (a - 1 >= 0) {
                    add += mat[a - 1][b];
                } else {
                    add += mat[rows - 1][b];
                }

                if (a + 1 < rows) {
                    add += mat[a + 1][b];
                } else {
                    add += mat[0][b];
                }

                sum[a][b] = add;
            }
        }
//        for (int a = 0; a < rows; a++) {
//            for (int b = 0; b < columns; b++) {
//                System.out.print(mat[a][b] + " ");
//            }
//            System.out.println();
//        }
        System.out.println();
        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                System.out.print(sum[a][b] + " ");
            }
            System.out.println();
        }
    }
}