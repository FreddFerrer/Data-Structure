import java.util.Arrays;
import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    int[] numeros = {10, 30, 600, 20, 40};

    public void mostrarNumeros() {
        for (int i : numeros) {
            System.out.println("El valor es: " + i + ".");
        }
    }

    public void mostrarNumerosAsendentes() {
        int[] numerosOrdenados = Arrays.stream(numeros).sorted().toArray();
        for (int i : numerosOrdenados) {
            System.out.println("El valor es: " + i + ".");
        }
    }

    // bubble sort
    public void ordenarNumerosManualemte(int[] numeros) {
        {
            int size = numeros.length;

            for (int i = 0; i < size - 1; i++) {

                for (int j = 0; j < size - 1; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
            System.out.println("Creciente: " + Arrays.toString(Arrays.stream(numeros).toArray()));

            for (int i = (numeros.length - 1); i >= 0; i--) {
                System.out.println("Decreciente: " + numeros[i]);
            }
        }

    }
}