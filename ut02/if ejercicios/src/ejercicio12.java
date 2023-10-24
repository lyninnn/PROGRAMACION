import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ejercicio 12: ");
        char hi;
        System.out.println("introduce primer caracter");
        hi=in.next().charAt(0);

        int ascii= hi;
        if (ascii>96 && ascii<123){
            System.out.println("El caracter introducido es minuscula");


        }else if (ascii>64 && ascii<91){
            System.out.println("El caracter introducido es mayusculla");
        }
        else if(ascii>47 && ascii<58){

            System.out.println("El caracter introducido es un numero");
        }
            else{
                System.out.println("El caracter introducido no es un numero ni un letra");
            }
        }






    }