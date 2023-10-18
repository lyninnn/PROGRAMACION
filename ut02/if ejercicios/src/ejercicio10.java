import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ejercicio 10: ");
        char hi,ho;
        System.out.println("introduce primer caracter");
        hi=in.next().charAt(0);
        System.out.println("Introduce segundo caracter");
        ho=in.next().charAt(0);
        if (hi==ho){
            System.out.println("son caracter iguales");

        }
        else {
            System.out.println("No son iguales");
        }
    }





    }