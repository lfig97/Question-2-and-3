package Question_3;

/*Prompt a user to enter if they think the temperature is High, Low or Humid
Based on the user's input print out one of these
High: print out " sunblock may be needed"
Low : print out " a coat may be needed"
Humid: print out " it's muggy!"*/

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Is the temperature High, Low, or Humid");
        String temp = userInput.nextLine();

        switch (temp) {
            case "High", "high" -> System.out.println("sunblock may be needed");
            case "Low", "low" -> System.out.println("a coat may be needed");
            case "Humid", "humid" -> System.out.println("it's muggy!");
        }

    }
}
