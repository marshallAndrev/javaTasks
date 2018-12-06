package instrukcjewarunkowe;

import java.util.Scanner;

public class WartoscXzRownania {

    public static void main(String[] args) {
        float a, b, c, x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        a = scanner.nextInt();

        System.out.println("Podaj liczbe b: ");
        b = scanner.nextInt();

        System.out.println("Podaj liczbe c: ");
        c = scanner.nextInt();

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Podaj prawidlowa wartosc");
        } else {
            x = (c - b)/2;
            System.out.println("Wartosc x: " + x);
        }
    }
}
