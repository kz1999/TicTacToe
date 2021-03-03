import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        boolean found = false;

        for (int el : array) {
            if(el == num) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}