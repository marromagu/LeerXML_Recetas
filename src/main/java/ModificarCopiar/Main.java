/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ModificarCopiar;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Main {

    public static void main(String[] args) {
        /*
        1.	Leer ficheros XML con ese formato.
        2.	Añadir una nueva receta (pidiendo datos por pantalla)
        3.	Modificar el título de la receta.
        4.	Eliminar la receta.
        0.      Salir del programa.
         */
        Recetas miReceta = new Recetas();
        int opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1 -> {
                    miReceta.leerXMLconDOM();
                }
                default ->
                    throw new AssertionError();
            }
            opcion = menu();
        }
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("____ <==> ____\n"
                + "\\___\\(**)/___/\n"
                + " \\___|  |___/ \n"
                + "     L  J \n"
                + "     |__|\n"
                + "      vv");
        System.out.println("------------------------------------------------------------");
        System.out.println("| 1.	Leer ficheros XML con ese formato.                   |");
        System.out.println("| 2.	Añadir una nueva receta (pidiendo datos por pantalla)|");
        System.out.println("| 3.	Modificar el título de la receta.                    |");
        System.out.println("| 4.	Eliminar la receta.                                  |");
        System.out.println("------------------------------------------------------------");

        return sc.nextInt();

    }
}
