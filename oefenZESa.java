import java.util.Scanner;
public class oefenZESa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Hoeveel cijfers wilt u invoeren? ");
        double aantal = input.nextDouble();
        do {
            if (MeerDanNull(aantal) != true) {
                System.out.println("  Aantal cijfers moet groter zijn dan 0!");

                System.out.print("Hoeveel cijfers wilt u invoeren? ");
                aantal = input.nextDouble();
            }
        } while (MeerDanNull(aantal) != true);

        int a = (int)aantal;

        double[] cijfers = new double[a];

        for (int i = 0; i < aantal; i++) {
            System.out.print("Cijfer student " + (i + 1) + ": ");
            cijfers[i] = input.nextDouble();

        }

        System.out.println("\nAantal cijfers : " + aantal);

        double totaal = 0;
        for (int i = 0; i < aantal; i++) {
            totaal += cijfers[i];
        }
        double gemmidelde = (totaal / aantal);
        System.out.println("Gemiddelde cijfer: " + ((int)gemmidelde));


        double voldoendes = (Voldoendes(cijfers));

        System.out.println("Aantal voldoendes: " + ((int)voldoendes));
        double max = 0;

        for (int i = 0; i < cijfers.length; i++) {
            //Compare elements of array with max
            if(cijfers[i] > max) {
                max = cijfers[i];
            }
        }
        System.out.println("Hoogste cijfer : " + max);

    }
    public static boolean MeerDanNull (double waarde){
        boolean geldig = false;
        if (waarde > 0){
            geldig = true;
        }
        return geldig;
    }
    public static double Voldoendes (double[] lijst) {
        double voldoendes = 0;
        for (int i = 0; i < lijst.length; i++) {
            if ((lijst[i]) > 5.5) {
                voldoendes++;
            }
        }return voldoendes;
    }
}
