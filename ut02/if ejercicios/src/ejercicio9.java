import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ejercicio 9: ");
        int m, l;
        int mayor, menor;
        System.out.println("Introduce el primer numero");
        m = in.nextInt();
        System.out.println("Introduce el segundo numero");
        l = in.nextInt();

        if (m > l) {

            mayor = m;
            menor =l;

        } else {
            menor=m;
            mayor=l;
        }


        if (menor==0){
            System.out.println("ERROR");
        }
        else {
            System.out.println("Resultado: "+mayor/menor);
        }

    }





    }