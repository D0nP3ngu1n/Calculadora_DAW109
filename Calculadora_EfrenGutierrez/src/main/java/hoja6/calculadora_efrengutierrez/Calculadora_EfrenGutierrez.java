/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja6.calculadora_efrengutierrez;

import java.util.Scanner;

/**
 *
 * @author DAW109
 */
public class Calculadora_EfrenGutierrez {

    static Scanner scanner = new Scanner(System.in);
    static int opcion = -1; //opción del menú
    static int numero1 = 0, numero2 = 0; //Variables de entrada

    public static void main(String[] args) {
        System.out.println("Bienvenido a tu calculadora");
        while (opcion != 0) {
            System.out.println("Elige opción:\n" + ""
                    + "1.- Sumar\n"
                    + "2.- Restar\n"
                    + "3.- Multiplicar\n"
                    + "4.- Dividir\n"
                    + "0.- Salir");

            System.out.println("Selecciona una opción de 0 a 4");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    pideNumeros();
                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                }
                case 2 -> {
                    pideNumeros();
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                }
                case 3 -> {
                    pideNumeros();
                    System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                }
                case 4 -> {
                    pideNumeros();
                    System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                }
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción no disponible");
            }

            System.out.println("\n");
        }

    }

    //Método para recoger las variables de entrada
    public static void pideNumeros() {
        System.out.println("Introduce el primer número:");
        numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        numero2 = scanner.nextInt();

    }
}
   

