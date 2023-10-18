import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Primer numero: ");

        int a=  in.nextInt();
        System.out.println("Segundo numero: ");
        int b= in.nextInt();
        System.out.println("Tercer numero: ");
        int c= in.nextInt();
        System.out.println("El resultado de tu operación es: "+(a+b+c));

        System.out.println("Ejercicio 2: ");
        int pro = 5;
        int ssf = 6;
        int bae = 4;
        int lnt = 8;
        int fol = 9;
        int lnd = 7;
        int ets = 5;
        float medio = ((pro+ssf+bae+lnt+fol+lnd+ets)/7f);

        System.out.println("Materia "+" Nota");
        System.out.println("PRO      "+pro);
        System.out.println("SSF      "+ssf);
        System.out.println("BAE      "+bae);
        System.out.println("LNT      "+lnt);
        System.out.println("FOL      "+fol);
        System.out.println("LND      "+lnd);
        System.out.println("ETS      "+ets);
        System.out.println("Promedio: "+medio);

        System.out.println("Ejercicio 3: ");
        Scanner on = new Scanner(System.in);
        System.out.println("Que movil quieres comprar? ");
        String movil = on.nextLine();
        System.out.println("Cuanto cuesta?");
        int precio = on.nextInt();
        System.out.println();


        float interes = (float) ((precio * 0.07) * 2);
        float ptotal = precio + interes;
        float letra = ptotal/24;

        System.out.println("Precio movil "+movil+" :"+precio+"€");
        System.out.println("Intereses totales de sobrecoste de 2 años: "+interes+"€");
        System.out.println("Coste total del movil con interese: "+ptotal+"€");
        System.out.println("letra mes: "+ letra +"€");

        System.out.println("Ejercicio 4: ");
        int X= 5;
        int Y= 4;
        double N=1.4;
        double M= 7.4;
        System.out.println("X: "+X);
        System.out.println("Y: "+Y);
        System.out.println("N: "+N);
        System.out.println("M: "+M);
        System.out.println("La suma de X+Y: "+(X+Y));
        System.out.println("La diferencia de X-Y: "+(X-Y));
        System.out.println("X*Y: "+(X*Y));
        System.out.println("X/Y: "+(X/Y));
        System.out.println("X%Y: "+(X%Y));
        System.out.println("N+M: "+(N+M));
        System.out.println("N-M: "+(N-M));
        System.out.println("N*M: "+(N*M));
        System.out.println("N/M: "+(N/M));
        System.out.println("N%M: "+(N%M));
        System.out.println("X+N: "+(X+N));
        System.out.println("Y/M: "+(Y/M));
        System.out.println("Y%M: "+(Y%M));
        int X2 = X*2;
        int Y2= Y*2;
        double N2= N*2;
        double M2=M*2;
        System.out.println("Variable X:"+X+" el doble es: "+X2);
        System.out.println("Variable Y:"+Y+" el doble es: "+Y2);
        System.out.println("Variable N:"+N+" el doble es: "+N2);
        System.out.println("Variable M:1"+M+" el doble es: "+M2);
        double total = X+Y+N+M;
        System.out.println("La suma de todas las variables: "+total);
        double producto= X*Y*N*M;
        System.out.println("El producto de todas las bariables: "+producto);

        System.out.println("Ejercicio 5: ");
        Scanner en = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int numero= en.nextInt();
        System.out.println("Cuantos quieres potencial?");
        int potencial1= en.nextInt();
        double potencial=Math.pow(numero,potencial1);
        System.out.println("Número: "+numero);
        System.out.println("Potencia: "+potencial1);
        System.out.println("Resultado: "+potencial);

        System.out.println("Ejercicio 6: ");
        Scanner zx= new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int z = en.nextInt();
        double resultado1= Math.sqrt(z);

        System.out.println("Número: "+z);
        System.out.println("Raíz cuadrada de "+z+":"+resultado1);
//https://masqueprogramar.wordpress.com/2018/05/14/area-volumen-esfera-java/
        System.out.println("Ejercicio 7: ");
        Scanner c1 = new Scanner(System.in);
        System.out.println("Radio de una esfera?");
        int radio= c1.nextInt();
        double pi=Math.PI;
        double cuadrado=Math.sqrt(radio);
        System.out.println("Superficie de la esfera: "+(4)*(pi)*(cuadrado));

        System.out.println("Ejercicio 8: ");
        Scanner c2= new Scanner(System.in);
        System.out.println("Cuantos pesas?");
        int peso=c2.nextInt();
        System.out.println("Cuantos mides en metro?");
        float altura=c2.nextFloat();
        double altura2=Math.pow(altura,2);
        double ims =peso /altura2;

        System.out.println("Peso: "+peso+"Kg,"+"Altura: "+altura+"m");
        System.out.println("IMS= "+ims);

        System.out.println("Ejercicio 9: ");







    }
}