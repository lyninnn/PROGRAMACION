import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ejercicio 14: ");
        int n;


        System.out.println("Introduce un tres cifras");
        n=in.nextInt();
        if ((n>=100)||(n<=000) && (n<=999)){
            if ((n%10)==(n/100)){
                System.out.println("Es numero capicua");
            }else {
                System.out.println("No es numero capicua");
            }
            } else{
                System.out.println("No es tres cifras");
            }
        }










}