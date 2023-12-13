//ik ben Mike Schardijn en deze code is om een BSA te berekenen uit gegeven cijfers.


//standaard shit
import java.util.Scanner;
public class bsaMONITOR {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);                   // anders werkt scanner niet

        System.out.println("Voer de behaalde cijfers van de vakken in met 1 decimaal" +             //uitleg van de vraag
                "(gebruik een , als kommateken en niet een punt:");

        System.out.println(" ");
        //vraag voor welk cijfer je hebt
        System.out.print("Faster Your Seatbelt:          ");
        double FYS = input.nextDouble();
        System.out.print("Infrastructure:                ");
        double INFRA = input.nextDouble();
        System.out.print("Nederlands:                    ");
        double NL = input.nextDouble();
        System.out.print("Personal & Project Skills:     ");
        double PPS = input.nextDouble();
        System.out.print("Essential Wiskunde Skills:     ");
        double WIS = input.nextDouble();
        System.out.print("Databases:                     ");
        double DATAB = input.nextDouble();
        System.out.print("Embedded Systems 1:            ");
        double EMSY1 = input.nextDouble();
        System.out.print ("English:                       ");
        double ENGL = input.nextDouble();

        //welke studiepunten bij elk vak horen
        int stpuntFYS = 5;
        int stpuntINFRA = 5;
        int stpuntNL = 5;
        int stpuntPPS = 5;
        int stpuntWIS = 2;
        int stpuntEMSY1 = 2;
        int stpuntDATAB = 5;
        int stpuntENGL = 5;
        double NUL = 0.0;
        //om mee te rekenen
        double TOTpunten = stpuntFYS + stpuntDATAB + stpuntEMSY1 + stpuntENGL + stpuntINFRA + stpuntNL + stpuntPPS + stpuntWIS;
        double BEHAALDEpunten = 0;
        final double VOLDOENDEGRAAD = 5.5;   //de voldoendegraad

        System.out.println(" ");        //ik doe dit om een lege regel te hebben omdat ik misschien ben vergeten wat we in de 1e les hebben geleerd
        //wel of niet punten voor FYS
        double FYSPUNTEN = 1;
        if (FYS >= VOLDOENDEGRAAD) {
            double FYSPUNTEN2 = FYSPUNTEN * stpuntFYS;
            System.out.println("Vak/project: Fasten your seatbelts       Cijfer: " +  FYS + " Behaalde punten: "+ FYSPUNTEN2);
            BEHAALDEpunten += FYSPUNTEN2;
        } else {
            double FYSPUNTEN2 = FYSPUNTEN * NUL ;
            System.out.println("Vak/project: Fasten your seatbelts       Cijfer: " +  FYS + " Behaalde punten: "+ FYSPUNTEN2);
        }
        //wel of niet punten voor Infrastructure
        double INFRAPUNTEN = 1;
        if (INFRA >= VOLDOENDEGRAAD) {
            double INFRAPUNTEN2 = INFRAPUNTEN * stpuntINFRA;
            System.out.println("Vak/project: Infrastructure              Cijfer: " +  INFRA + " Behaalde punten: "+ INFRAPUNTEN2);
            BEHAALDEpunten += INFRAPUNTEN2;
        } else {
            double INFRAPUNTEN2 = INFRAPUNTEN * NUL ;
            System.out.println("Vak/project: Infrastructure              Cijfer: " +  INFRA + " Behaalde punten: "+ INFRAPUNTEN2);
        }
        //wel of niet punten voor Nederlands
        double NLPUNTEN = 1;
        if (NL >= VOLDOENDEGRAAD) {
            double NLPUNTEN2 = NLPUNTEN * stpuntNL;
            System.out.println("Vak/project: Nederlands                  Cijfer: " +  NL + " Behaalde punten: "+ NLPUNTEN2);
            BEHAALDEpunten += NLPUNTEN2;
        } else {
            double NLPUNTEN2 = NLPUNTEN * NUL ;
            System.out.println("Vak/project: Nederlands                  Cijfer: " +  NL + " Behaalde punten: "+ NLPUNTEN2);
        }
        //wel of niet punten voor PPS
        double PPSPUNTEN = 1;
        if (PPS >= VOLDOENDEGRAAD) {
            double PPSPUNTEN2 = PPSPUNTEN * stpuntPPS;
            System.out.println("Vak/project: Personal & Project Skills   Cijfer: " +  PPS + " Behaalde punten: "+ PPSPUNTEN2);
            BEHAALDEpunten += PPSPUNTEN2;
        } else {
            double PPSPUNTEN2 = PPSPUNTEN * NUL ;
            System.out.println("Vak/project: Personal & Project Skills   Cijfer: " +  PPS + " Behaalde punten: "+ PPSPUNTEN2);
        }
        //wel of niet punten voor WIS
        double WISPUNTEN = 1;
        if (WIS >= VOLDOENDEGRAAD) {
            double WISPUNTEN2 = WISPUNTEN * stpuntWIS;
            System.out.println("Vak/project: Wiskunde                    Cijfer: " +  WIS + " Behaalde punten: "+ WISPUNTEN2);
            BEHAALDEpunten += WISPUNTEN2;
        } else {
            double WISPUNTEN2 = WISPUNTEN * NUL ;
            System.out.println("Vak/project: Wiskunde                    Cijfer: " +  WIS + " Behaalde punten: "+ WISPUNTEN2);
        }
        //wel of niet punten voor Databases
        double DATABPUNTEN = 1;
        if (DATAB >= VOLDOENDEGRAAD) {
            double DATABPUNTEN2 = DATABPUNTEN * stpuntDATAB;
            System.out.println("Vak/project: Databases                   Cijfer: " +  DATAB + " Behaalde punten: "+ DATABPUNTEN2);
            BEHAALDEpunten += DATABPUNTEN2;
        } else {
            double DATABPUNTEN2 = DATABPUNTEN * NUL ;
            System.out.println("Vak/project: Databases                   Cijfer: " +  DATAB + " Behaalde punten: "+ DATABPUNTEN2);
        }
        //wel of niet punten voor Engels
        double EMSY1PUNTEN = 1;
        if (EMSY1 >= VOLDOENDEGRAAD) {
            double EMSY1PUNTEN2 = EMSY1PUNTEN * stpuntEMSY1;
            System.out.println("Vak/project: Embedded Systems 1          Cijfer: " +  EMSY1 + " Behaalde punten: "+ EMSY1PUNTEN2);
            BEHAALDEpunten += EMSY1PUNTEN;
        } else {
            double EMSY1PUNTEN2 = EMSY1PUNTEN * NUL ;
            System.out.println("Vak/project: Embedded Systems 1          Cijfer: " +  EMSY1 + " Behaalde punten: "+ EMSY1PUNTEN2);
        }
        //wel of niet punten voor Engels
        double ENGLPUNTEN = 1;
        if (ENGL >= VOLDOENDEGRAAD) {
            double ENGLPUNTEN2 = ENGLPUNTEN * stpuntENGL;
            System.out.println("Vak/project: Engels                      Cijfer: " +  ENGL + " Behaalde punten: "+ ENGLPUNTEN2);
            BEHAALDEpunten += ENGLPUNTEN2;
        } else {
            double ENGLPUNTEN2 = ENGLPUNTEN * NUL ;
            System.out.println("Vak/project: Engels                      Cijfer: " +  ENGL + " Behaalde punten: "+ ENGLPUNTEN2);
        }

        //behaalde punten
        System.out.println(" ");
        System.out.println("totaal behaalde punten: "+ BEHAALDEpunten + "/"+ TOTpunten);

        //ik doe het buiten het if command omdat het om een of andere reden dan raar doet
        double Factor = 0.833;
        //of je dat abs dinges hebt of niet
        if (BEHAALDEpunten >= Factor * TOTpunten) {

            System.out.println("je bent op weg om je abs te halen");
        } else {
            System.out.println("je bent helaas niet op weg om je abs te halen");
        }
    }
}
