import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        int[][] mat = new int[i][j];

        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                mat[x][y] = sc.nextInt();
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[i];

        for (int x = 0; x < i; x++) {
            arr[x] = mat[x][a];
        }
        for (int x = 0; x < i; x++) {
            mat[x][a] = mat[x][b];
        }
        for (int x = 0; x < i; x++) {
            mat[x][b] = arr[x];
        }
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
    }
}