package instrukcjewarunkowe;

import java.util.Random;
import java.util.Scanner;

public class LiczbyPseudolosowe {
    public static void main(String[] args) {
        int wylosuj, zgadnij;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("zgadnij jaka liczba zostanie wylosowana: ");
        zgadnij = scanner.nextInt();
        wylosuj = random.nextInt(10);

        if (wylosuj == zgadnij) {
            System.out.println("brawo trafiles");
        } else {
            System.out.println("bardzo mi przykro, ale wylosowana liczba to: " + wylosuj);
            System.out.println("sprobuj jescze raz");
        }

//        boolean b = random.nextBoolean();
//        System.out.println(b);
//
//        //generator ciagow losowych ze stringa
//        String str = "abcdefghijklmnoprstwz";
//        int dlugoscStringa = str.length();
//        System.out.println("Dlugosc stringa to: " + dlugoscStringa);
//
//        String klucz = "";
//
//        for (int i = 0; i < 8; i++) {
//            int pos = random.nextInt(21);
//            klucz = klucz + str.charAt(pos);
//        }
//        System.out.println(klucz);


    }
}
