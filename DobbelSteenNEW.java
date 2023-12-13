//Mike Schardijn, IT101: rollen tot je gooit wat je wilt
//anders werkt de scanner niet
import java.util.Scanner;

//standaard opening
public class DobbelSteenNEW {

    public static void main(String[] args) {

        //anders werkt de scanner niet
        Scanner input = new Scanner(System.in);

        //vraag hoeveel ogen de gebruiker wilt rollen
        System.out.print("Geef hier het/de karakter(s) dat U wilt gebruiken voor de ogen (dit kan zijn wat je maar wilt,\n" +
                " ik raad wel aan om niet al te grote woorden te gebruiken anders ziet het er raar uit): ");
        String Karaker = input.nextLine();

        //vraag hoeveel ogen de gebruiker wilt rollen
        System.out.print("Geef hier het aantal ogen waarvoor U wilt rollen: ");
        int GewensteOgen = input.nextInt();

        //verschillende vairabelen, ik doe het in integers(hoe je dat ook spelt) zodat ik niet nog extra moet afronden
        int Zes = 6;
        int EEN = 1;
        int NUL = 0;
        int Cijfer = NUL;
        int Rolls = NUL;

        //dit is de loop waar een "dobbelsteen" wordt gegooid zodat er gekeken kan worden of het gewenste aantal ogen is gegooid
        do {
            //dit reset het getal weer aan het begin van elke loop, anders wordt het oneindig groot
            Cijfer = Cijfer * NUL;

            //dit rolt een willekeurig getal tussen de 1 en 6
            Cijfer += (Math.random() * Zes) + EEN;

            //de loop die check wat er is gegooid en print dan het goede aantal ogen uit
            switch (Cijfer) {
                case 1:
                    //dit print het gegenereerde aantal ogen
                    System.out.println("     " + Karaker + "\n\n\n\n");
                    //+1 bij de teller over hoe vaak je gooit
                    Rolls += EEN;
                    break;
                case 2:
                    System.out.println(Karaker + "\n\n\n           " + Karaker + "\n");
                    Rolls += EEN;
                    break;
                case 3:
                    System.out.println(Karaker + "\n" + "      " + Karaker + "\n"+"          " + Karaker + "\n\n");
                    Rolls += EEN;
                    break;
                case 4:
                    System.out.println(Karaker + "          " + Karaker + "\n\n\n" + Karaker + "         " + Karaker + "\n");
                    Rolls += EEN;
                    break;
                case 5:
                    System.out.println(Karaker + "          " + Karaker + "\n  " + "    " + Karaker + "\n" + Karaker +  "          "   + Karaker + " \n\n");
                    Rolls += EEN;
                    break;
                case 6:
                    System.out.println(Karaker  + "          " +  Karaker  +  "\n" + Karaker   + "          "  + Karaker + "\n" + Karaker  + "          "  +  Karaker + "\n\n");
                    Rolls += EEN;
                    break;
            }
        }
        //de loop gaat opnieuw totdat het gewenste aantal ogen is gerolt
        while (Cijfer != GewensteOgen);
        //in het stukje tekst hierboven kan GewensteOgen vervangen worden met 6 en dan dit progamma door gaan totdat 6 gegooid wordt,
        //maar ik vond het leuker als je zelf kan bepalen waar je voor gooit maar de theorie achter de code is nog gewoon hetzelfde

        //print uit een felicitatie en vertelt je hoe vaak er gegooid is
        System.out.println("Gefeliciteerd, je hebt (eindelijk) een "+ GewensteOgen + " gogooid!");
        System.out.println("Aantal keer gegooid: " + Rolls);
    }
}
