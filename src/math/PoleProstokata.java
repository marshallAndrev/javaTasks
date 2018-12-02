package math;

import java.util.Scanner;

public class PoleProstokata {

    public static void main(String[] args) {

        double a, b;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Podaj dlugosc boku a: ");
            a = scanner.nextDouble();
            System.out.println("Podaj dlugosc boku b: ");
            b = scanner.nextDouble();
            double wynik = a * b;
            System.out.println("Pole prostokata wynosi: " + wynik);
        } catch (Exception e) {
            System.out.println("Polecial wyjatek");
        }





    }

}
