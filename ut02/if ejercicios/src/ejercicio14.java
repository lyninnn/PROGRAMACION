import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ejercicio 14: ");
        int n,e;
        char s;

        System.out.println("Introduce tu nota");
        n=in.nextInt();
        System.out.println("Introduce tu edad");
        e=in.nextInt();
        System.out.println("Introduce tu genero M o F");
        s=in.next().charAt(0);
        if ((n==5) && (e>=18) && ((s==77)||(s==109))){
            System.out.println("POSIBLE ");

        }else if ((n>5)&&(e>=18)&&((s==77)||(s==109))){
            System.out.println("Aceptada");
        }else if ((n>=5) && (e>=18) && ((s==70)||(s==102))){
            System.out.println("ACEPTADA");

        }else{
            System.out.println("NO ACEPTADA");
        }


    }







}