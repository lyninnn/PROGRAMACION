import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alum,coste;
        System.out.println("cuantos alumnos van de viaje");
        alum= in.nextInt();
        if (alum>=100){
            coste=65*alum;
            System.out.println("El coste de 65euros cada alumnos,total coste:"+coste);
        }else if (alum>=50 && alum<=99){
            coste=70*alum;
            System.out.println("El coste de 70euros cada alumnos,total coste:"+coste);
        }else if (alum>=30 && alum<=49){
            coste=90*alum;
            System.out.println("El coste de 90euros cada alumnos,total coste:"+coste);
        }else{
            coste=4000/alum;
            System.out.println("El costo cada alumno: "+coste);
        }


    }
}



