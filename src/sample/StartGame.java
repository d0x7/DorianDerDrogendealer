package sample;

import java.util.Scanner;

public class StartGame
{
    Scanner interaction = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner interaction = new Scanner(System.in);

        System.out.println("Choose on of the following actions to interact:");
        System.out.println("Use 'deal' to start a new deal, use 'chase' to get chased by a cop or 'exit' to exit.");

        while (true) {
            String option = interaction.nextLine();

            DorianDerDrogendealer dorianDerDrogendealer = new DorianDerDrogendealer();
            if (option.equalsIgnoreCase("deal"))
            {
                dorianDerDrogendealer.deal();
                System.out.println("You finished your deal and you can now choose again what you want to do next.");
            }
            else if (option.equalsIgnoreCase("chase"))
            {
                dorianDerDrogendealer.getsChased();
                System.out.println("You escaped successfully, now you can choose something else to do or you can exit the program!");
            }
            else if (option.equalsIgnoreCase("exit"))
            {
                System.exit(0);
            }
            else if (option.equalsIgnoreCase("help"))
            {
                System.out.println("Type stuff in the console to do some sort of interaction or whatever. Type 'list' to get a list of all the commands.");
            }
            else if (option.equalsIgnoreCase("list"))
            {
                System.out.println("Here's a list of all the commands:");
                dorianDerDrogendealer.list();
            }
            else if (option.equalsIgnoreCase("inventory"))
            {
                dorianDerDrogendealer.inventory();
            }
            else
            {
                System.out.println("I'm sorry but '"+option+"' is not a valid option. Type 'help' to get help or use 'list' to get a list of all the commands.");
            }
            System.out.println("Use 'deal' to start a new deal, use 'chase' to get chased by a cop or 'exit' to exit. Type 'help' if you need help.");
        }
    }
}
