package math;

import java.util.Scanner;

public class FunkcjeMatymatyczne {
//    float x, y;
//
//    public FunkcjeMatymatyczne(float x, float y) {
//        this.x = x;
//        this.y = y;
//    }

//    public float dodawanie(float x, float y) {
//        float result;
//        result = x + y;
//        return result;
//    }
//
//    public float odejmowanie(float x, float y) {
//        float result;
//        result = x - y;
//        return result;
//    }
//
//    public float mnozenie(float x, float y) {
//        float result;
//        result = x * y;
//        return result;
//    }
//
//    public float dzielenie(float x, float y) {
//        float result;
//        result = x / y;
//        return result;
//    }

    public static void main(String[] args) {
        float x, y, dodawanie, odejmowanie, mnozenie, dzielenie;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartosc x: ");
        x = scanner.nextFloat();

        System.out.println("Podaj wartosc y: ");
        y = scanner.nextFloat();

        dodawanie = x + y;
        odejmowanie = x - y;
        mnozenie = x * y;
        dzielenie = x / y;

        System.out.println("Dodawanie: " + dodawanie);
        System.out.println("Odejmowanie: " + odejmowanie);
        System.out.println("Mnozenie: " + mnozenie);
        System.out.println("Dzielenie: " + dzielenie);

    }
}
