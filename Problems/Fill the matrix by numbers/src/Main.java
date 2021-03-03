import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = Math.abs(i - j);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}