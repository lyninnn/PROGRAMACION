import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ejercicio 15: ");
        int n;
        System.out.println("Introduce un año");
        n=in.nextInt();
       if (n%400==0){
           System.out.println("Es año bisiesto");
       }else if (n%100==0){
           System.out.println("No es año bisiesto");
       }else if (n%4==0){
           System.out.println("Es año bisiesto");
       }else {
           System.out.println("No es un año bisiesto");
       }




    }







}