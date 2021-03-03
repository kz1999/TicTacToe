import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String in = sc.nextLine();
        int step = sc.nextInt();
        String[] nums = in.split(" ");
        int[] arr = new int[nums.length];

        Scanner stsc = new Scanner(in);
        for (int i = 0; i < nums.length; i++) {
            arr[i] = stsc.nextInt();
        }
        step = step % arr.length;
        int[] shifted = new int[arr.length];

        for (int i = 0; i < nums.length; i++) {
            int move = (i + step) % arr.length;
            shifted[move] = arr[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(shifted[i] + " ");
        }
    }
}