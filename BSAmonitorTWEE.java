//Mike Schardijn IT101, BSA monitor v2, dit progamma vraagt naar je cijfer en geeft je de bijbehorende
// studiepunten om te checken of je genoeg punten hebt gehaald

//standaard opening
import java.util.Scanner;
public class BSAmonitorTWEE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double DoubleNull = 0;
        int IntNull = 0;


        String[] VAKNamen = {"Faster Your Seatbelt", "Infrastructure", "Nederlands", "Personal & Project Skills",
                "Essential Wiskunde Skills", "Databases", "Embedded Systems 1", "English"};

        //de waarde van VAKCijfers is hetzelfde als die van VAKPunten omdat ik het
        // gekopieerd hebt daarvan en de waarde wordt toch nog vervangen
        double[] VAKCijfers = {7, 6, 2, 3, 7, 5, 3, 10};

        System.out.println("Voer behaalde cijfers in: ");

        //dit vraagt je voor je cijfer
        for (int i = IntNull; i < VAKNamen.length; i++) {
            do {
                System.out.print(VAKNamen[i] + " : ");
                VAKCijfers[i] = input.nextDouble();
                //er wordt telkens opnieuw voor een cijfer gevraagd totdat er een geldig cijfer is
                if (isGeldigCijfer(VAKCijfers[i]) == false) {
                    System.out.println("geef een geldig cijfer tussen de 1 en 10");
                }
            } while (isGeldigCijfer(VAKCijfers[i]) == false);
        }

        double totaalmogelijkpunten = DoubleNull;
        double vijfpuntvijf = 5.5;

        //dit checkt of je een voldoende hebt gehaald en geeft je dan de studiepunten die daar bij horen
        double TotaalPunten = IntNull;
        double[] VAKPunten = {7, 6, 2, 3, 7, 5, 3, 10};
        for (int ii = IntNull; ii < VAKPunten.length; ii++) {
            if (vijfpuntvijf < VAKCijfers[ii]) {
                System.out.println("behaalde studiepunten voor " + VAKNamen[ii] +
                        " heb  je een " + VAKCijfers[ii] + ", de bijbehorende studiepunten zijn : " + VAKPunten[ii]);
                TotaalPunten += VAKPunten[ii];
            } else {
                System.out.println("behaalde studiepunten voor " + VAKNamen[ii] +
                        " heb je een " + VAKCijfers[ii] + ", de bijbehorende studiepunten zijn : 0");
            }
            totaalmogelijkpunten += VAKPunten[ii];
        }

        double vijf = 5;
        double zes = 6;
        double totaalnodigpunten = vijf * (totaalmogelijkpunten / zes);
        //dit checkt of je genoeg punten hebt verzameld
        System.out.println("\ntotaal behaalde studiepunten = " + TotaalPunten + " / " + totaalmogelijkpunten);
        if (TotaalPunten > totaalnodigpunten) {
            System.out.println("je bent goed op weg om je bsa te halen");
        } else {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }
    }


    //deze methode checkt of het cijfer een geldig cijfer is
    static boolean isGeldigCijfer(double cijfer) {
        double een = 1.0;
        double tien = 10.0;
        boolean antwoord = false;
        if (cijfer >= een && cijfer <= tien) {
            antwoord = true;
        }
        return antwoord;
    }
}