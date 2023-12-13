import java.util.Scanner;

public class oefenZESc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean klaarVRAAGTEKEN = false;
        int AantalKeerRaden = 0;

        int NULL = 0;
        int EEN = 1;
        int TWEE = 2;
        int DRIE = 3;

        int[] getallen = genereerGetallen();
        System.out.print("(cheats)" + getallen[NULL] + " " + getallen[EEN] + " " + getallen[TWEE] + "\n");

        do {
            AantalKeerRaden++;

            System.out.print("Geef 3 verschillende getallen tussen 1 en 10, gescheiden door spaties: ");
            int[] zoekgetallen = new int[DRIE];


            for (int i = NULL; i < zoekgetallen.length; i++) {
                zoekgetallen[i] = input.nextInt();
            }

            int goedegetallen = NULL;
            for (int i = NULL; i < getallen.length; i++) {

                if (zoekgetallen[i] == getallen[0] || zoekgetallen[i] == getallen[1] || zoekgetallen[i] == getallen[2]) {
                    goedegetallen++;
                }
            }
            System.out.println("Aantal correcte getallen = " + goedegetallen);
            if (goedegetallen == DRIE) {
                klaarVRAAGTEKEN = true;
            }
        } while (klaarVRAAGTEKEN != true);
        System.out.println("\nU heeft " + AantalKeerRaden + " keer geraden.");
        System.out.println("De te raden getallen waren: " + +getallen[0] + " " + getallen[1] + " " + getallen[2]);

    }

    public static int[] genereerGetallen() {

        int NULL = 0;
        int EEN = 1;
        int TWEE = 2;
        int DRIE = 3;
        int NEGEN = 9;

        int[] list = new int[DRIE];
        do {

            for (int i = NULL; i < list.length; i++) {
                list[i] = (int) ((Math.random() * NEGEN) + EEN);
            }
        } while (list[NULL] == list[EEN] || list[NULL] == list[TWEE] || list[EEN] == list[TWEE]);
        return list;
    }

    public static boolean komtVoorIn(int zoekgetal, int[] lijst) {

        int NULL = 0;
        int EEN = 1;
        int TWEE = 2;

        return zoekgetal == lijst[NULL] || zoekgetal == lijst[EEN] || zoekgetal == lijst[TWEE];
    }
}
