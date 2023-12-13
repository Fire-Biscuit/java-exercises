import java.util.Scanner;
public class OEFENTOETScomputeronderdeel {

    public static void main(String[] args) {

        System.out.println("Mike Schardijn it101 [500911074], ");
        Scanner input = new Scanner(System.in);

        int line = 0;

        do {
            System.out.print("hoeveel computer onderdelen wilt u kopen: ");
            line = input.nextInt();
            input.nextLine();
            if (GetalGeldig(line) == false){
                System.out.println("Ongeldig getal, geef een getal tussen de 1 en 25");
            }
        } while (GetalGeldig(line) == false);

        double[] ONDERDEELprijs = new double[line];

        String [] ONDERDEELomschrijving = new String[line];

        System.out.println("Geef per onderdeel de omschrijving:");
        for (int i = 1; i < ONDERDEELomschrijving.length + 1; i++) {
            System.out.print("      " + i + ": ");
            String woorden = input.nextLine();
            ONDERDEELomschrijving[i - 1] = woorden;
        }
        double totaalprijs = 0;
        System.out.println("Geef voor elk onderdeel de verkoopprijs: ");
        for (int i = 1; i < ONDERDEELomschrijving.length + 1; i++) {
            System.out.print("      " + ONDERDEELomschrijving[i - 1] + ": ");
            ONDERDEELprijs[i - 1] = input.nextDouble();
            totaalprijs += ONDERDEELprijs[i - 1];
        }
        System.out.println("De totaalprijs van alle producten is € " + totaalprijs);
        
    }
    static boolean GetalGeldig(double getal) {
        boolean antwoord = false;
        if (getal >= 1.0 && getal <= 25.0) {
            antwoord = true;
        }
        return antwoord;
    }
}
