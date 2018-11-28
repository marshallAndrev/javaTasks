package math;
import java.util.Scanner;

public class ObjetoscKuli {

    public static void main(String[] args) {
        double r, objetoscKuli;
        System.out.println("Podaj promien kuli: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextDouble();

        //poniesienie do potegi 3stopnia liczby r
        objetoscKuli = 4 * Math.PI  * Math.pow(r,3)/3;
        System.out.printf("Objetosc kuli wynosi: " + "%2.2f", objetoscKuli);

    }
}
