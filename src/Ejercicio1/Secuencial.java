package Ejercicio1;

public class Secuencial {

    public static void busquedaSecuencial(){

        int[] lista = new int[100];	// Lista de números enteros que supondremos llena.
        boolean encontrado = false;	// Declaramos e inicializamos una bandera.
        int i = 0;			// Declaramos e inicializamos un índice.

        while ( (i < 100) && !encontrado ){
            if (lista[i++] == 13){		// Incrementamos el índice después de la comparación
                encontrado = true;
            }
        }

        // Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
        if (encontrado){
            System.out.println("Sí hay algún valor 13 en la lista.");
        }else{
            System.out.println("No hay ningún valor 13 en la lista.");
        }
    }
}

