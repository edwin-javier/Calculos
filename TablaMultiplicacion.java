package tabla.multiplicacion;



import java.util.Scanner;



public class TablaMultiplicacion {



    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int tabla;

        int j=0;

        int multiplica;

        System.out.println("Introduzca un numero");

        tabla= teclado.nextInt();

        while (true) {

            j++;

            multiplica = tabla*j;

            System.out.println(tabla+"*"+j+"="+multiplica);

            if(j==10) {break;}

        }

    }

    

}
