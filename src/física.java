import java.util.Scanner;

public class física {

    public static void main(String[]a){

        Scanner sc = new Scanner(System.in);

        for (int t = 0; t <= 5; t++) {
            double resultado = 0.5 * Math.pow(t,2) * 9.78;
            System.out.println("La distancia despues de "+t+" es de: "+resultado);
        }


    }

}
