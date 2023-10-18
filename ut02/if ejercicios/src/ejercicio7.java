import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio7 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Ejercicio 7:");
        int o;
        System.out.println("Introduce un numero");
        o = in.nextInt();
        if (o % 2 == 0) {
            if (o % 3 == 0) {
                System.out.println("Es multiples de 2 y 3");

            } else {
                System.out.println("no es multiples de 2 y 3");

            }
        } else {
            System.out.println("no es multiple de 2 y 3");
        }


    }





    }