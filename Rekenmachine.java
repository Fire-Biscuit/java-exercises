//Mike Schardijn, IT101: Een werkende rekenmachine
//anders werkt de scanner niet
import java.util.Scanner;

//standaard opening
public class Rekenmachine {

    public static void main(String[] args) {
        //anders werkt de scanner niet
        Scanner input = new Scanner(System.in);
        char Operator = 'Q';
        int NUL = 0;
        //het progamma gaat door totdat de stop operator wordt ingevoerd
        do {
            //vraagt de operator
            System.out.print("Operator (S = stoppen): ");
            Operator = input.next().charAt(NUL);

            if (Operator != 'S') {
                //als de operator ongeldig is vraagt dit naar een nieuwe operator net zo lang totdat je een geldige operator geeft
                do{
                if (isGeldigeOperator(Operator) != true) {
                    System.out.println("Operator is ongeldig\n");
                    System.out.print("\nOperator (S = stoppen): ");
                    Operator = input.next().charAt(NUL);
                    }
                }while(isGeldigeOperator(Operator) != true);
                    //dit voert de som uit
                    if (isGeldigeOperator(Operator) == true && Operator != 'S') {
                        System.out.print("Eerste getal: ");
                        double Egetal1 = input.nextDouble();
                        System.out.print("Tweede getal: ");
                        double Egetal2 = input.nextDouble();
                        System.out.print(Egetal1 + " " + Operator + " " + Egetal2 + " = ");
                        printBerekening(Operator, Egetal1, Egetal2);
                        System.out.println("\n");
                    }
            }
        }while (Operator != 'S');
        }

        //dit checkt of het gegeven karakter een geldige operator is
    static boolean isGeldigeOperator(char karakter) {
        boolean antwoord = false;
        if (karakter == '+' || karakter == '-' || karakter == '*' ||
                karakter == '/' || karakter == '%' || karakter == 'S') {
            antwoord = true;
        }
        return antwoord;
    }
    //deze methode voert en print de berekening uit
    static void printBerekening(char operator, double getal1, double getal2){
        if (operator == '+'){
            System.out.print(getal1 + getal2);
        } else if (operator == '-'){
            System.out.print(getal1 - getal2);
        } else if (operator == '*'){
            System.out.print(getal1 * getal2);
        } else if (operator == '/'){
            System.out.print(getal1 / getal2);
        } else if(operator == '%'){
            System.out.print(getal1 % getal2);
        }
    }
}

