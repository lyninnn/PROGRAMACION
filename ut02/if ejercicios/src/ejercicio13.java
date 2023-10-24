import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ejercicio 13: ");
        int base,exponente;
        double ok;

        System.out.println("Introduce un numero");
        base=in.nextInt();
        System.out.println("Introduce un exponente");
        exponente=in.nextInt();

        if (exponente>0){
            ok=Math.pow(base,exponente);
            System.out.println("Resultado: "+ok);
        }
        else if (exponente==0){
             System.out.println("Resultado es 1");
            }
            else
            {
                System.out.println("Resultado es "+(1/Math.pow(base,-exponente)));
            }
    }







}