package project;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        Operations c = new Operations();
        System.out.println("Choose your language:\n1 - Português\n2 - English\n");

        int choice = 0;
        ResourceBundle rb = Main.languageOption(InputChoice(choice));

        System.out.println(rb.getString("choice"));
        int option = SC.nextInt();
        int o = Main.InputOption(option ,rb);

        System.out.println(rb.getString("number"));
        double n1 = SC.nextDouble();
        double n2 = SC.nextDouble();
        double result = 0.0;

        switch (o) {
            case 1:
                result = c.calculaSoma(n1, n2);
                break;

            case 2:
                result = c.calculaSub(n1, n2);
                break;

            case 3:
                result = c.calculaSMult(n1, n2);
                break;

            case 4:
                result = c.calculaDiv(n1, n2);
                break;
        }
        System.out.println(rb.getString("result") + " " + result);

    }
    //functions
    private static int InputChoice(int choice){
        do {
            if(choice != 0) {
                System.out.println("Invalid input. Choose a correct option");
            }
            choice = SC.nextInt();
        }while ((choice < 1 || choice > 2));

        return choice;
    }

    private static int InputOption(int option, ResourceBundle rb){
        while ((option < 1 || option > 4)){
            System.out.println(rb.getString("error"));
            option = SC.nextInt();
        }
        return option;
    }

    private static ResourceBundle languageOption(int invalidInput) {
        ResourceBundle rb = null;

        switch (invalidInput) {
            case 1:
                rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
                break;
            case 2:
                rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
                break;
        }
        return rb;
    }

}
