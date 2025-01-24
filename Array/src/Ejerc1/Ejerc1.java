package Ejerc1;

// Escribe un programa que pida al usuario que introduzca un texto y una letra.
// Después el programa tiene que calcular y presentar por pantalla, cuantas veces aparece la letra en el texto.

import java.util.Scanner;

public class Ejerc1 {
    Scanner scanner = new Scanner(System.in);

    public void pedirTexto(){
        int contador = 0;
        System.out.println("Introduza un texto");

        String textoIngresado = scanner.nextLine();

        System.out.println("Introduzca un caracter");

        String c = scanner.next();

        for (int i = 0; i < textoIngresado.length(); i++) {
            if (textoIngresado.charAt(i) == c.charAt(0)) {
                contador++;
            }
        }

        System.out.println("El caracter " + c + " aparece " + contador + " veces en el texto " + textoIngresado);

    }
}
