//ik ben Mike Schardijn en deze code is om een verkoopprijs vast te stellen op basis van de uitkomst van twee vragen
import java.util.Scanner;                                           //anders werkt scanner niet

public class VerkoopPrijs {
    //standaard shit
    public static void main (String[] args) {
        final double BTW_LAAG = 1.06;        //6% btw
        final double BTW_HOOG = 1.21;      //21% btw
        final double honderd = 100;

        Scanner input = new Scanner(System.in);                                                        // anders werkt scanner niet

        System.out.println("Wat is de inkoopprijs an uw product, geef uw antwoord in euro's");          //vraag naar inkoopprijs
        double inkoop = input.nextDouble();

        System.out.println("geef de gewenste winstmarge in een getal(als U dus een winstmarge van 15% wilt moet U 15 intypen)");        //vraag naar winstmarge
        double winstmarge = input.nextDouble();

        double Ewinstmarge = 1+ (winstmarge/honderd);                            //uitkomst scanner bruikbaar maken
        double prijs = Ewinstmarge * inkoop;                                   //deze en de vorige regel hadden eigenlijk wel samen gekunt

        System.out.print("Verkoopprijs exclusief BTW : ");                //uitkomst printen
        System.out.println(prijs);

        System.out.print("Verkoopprijs inclusief 6% BTW : ");
        System.out.println((prijs) * BTW_LAAG);

        System.out.print("Verkoopprijs inclusief 21% BTW : ");
        System.out.println((prijs) * BTW_HOOG);
    }
}