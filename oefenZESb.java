import java.util.Scanner;
public class oefenZESb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hoe groot moet de array zijn (5..25)? ");
        int aantal = input.nextInt();
        do{
            if (GeldigGetal(aantal) != true){
                System.out.println(" De grootte moet tussen 5 en 25 liggen! Doe nog een poging.");
                System.out.print("Hoe groot moet de array zijn (5..25)? ");
                aantal = input.nextInt();
            }
        }while (GeldigGetal(aantal) != true);

        System.out.println("\n");
        int[] cijfers = new int[aantal];
        for (int i = 0; i < aantal; i++) {
            double a = ( (10 * Math.random() ) );
            cijfers[i] = (int)a;
            System.out.print(cijfers[i] + " ");
        }

        System.out.print("\n\nWelk getal moet ik zoeken (0..9)? ");
        int zoekgetal = input.nextInt();

        int KomtVoor = 0;
        for (int i = 0; i < aantal; i++) {
            if (cijfers[i] == zoekgetal){
                KomtVoor += 1;
            }
        }
        System.out.println("\nHet getal " + zoekgetal + " komt " + KomtVoor + " keer voor in de lijst");
        double x = (double)KomtVoor;
        double y = (double)aantal;
        double percentage = (( x / y) * 100);
        System.out.println("Dat betekent dat " + percentage + "% van de getallen in de array gelijk is aan " + zoekgetal + ".");

    }
    public static boolean GeldigGetal (double aantal){
        boolean antwoord = false;
        if (aantal >= 5 && aantal <= 25){
            antwoord = true;
        }
        return antwoord;

    }
}
