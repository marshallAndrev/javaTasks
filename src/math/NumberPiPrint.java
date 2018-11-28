package math;

public class NumberPiPrint {

    public static void main(String[] args) {

        //printf change print to format print(speclial metod)
        //%6.5f means we reserve space to print 6 (1 is ineger 5 are after .
        System.out.printf("PI = " + "%6.5f", Math.PI);
        
        //sqrt from pi
        System.out.printf("\n" + "Pierwiastek kwadratowy: " + "%2.2f", Math.sqrt(Math.PI));

    }
}
