package math;

import java.util.Scanner;

public class FunkcjeMatymatyczne {
    float x, y;

    public FunkcjeMatymatyczne(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float dodawanie(float x, float y) {
        float result;
        result = x + y;
        return result;
    }

    public float odejmowanie(float x, float y) {
        float result;
        result = x - y;
        return result;
    }

    public float mnozenie(float x, float y) {
        float result;
        result = x * y;
        return result;
    }

    public float dzielenie(float x, float y) {
        float result;
        result = x / y;
        return result;
    }

    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartosc x: ");
        x = scanner.nextFloat();

        System.out.println("Podaj wartosc y: ");
        y = scanner.nextFloat();
    }
}
