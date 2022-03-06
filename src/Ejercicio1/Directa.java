package Ejercicio1;

public class Directa {

    public static int[] seleccion(int[] arreglo) {

        int i, j, menor, pos, tmp;

        for (i = 0; i < arreglo.length - 1; i++) {      // tomamos como menor el primero
            menor = arreglo[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición

            for (j = i + 1; j < arreglo.length; j++){ // buscamos en el resto
                if (arreglo[j] < menor) {           // del array algún elemento
                    menor = arreglo[j];             // menor que el actual
                    pos = j;
                }
            }

            if (pos != i){                   // si hay alguno menor se intercambia
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = tmp;
            }
        }
        return arreglo;
    }

    public static void imprimirSeleccion(){
        //Valores que tiene el arreglo desordenado.
        int arreglo[] = {5,3,7,28,30,12,47};
        int arregloOrdenado[] = seleccion(arreglo);

        for (int i = 0; i < arregloOrdenado.length; i++){
            System.out.println(arregloOrdenado[i]);
        }
    }
}
