package Ejerc3;

import java.util.Arrays;

//CONTRAS DE ESTO: si hay mas de 1 numero iguales en el array solo te devuelve la posicion del último.

public class BinarySearch {

    public void buscarNumeroEnArray(int[] array, int numBuscado) {
        int indice = Arrays.binarySearch(array, numBuscado);
        System.out.println("El elemento " + numBuscado + " está en la posición " + indice + " del array.");
    }
}
