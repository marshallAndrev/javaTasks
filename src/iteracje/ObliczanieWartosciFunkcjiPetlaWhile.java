package iteracje;

public class ObliczanieWartosciFunkcjiPetlaWhile {
    public static void main(String[] args) {
        int x = 0;
        int y;

        while (x <=10) {
            y = x * 3;
            System.out.println("dla x = " + x + '\t' + "y =  " + y);
            x++;
        }
    }
}
