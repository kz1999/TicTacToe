import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                if (i + 1 < array.length && array[i + 1] == m) {
                    found = true;
                    break;
                }
            }
            if (array[i] == m) {
                if (i + 1 < array.length && array[i + 1] == n) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found);
    }
}