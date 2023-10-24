import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ejercicio 8: ");
        int p, q;
        float div;
        System.out.println("Introduce el primer numero");
        p = in.nextInt();
        System.out.println("Introduce el segundo numero");
        q = in.nextInt();
        if (q == 0) {
            System.out.println("Error de numero no puedes introducir un 0");
        } else {
            div = p / q;
            System.out.println("Resultado de division de dos numeros: " + div);

        }
    }





    }