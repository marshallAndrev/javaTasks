package iteracje;

import java.util.Random;

public class NajwiekszaNajmniejszaLiczbaZeZbioru {
    public static void main(String[] args) {
        int max, min, suma;
        int liczba;
        int zbiorLosowanych = 5;
        Random random = new Random();
        min = random.nextInt(100);
        max = min;
        System.out.print("wylosowane liczby to: ");

        for (int i = 0; i < zbiorLosowanych; i++) {
            liczba = random.nextInt(100);
            System.out.print(liczba + " ");
            if (max < liczba) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
        }
        //System.out.println("suma liczb " + suma);
        System.out.println();
        System.out.print("min to: " + min + "\t" + "max to: " + max);
    }
}
