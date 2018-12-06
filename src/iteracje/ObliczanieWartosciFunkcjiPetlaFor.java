package iteracje;

public class ObliczanieWartosciFunkcjiPetlaFor {
    int x;
    int y;

    public static void main(String[] args) {

        int y = 0;

        for (int x = 0; x <= 10; x++) {
            y = 3 * x;
            System.out.println("dla x = " + x + '\t' + "y = " + y);

        }
    }
}
