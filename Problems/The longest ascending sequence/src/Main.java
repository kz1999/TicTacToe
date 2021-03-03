import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int longest = 1;
        int current = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                    current++;
                    if (current > longest) {
                        longest = current;
                    }
            } else {
                current = 1;
            }
        }
        System.out.println(longest);
    }
}