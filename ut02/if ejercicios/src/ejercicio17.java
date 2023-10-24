import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ejercicio 17: ");
        int h,m,s;


        System.out.println("Introduce la hora");
        h=in.nextInt();
       System.out.println("Introduce minutos");
       m= in.nextInt();
       System.out.println("Introcue el segundo");
        s= in.nextInt();

        if (((h>=0) && (h<24)) && ((m>=0)&&(m<60)) && ((s>0) && (s<60))){
            System.out.println("es una hora valida");
            System.out.println(+h+":"+m+":"+s);

        } else if (h>=0&&h<10 && m>=0&&m<10 && s>=0&&s<10) {
            System.out.println();

        } else {
            System.out.println("No es una hora valida");
        }

        }

}