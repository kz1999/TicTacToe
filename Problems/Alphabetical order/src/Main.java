import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean isOrder = true;
        String string = scanner.next();

        while (scanner.hasNext()) {
            String nextString = scanner.next();

            if (string.compareTo(nextString) > 0) {
                isOrder = false;
                break;
            }
            string = nextString;
        }
        System.out.println(isOrder);
    }
}