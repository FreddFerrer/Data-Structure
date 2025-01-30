package Ejerc4;

//dado un arreglo donde un solo numero aparece una vez, y todos los demas aparecen 2 veces
//como identifico el numero unico (el que no se repite)?

public class Ejerc4 {

    public void identificarNumeroUnico(int[] array){


        for(int i = 0; i < array.length; i++){
            int contador = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    contador++;
                }
            }
            if (contador == 1){
                System.out.println("el numero que no se repite es " + array[i]);
            }
        }
    }
}
