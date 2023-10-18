import java.util.Scanner;

public class CuantosBuses {

    public static void main(String[] ARGS) {

        Scanner s = new Scanner(System.in);

        int TamanoGrupo = 0;
        int NumeroBuses = 0;
        int TotalGrupo = 0;


        do {
            System.out.print(" Personas del grupo (0=FIN) ");
            TamanoGrupo = s.nextInt();
            TotalGrupo = TamanoGrupo + TotalGrupo;


            if (TamanoGrupo < 0) {
                System.out.println(" No puede ser negativo el tamaño del grupo...");
            } else {
                System.out.println(" Apuntados.Van: " + TotalGrupo);
            }



        } while (TamanoGrupo != 0);
        while (TotalGrupo > 0){
            TotalGrupo = TotalGrupo - 55;
            NumeroBuses = NumeroBuses + 1;
        }
        System.out.println(" El numero de buses son "+NumeroBuses);


    }

}
