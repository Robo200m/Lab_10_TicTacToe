import java.util.Scanner;

public class SafeInput {

    public static int getRangedInt(Scanner in, String prompt, int low, int high) {
        int result;
        do {
            System.out.print(prompt + ": ");
            while (!in.hasNextInt()) {
                System.out.print("Invalid input. " + prompt + ": ");
                in.next();
            }
            result = in.nextInt();
        } while (result < low || result > high);
        return result;
    }

    public static boolean getYNConfirm(Scanner in, String prompt) {
        String response;
        System.out.print(prompt + " [Y/N]: ");
        response = in.next().trim().toUpperCase();
        while (!response.equals("Y") && !response.equals("N")) {
            System.out.print("Invalid input. " + prompt + " [Y/N]: ");
            response = in.next().trim().toUpperCase();
        }
        return response.equals("Y");
    }
}