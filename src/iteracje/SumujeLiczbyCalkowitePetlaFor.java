package iteracje;

public class SumujeLiczbyCalkowitePetlaFor {
    public static void main(String[] args) {
//        int suma = 0;
//        for (int i = 0; i <= 100; i++) {
//            suma = suma + i;
//        }
//        System.out.println("suma liczb calkowitych od 1 do 100 = " + suma);

        int suma = 0;
        for (int i = 2; i <= 100; i+=2) {
            suma = suma + i;
        }
        System.out.println("suma liczb parzystych to: " + suma);


        int sumaParzysta = 0;
        for (int x = 2; x <= 100; x++) {
            if (x % 2 == 0)
                sumaParzysta += x;
        }
        System.out.println("suma liczb parzystych to: "  + sumaParzysta);
    }
}
