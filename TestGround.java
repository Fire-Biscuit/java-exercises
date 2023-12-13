import java.util.Arrays;
import java.util.Scanner;

public class TestGround {
    public static void main(String[] args) {
        boolean klaar = false;
        int aantalPogingen = 0;
        int aantalCorrect = 0;
        int[] rij = genereerGetallen();
        while (aantalCorrect != 3) {
            aantalPogingen++;
            for (int x : rij)
                System.out.println("cheat " + x);
            System.out.print("\ngeef 3 getallen met spatie en sluit af met enter: ");
            Scanner input = new Scanner(System.in);
            int[] getal = {0, 0, 0};
            for (int i = 0; i < 3; i++) {
                getal[i] = input.nextInt();
            }
            System.out.println("test getallen:");
            for (int g : getal) {
                System.out.println(g);
            }
            aantalCorrect = 0;
            for (int x : getal) {
                if (komtVoorIn(x, rij) == true) {
                    aantalCorrect++;
                }
            }
            System.out.println("Aantal correcte getallen = " + aantalCorrect);
        }
        System.out.printf("U heeft %d keer geraden.\n", aantalPogingen);
        System.out.print("De te raden getallen waren: ");
        for (int x : rij) System.out.print(x + " ");
        System.out.println();
    }
    public static boolean komtVoorIn(int zoekgetal, int[] lijst) {
        return zoekgetal == lijst[0] || zoekgetal == lijst[1] || zoekgetal == lijst[2];
    }
    public static int[] genereerGetallen() {
        int[] rij;
        do {
            rij = new int[]{(int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1,
                    (int) (Math.random() * 10) + 1};
        } while (rij[0] == rij[1] || rij[0] == rij[2] || rij[1] == rij[2]);
        Arrays.sort(rij);
        return rij;
    }
}