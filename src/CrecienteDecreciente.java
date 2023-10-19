import java.util.Scanner;

public class CrecienteDecreciente {

    public static void main(String[] args) {

        System.out.println(" Introduce la secuencia de numeros ");

        Scanner s = new Scanner(System.in);
        int numeros = 0;

        do {
            numeros = s.nextInt();

            if (numeros == numeros++) {
                System.out.println(" Es creciente ");
            } else if (numeros == numeros--) {
                System.out.println(" Es decreciente ");
            } else if ( numeros < 0){
                System.out.println(" No es ni creciente ni decreciente ");

            }
        } while ( numeros < 0);
        numeros = s.nextInt();

        System.out.println(" No se han introducido numeros ");

    }

}


