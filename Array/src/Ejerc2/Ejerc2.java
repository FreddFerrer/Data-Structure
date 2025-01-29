package Ejerc2;

//Escribe un programa que busque un valor dentro de un array de integers y borre todas sus ocurrencias,
// reduciendo la dimensión del array.
// Es decir, no vale con poner cero en el lugar donde encontremos el valor.

import java.util.Arrays;
import java.util.Scanner;

public class Ejerc2 {

    Scanner scanner = new Scanner(System.in);
    
    int[] arrayInt = {45, 5, 7, 89, 4, 1, 5, 10};
    
    public void eliminarNumerosArray(int[] array){

        int contadorArrayOriginal = array.length;

        System.out.println("que numero quieres eliminar del array?");
        int numeroABorrar = scanner.nextInt();

        int ocurrencias = 0;

        for (int j : array) {
            if (j == numeroABorrar) {
                ocurrencias++;
            }
        }

        System.out.println("ocurrencias " + ocurrencias);

        int[] arrayNuevo = new int[contadorArrayOriginal - ocurrencias];

        for (int i = 0; i < arrayNuevo.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] != numeroABorrar) {
                    arrayNuevo[i] = array[j];
                    i++;
                }
            }
        }
        System.out.println("El array viejo es: " + Arrays.toString(Arrays.stream(array).toArray()));
        System.out.println("El array nuevo es: " + Arrays.toString(Arrays.stream(arrayNuevo).toArray()));


    }
}
