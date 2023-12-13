//Programming – oefenopdracht 5a
//Gezondheidstest
import java.util.Scanner;

public class oefenEEN {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String[] onderwerp = {"hartslag", "lichaamstemperatuur", "bovendruk"};
        double[] min = {55,36.3,100};
        double[] max = {90,37.5,140};
        double waarde[] = new double [3];
        String[] meetvorm = {" slagen per minuut", " graden celcius", " mm Hg"};

        for (int i = 0; i < 3; i++) {
            System.out.print(onderwerp[i] + " tussen " + min[i] + " en " + max[i] + " " + meetvorm[i] + ": ");
            waarde[i] = input.nextDouble();
        }
        System.out.println("\n");

        for (int ii = 0; ii < 3; ii++) {
            if( isTussen(waarde[ii], min[ii], max[ii]) == true ){
                System.out.println("je " + onderwerp[ii] + " is WEL gezond");
            } else {
                System.out.println("je " + onderwerp[ii] + " is NIET gezond");
            }
        }
    }
    static boolean isTussen(double waarde, double min, double max){
        boolean isTussen = false;
        if (waarde >= min && waarde <= max){
            isTussen = true;
        }
        return isTussen;
    }
}
