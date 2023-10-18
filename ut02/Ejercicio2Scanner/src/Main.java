
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Como te llamas? ");
        String nombre=in.nextLine();

        System.out.println("En que año naciste?");
        int edad = in.nextInt();

        System.out.println("cuanto dinero quieres cobrar en bruto cuando acabes el ciclo?");
        long salario = in.nextLong();

        System.out.println("Nombre: "+ nombre);
        System.out.println("Año nacidos: "+edad);
        System.out.println("Salario: "+salario);
        float salary=0.75f;
        System.out.println("Salario neto es: "+salario*salary);
        float anual=14f;
        System.out.println("Salario anual de 14 pagas: "+(salario*salary)*anual);

    }
}