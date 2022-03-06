package Ejercicio1;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static String leerOpcion() {
        return sc.nextLine();
    }

    public static void crearMenu() {

        System.out.println("""
                 Elija la opción que desee realizar:
                 
                1. Método de la burbuja
                2. Selección directa
                3. Ordenación rápida o Quick sort
                4. Búsqueda binaria
                5. Búsqueda secuencial
                6. Salir del programa
                  """);

    }

    public static void pintarMenu() {

        String opc;
        boolean salir = false;

        do {
            crearMenu();
            opc = leerOpcion();

            switch (opc) {

                case "1":
                    System.out.println("El arreglo ordenado con el método de la burbuja quedaría así:" );
                    Burbuja.imprimirBurbuja();
                    System.out.println("");
                    break;

                case "2":
                    System.out.println("El arreglo ordenado por selección directa quedaría así:");
                    Directa.imprimirSeleccion();
                    System.out.println("");
                    break;

                case "3":
                    System.out.println("El arreglo ordenado por quicksort quedaría así:");

                    break;

                case "4":
                    Binaria.busquedaBinaria();
                    System.out.println("");
                    break;

                case "5":
                    Secuencial.busquedaSecuencial();
                    System.out.println("");
                    break;

                case "6":
                    salir = true;
                    break;

                default:
                    System.out.println("Esta opción no se encuentra en el menú, por favor escoja una de las opciones ofrecidas en él.");
            }

        } while (!salir);
    }

}

