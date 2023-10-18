import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ComparacionNumeros {
    public static void main(String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Ejercicio 1: ");
        //pedir numero a
        System.out.println("Numero a: ");
        a = in.nextInt();
        //pedir numero b
        System.out.println("Numero b: ");
        b = in.nextInt();

        //comienzo preguntar
        if (a > b) {
            //condicio es true
            System.out.println("El numero mayor introducido es ..." + a);
        } else {
            //condicion es false
            if (a == b) {
                System.out.println("los numeros introducidos son iguales");
            } else {
                System.out.println("El numero mayor introducido es ..." + b);
            }

        }

        System.out.println("Ejercicio 2: ");
        int c;

        System.out.println("Introduce un numero: ");
        c = in.nextInt();
        if (c % 2 == 0) {
            System.out.println("El numero introducido es numero par");

        } else {
            System.out.println("El numero introducido es impar");

        }

        System.out.println("Ejercicio 3: ");
        int d;
        System.out.println("Indica un numero");
        d = in.nextInt();
        if (d > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        System.out.println("Ejercicio 4: ");
        int e, f;
        System.out.println("Indica un numero");
        e = in.nextInt();
        f = e % 10;
        System.out.println("El numero introducido es: " + e);

        if (f == 0) {
            System.out.println("El numero introducido es multiple de 10");
        } else {
            System.out.println("El numero introducido no es multiples de 10");
        }


        System.out.println("Ejercicio 5: ");
        int g, h;
        System.out.println("Introduce el primer numero");
        g = in.nextInt();
        System.out.println("Introduce el segundo numero");
        h = in.nextInt();
        System.out.println("Primer numero: " + g + " segundo numero: " + h);
        if (g % 10 == h % 10) {
            System.out.println("El numero introducidos termina en misma cifra");
        } else {
            System.out.println("El numero introducidos no termina en misma cifra");
        }

        System.out.println("Ejercicio 6: ");
        int k, k1, k2;
        System.out.println("Introduce un numero");
        k = in.nextInt();
        k1 = k % 3;
        k2 = k % 5;
        if (k1 == 0) {

            if (k2 == 0) {
                System.out.println("Es multiples de 3 y 5");
            } else {
                System.out.println("no es multiplo de 3 y 5");
            }
        } else {
            System.out.println("no es multiples de 3 y 5");

        }
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
        System.out.println("Ejercicio 8: ");
        int p, q;
        float div;
        System.out.println("Introduce el primer numero");
        p = in.nextInt();
        System.out.println("Introduce el segundo numero");
        q = in.nextInt();
        div = p / q;
        if (q == 0) {
            System.out.println("Error de numero no puedes introducir un 0");
        } else {
            System.out.println("Resultado de division de dos numeros: " + div);
        }

        System.out.println("Ejercicio 9: ");
        int m, l;
        int mayor, menor;
        System.out.println("Introduce el primer numero");
        m = in.nextInt();
        System.out.println("Introduce el segundo numero");
        l = in.nextInt();

        if (m > l) {
            mayor = m / l;
            System.out.println("Resultado: " + mayor);
        } else {
            menor = l / m;
            System.out.println("Resultado: " + menor);
        }
        if (l==0){
            System.out.println("ERROR");
        }
        else {
            System.out.println("error");
        }

    }





    }