package Ejercicio1;

public class Burbuja {

    public static int[] burbuja(int[] arreglo){

        int auxiliar;
        int[] arregloOrdenado;

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j + 1] < arreglo[j]) {
                    auxiliar = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }

        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;

    }

    public static void imprimirBurbuja(){
        //Valores que tiene el arreglo desordenado.
        int arreglo[] = {2, 4, 27, 12, 15, 8, 5};
        int arregloOrdenado[] = burbuja(arreglo);

        //imprimimos el arreglo ordenado.
        for(int i = 0; i < arregloOrdenado.length; i++){
            System.out.println(arregloOrdenado[i]);
        }
    }
}
