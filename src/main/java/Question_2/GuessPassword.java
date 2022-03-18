package Question_2;

import java.util.Scanner;

public class GuessPassword {
    String secretPassword = "Basketball";

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String secretPassword = "Basketball";
        int wrongAttempts = 0;
        boolean checkPassword = true;
        System.out.println("Guess my secret password");
        String enteredPass = userInput.nextLine();

        if ("Basketball".equals(enteredPass)) {
            System.out.println("logged in");
        } else {
            while (checkPassword) {
                System.out.println("try again");
                System.out.println("Hint: sport with uppercase letter");
                enteredPass = userInput.nextLine();
                ++wrongAttempts;

                if (enteredPass.equals(secretPassword)) {
                    System.out.println("logged in");
                    System.out.println("Wrong attempts: " + wrongAttempts);
                    break;
                }
            }
        }



    }
}
