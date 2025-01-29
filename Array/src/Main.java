import Ejerc1.Ejerc1;
import Ejerc2.Ejerc2;
import Ejerc3.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        int[] numeros = {10, 20, 10, 30, 40};

        //array.mostrarNumeros();
        //array.mostrarNumerosAsendentes();
        //System.out.println("****************************");
        //array.ordenarNumerosManualemte(numeros);

        /*EJERC 1
        Ejerc1 ejerc1 = new Ejerc1();

        ejerc1.pedirTexto();
        */

        /*EJERC 2
        Ejerc2 ejerc2  = new Ejerc2();

         ejerc2.eliminarNumerosArray(numeros);
         */

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.buscarNumeroEnArray(numeros, 10);

    }
}