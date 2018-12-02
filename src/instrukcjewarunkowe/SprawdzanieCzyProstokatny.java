package instrukcjewarunkowe;

import java.util.Scanner;

public class SprawdzanieCzyProstokatny {

    public static void main(String[] args) {
        float a;
        float b;
        float c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        a = scanner.nextFloat();

        System.out.println("Podaj liczbe b: ");
        b = scanner.nextFloat();

        System.out.println("Podaj liczbe c: ");
        c = scanner.nextFloat();

        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            System.out.println("Trojkat prostokatny");
        } else
            System.out.println("Trojkat nie jest prostokatny");
    }
}


