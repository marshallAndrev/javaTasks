package math;

public class BezResztyZdzielenia {

    int a, b;

    public BezResztyZdzielenia(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void bez() {
        int result;

        result = a / b;
        System.out.println("Wynik bez reszty: " + result);
    }

    public void reszta() {
        int result;

        result = a % b;
        System.out.println("Wynik z reszta: " + result);
    }

    public static void main(String[] args) {

        BezResztyZdzielenia bezReszty = new BezResztyZdzielenia(37,11);
        BezResztyZdzielenia zReszta = new BezResztyZdzielenia(37,11);

        bezReszty.bez();
        zReszta.reszta();


    }

}
