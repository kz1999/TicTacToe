import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        int right = size - 1;
        int bottom = size - 1;
        int left = 0;
        int top = 0;
        int pointer = left;

        int n = 1;

        while(left <= right && top <= bottom) {
            for (pointer = left; pointer <= right; pointer++) {
                arr[left][pointer] = n++;
            }
            top++;
            for (pointer = top; pointer <= bottom; pointer++) {
                arr[pointer][right] = n++;
            }
            bottom--;
            for (pointer = bottom; pointer >= left; pointer--) {
                arr[right][pointer] = n++;
            }
            for (pointer = bottom; pointer >= top; pointer--) {
                arr[pointer][left] = n++;
            }
            left++;
            right--;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}