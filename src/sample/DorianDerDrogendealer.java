package sample;

import java.util.Scanner;

public class DorianDerDrogendealer {

    protected int colour = (int) (Math.random() * (2)) + 1;
    protected int b;
    protected int gift = (int) (Math.random() * (9)) + 1;
    protected String gift2 = null;
    protected int chape = (int) (Math.random() * (2)) + 1;


    public void deal() {
        Scanner deal = new Scanner(System.in);
        System.out.println("Ohh hey there. Need some dope? Then I am your man!");
        while (true) {

            String request = deal.nextLine();

            try {

                if (Drug.valueOf(request.toUpperCase()) == null) {
                    throw new Exception();
                    //System.out.println("Ohh I'm sorry man, don't have what you're searching for... Maybe want to check out my other stuff?");
                    //continue;
                }
            } catch (Exception e) {
                System.out.println("Ohh I'm sorry man, don't have what you're looking for... Maybe want to check out some of my other stuff?");
                continue;
            }


            Drug drug = Drug.valueOf(request.toUpperCase());

            switch (drug) {
                case COCAINE:
                    System.out.println("You want cocaine uh? Tell me how many grammes you want!");

                    int value = deal.nextInt();

                    try {
                        if (value <= 0 || value > 999)
                            throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Yo I'm sorry bro, but this is out of my league...");
                        continue;
                    }
                    System.out.println("Here you have your " + value + " grammes of cocaine. Always a pleasure to make a deal with you!");
                    b++;
                    break;
                case SHROOMS:
                    System.out.println("I see you're more of a nature guy. So how many of these little pieces of gold do you want?");
                    int value2 = deal.nextInt();

                    try {
                        if (value2 <= 0 || value2 > 99)
                            throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Yo I'm sorry bro, but this is out of my league...");
                        continue;
                    }
                    System.out.println("Here you have your " + value2 + " pieces of gold. Always a pleasure to make a deal with you!");
                    b++;
                    break;
                case WEED:
                    System.out.println("Still more of a nature guy but a little softer? Well everyone started somewhere. Tell me how many packets do you want. 10g each.");
                    int value3 = deal.nextInt();

                    try {
                        if (value3 <= 0 || value3 > 99)
                            throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Yo I'm sorry bro, but this is out of my league...");
                        continue;
                    }
                    System.out.println("Here you have your " + value3 + " packs of weed. Always a pleasure to make a deal with you!");
                    b++;
                    break;
                case MDMA:
                    System.out.println("Need it for next rave party or do you just want to have some fun, boy? Tell me how many crystals you want...");
                    int value4 = deal.nextInt();

                    try {
                        if (value4 <= 0 || value4 > 99)
                            throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Yo I'm sorry bro, but this is out of my league...");
                        continue;
                    }
                    System.out.println("Here you have your " + value4 + " crystals. Have fun and always a pleasure to make a deal with you!");
                    b++;
                    break;
                case ECSTASY:
                    System.out.println("Want some ecstasy huh? Have fun at the next party boy!");
                    int value5 = deal.nextInt();

                    try {
                        if (value5 <= 0 || value5 > 99)
                            throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Yo I'm sorry bro, but this is out of my league...");
                        continue;
                    }
                    System.out.println("Here you have your Ecstasy. Always a pleasure to make a deal with you!");
                    System.out.println("*gives some ecstasy to little boy*");
                    b++;
                    break;
                case SPEED:
                    System.out.println("You need a little push to get your exams done huh? Then I'm your man, tell me, how much?");
                    int value6 = deal.nextInt();

                    try {
                        if (value6 <= 0 || value6 > 999)
                            throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Yo I'm sorry bro, but this is out of my league...");
                        continue;
                    }
                    System.out.println("Here you have your " + value6 + " grammes of speed. Always a pleasure to make a deal with you!");
                    b++;
                    break;
                case NO_THANKS:

                    //gift2 = (int)(Math.random()*(1))-1==1 ? "GPU" : "Skin";
                    if ((int) (Math.random() * (2)) + 1 == 1) gift2 = "GPU";
                    else gift2 = "Skin";
                    if (b > 3) {
                        System.out.println("You must have been in a need! You know what, today is a good day for me, so I want it to be a good day for you too, I'll give you a gift!");
                        System.out.println("*you give " + gift + " " + gift2 + "'s to customer*");
                        System.out.println("See you around!");
                        System.exit(0);
                    } else {
                        System.out.println("Ohh I see... See you around");
                    }
                    return;
            }
            System.out.println("Do you want something else or is that enough?");
            String request2 = deal.nextLine();
        }

    }

    public void getsChased() {
        String cop = null;
        String physique = null;
        if (colour == 1) cop = "white";
        else cop = "black";
        if (chape == 1 && colour == 1) physique = "fat";
        else physique = "sporty";
        Scanner escape = new Scanner(System.in);
        System.out.println("A " + cop + " cop is chasing you. You need to escape! Decide what you want to do to not get caught!");
        while (true) {
            String action = escape.nextLine();
            try {
                if (ChaseOption.valueOf(action.toUpperCase()) == null)
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("That's not a viable option, you might want to rethink and choose again");
                continue;
            }
            ChaseOption option = ChaseOption.valueOf(action.toUpperCase());

            switch (option) {
                case RUN:
                    if (colour == 1 && chape == 1) {
                        System.out.println("You choose to run and you were lucky because he's really fat and you could escape. But maybe it's not that easy the next time so be careful...");
                        return;
                    } else if (colour == 1 && chape != 1) {
                        System.out.println("You choose to run and you got the lead but he's catching up so you might need consider another option...");
                        String action2 = escape.nextLine();
                        option = ChaseOption.valueOf(action2.toUpperCase());

                        switch (option) {
                            case RUN:
                                System.out.println("Didn't work though you got caught. I told you, you need to consider another option... Have fun in prison you dumbass!");
                                System.exit(0);
                            case SHOOT:
                                System.out.println("You escaped because they were too scared to continue running after you. But no one got hurt because your shots were inaccurate as fuck... Next time remember to take you Desert Eagle instead of you R8...");
                                return;
                            case DROP_ITEMS:
                                System.out.println("You lost all your stuff but you could escape without any trouble.");
                                return;
                            case OFFER_TO_SMOKE:
                                System.out.println("You offered a white cop to smoke... I think that was not a good idea cause they're not so chill...");
                                System.exit(0);
                        }
                    } else {
                        System.out.println("I'm sorry but he was Usain Bolt... You got caught.");
                        System.exit(0);
                    }
                    break;
                case OFFER_TO_SMOKE:
                    if (colour == 1 && chape == 1) {
                        System.out.println("Yo that was a white cop and they're often not that chill, but were lucky and he accepted your offer. But not every cop would do that so be careful.");
                        return;
                    } else if (colour == 1 && chape != 1) {
                        System.out.println("Yo that was a white cop, they're not so chill.. Next time be more careful...");
                        System.exit(0);
                    } else {
                        System.out.println("Yo have fun boii!");
                        return;
                    }
                case DROP_ITEMS:
                    if (colour == 1)
                        System.out.println("You lost all your stuff but you could escape without any trouble.");
                    else
                        System.out.println("You could escape without any trouble but that guy's smoking all your weed over there...");
                    return;
                case SHOOT:
                    if (colour == 1 && chape == 1) {
                        System.out.println("Yo that was not a good idea because he's got a lot of friends... You're put on trial and sentenced to death by cumshot...");
                        System.exit(0);
                    } else
                        System.out.println("You took your Deagle out and shot that cop in his fuckin' face bitch...");
                    return;
            }
        }

    }

}
