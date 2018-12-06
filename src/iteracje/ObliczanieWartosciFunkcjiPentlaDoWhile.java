package iteracje;

public class ObliczanieWartosciFunkcjiPentlaDoWhile {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        do {
            y = 3 * x;
            System.out.println("dla x = " + x + "\t" + "y = " + y);
            x++;
        } while (x <= 10);

    }
}
