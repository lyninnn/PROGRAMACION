import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//Primer ejercicio
int a = 16;
int b = 10;
a = b;

System.out.println("(a) es igual a: " + a + " y (b) es igual a: " + b);

b = 40;


System.out.println("(a) es igual a: " + a + " y (b) es igual a: " + b);
// Lo que ocurre es que en el primer print b sobresescribió a y en el segundo al dar un nuevo valor a b, este tenia un valor diferente a a

        //Ejercicio 2

        int d = 20, e = 5;
        int c = d+e;
        System.out.println("Resultado de la suma ejercicio 2: " + c);


        //Ejercio 3

        System.out.println("EL resulado de sumar a y b en el ejercicio 3 es: " + (a + b));

        //Ejercicio 4

        System.out.println("Ejercicio 4: " + (d / e));

        //Ejercicio 5
        //LO que el ejercicio te pide es meter dos variables int dentro de huecos float

        float f, g;

        f = a;
        g = d;

        System.out.println("Ejercicio 5 f: " + f + "g: " + g + " Las variables han aparecido con un decimal, siendo este 0");

        // Ejercicio 6

        d = (int) f;

        System.out.println("Ejercicio 6: " + d + " Hay que hacer un castinf para meter la variable float en un espacio de memoria int");

        //Ejercicio 7

        float h = 4.5f;

        System.out.println("Ejercicio 7: " + (d%h) + " El modulo de 10 entre 4.5 sin guardarlo en ninguna variable me da de resultado 1.0");

        //Ejercicio 8

        System.out.println("Ejercicio 8 variable antes de incremento: " + g);
        g++;
        System.out.println("Ejercicio 8 variable despues de incremento: " + g);

        //Ejercicio 9

        int l = 33, m= 44;

        l++;
        System.out.println( "Ejercicio 9:  Variable incrementada: " + l + " Variable sumada: " + (l+m) + " Variable sumada y restando 5: " + (l+m-5));

        //Ejercicio 10

        int o= 73;

        System.out.println("Variable o: " + o + " Decremento de o: " + --o);



        //Ejercicio 11

        char p = 'E';

        System.out.println("Ejercicio 11 imprimiendo caracter: " + p);

        //Ejercicio 12

        System.out.println("Ejercicio 12:  No se puede c" +
                "ambiar las comillas por comillas dobles porque el char solo admite comillas y un caracter dentro, " +
                "las comillas dobles se pueden usar en String, que a su vez admite mas de un caracter dentro");

        //Ejercicio 13

        System.out.println("Ejercicio 13: ");
        char character1, character2;
        character1 = 'H';
        character2='i';
        System.out.println(character1);
        System.out.println( character2);

        //Ejercicio 14

        System.out.println("Ejercicio 14: ");
        boolean paid;
        paid = false;
        System.out.println(paid);

        //Ejercicio 15
        System.out.println("Ejercicio 15: ");
        boolean cambiada= !paid;
        System.out.println(cambiada);

        //Ejercicio 16
        System.out.println("Ejercicio 16:");
        final int THIS_YEAR;
        THIS_YEAR = 2022;
        System.out.println("Hola mundo en el año "+ THIS_YEAR);

        //16 Parte 2

        System.out.println(" Ejercicio 16.2 No se puede hacer porque THIS_YEAR fue declarada como constante con el 'final'");

        //Ejercicio 17

        System.out.println("Ejercicio 17:");
        double pi = 3.141592;
        System.out.println(pi);
        int piEntero = (int) pi;
        System.out.println(piEntero);

        //Ejercicio 18

        System.out.println(pi);





    }
}