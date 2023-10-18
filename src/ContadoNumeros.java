import java.util.Scanner;

public class ContadoNumeros {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int numeros = 0;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;


        for (int i = 0 ; i < 10; i++){

            numeros = s.nextInt();

            if (numeros < 0) {
                negativos++;
            }
            else if (numeros > 0) {
                positivos++;
            }
            else {
                ceros++;
            }
        }
        System.out.println(" Numeros positivos: "+positivos);
        System.out.println(" Numeros negativos: "+negativos);
        System.out.println(" Numero de ceros: "+ceros);
    }

}
