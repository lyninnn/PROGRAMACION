import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        char c;
        System.out.println("Introduce un numero de 0 a 10");
        n = in.nextInt();
        if (n>=0 && n<=10) {
            if (n < 5 && n >= 0) {
                System.out.println("I");
            } else if (n == 5) {
                System.out.println("S");
            } else if (n==6) {
                System.out.println("B");
            } else if (n >= 7 && n== 9) {
                System.out.println("N");
            } else if (n == 10) {
                System.out.println("M");
            } else {
                System.out.println("No es un numero entre 0 y 10");
            }
        }

    }
}



