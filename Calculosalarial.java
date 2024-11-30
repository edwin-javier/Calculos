package calculosalarial;



import java.util.Scanner;



public class Calculosalarial {



    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int salario;

        int horas;

        int shora = 40;

        int Extras = 40;

        int horasExt;

        int ganadoExt;

        int trabajo;

        System.out.println("Horas trabajadas");

        horas = teclado.nextInt();

        if (horas<=40){

            int shoras = 40;

            salario = horas*shoras;

            System.out.println("salario es" + salario);

        }

        if (horas>40){

            int shoras;

            int trabajado = horas*12;

            horasExt = horas - 40;

            ganadoExt = horasExt*Extras;

            salario = trabajado + ganadoExt;

            System.out.println("el salario es " + salario);

                  

        }

    }

    

}
