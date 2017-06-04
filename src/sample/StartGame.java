package sample;

import java.util.Scanner;

public class StartGame {
    Scanner interaction = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner interaction = new Scanner(System.in);

        System.out.println("Choose on of the following actions to interact:");
        System.out.println("Use 'deal' to start a new deal, use 'chase' to get chased by a cop or 'exit' to exit.");

        while (true) {
            String option = interaction.nextLine();

            if (option.equalsIgnoreCase("deal")) {
                Deal deal = new Deal();
                deal.deal();
                System.out.println("You finished your deal and you can now choose again what you want to do next.");
                System.out.println("Use 'deal' to start a new deal, use 'chase' to get chased by a cop or 'exit' to exit.");
            } else if (option.equalsIgnoreCase("chase")) {
                CopChasing chase = new CopChasing();
                chase.getsChased();
                System.out.println("You escaped successfully, now you can choose something else to do or you can exit the program!");
                System.out.println("Use 'deal' to start a new deal, use 'chase' to get chased by a cop or 'exit' to exit.");
            } else if (option.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                System.out.println("I'm sorry but '" + option + "' is not a valid option");
            }

        }
    }
}
