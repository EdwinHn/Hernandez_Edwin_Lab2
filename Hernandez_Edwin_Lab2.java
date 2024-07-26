/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_notas;

import java.util.Scanner;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Lab2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        int cicloMenu = 0;
        int opcion = 0;

        while (cicloMenu == 0) {

            System.out.println("--- MENÚ ----" + "\n");
            System.out.println("1- Cadena");
            System.out.println("2- Notas");
            System.out.println("3- Clases");
            System.out.println("4- Salir\n");
            
            System.out.print("Ingrese su opción: ");
            opcion = scan.nextInt();
            System.out.println("");

            if (opcion == 1) {

                System.out.println("CADENA");

                System.out.print("Ingrese una cadena: ");
                String cadena = scan.next();

                String caracter = "";
                int contador1 = 0;
                int contador2 = 1;
                int contador3 = 0;
                int contador4 = 1;
                int repeticionesComparar = 0;
                int repeticionesFinal = 0;

                while (contador1 < cadena.length()) {

                    while (contador3 < cadena.length()) {
                        if (cadena.substring(contador1, (contador2)).equals(cadena.substring(contador3, (contador4)))) {
                            repeticionesComparar++;
                            contador3++;
                            contador4++;

                        }

                        contador3++;
                        contador4++;

                    }

                    if (repeticionesComparar > repeticionesFinal) {
                        repeticionesFinal = repeticionesComparar;
                        caracter = cadena.substring(contador1, contador2);

                    }

                    contador1++;
                    contador2++;
                    contador3 = 0;
                    contador4 = 1;

                    repeticionesComparar = 0;
                }

                System.out.println("");
                System.out.println("Caracter más repetido: " + caracter);
                System.out.println("Repeticiones: " + repeticionesFinal);
                System.out.println("");

                
                
            } else if (opcion == 2) {

                int cicloNotas=1;
                int cantidadNotas=0;
                double calificacion;
                double notaMayor = 0;
                double notaMenor = 0;
                double notas = 0;
                double promedio;

                int contador = 1;

                System.out.println("NOTAS");
                
                while (cicloNotas>0){
                    
                while (cantidadNotas==0){
                System.out.print("Ingrese la cantidad de notas: ");
                cantidadNotas = scan.nextInt();
                }

                while (contador <= cantidadNotas) {
                    System.out.print("Nota #" + contador + ": ");
                    calificacion = scan.nextDouble();

                    if (calificacion < 0 || calificacion > 100) {

                    } else {
                        if (notaMenor == 0 && calificacion > notaMayor && calificacion > notaMenor) {
                            notaMayor = calificacion;
                            notaMenor = calificacion;
                            notas = calificacion + notas;
                            contador++;

                        } else if (calificacion > notaMayor && calificacion > notaMenor) {
                            notaMayor = calificacion;
                            notas = calificacion + notas;
                            contador++;

                        } else if (calificacion < notaMenor && calificacion < notaMayor) {
                            notaMenor = calificacion;
                            notas = calificacion + notas;
                            contador++;

                        } else if (notaMenor == 0 && calificacion < notaMayor) {
                            notaMenor = calificacion;
                            notas = calificacion + notas;
                            contador++;

                        } else if (calificacion > notaMenor && calificacion < notaMayor) {
                            notas = calificacion + notas;
                            contador++;
                        }
                    }
                }

                System.out.println("");

                promedio = notas / cantidadNotas;

                System.out.println("Promedio: " + promedio + "%");
                System.out.println("Nota Mayor: " + notaMayor);
                System.out.println("Nota Menor: " + notaMenor);
                System.out.println("");
                
                cicloNotas=0;

                }
                
            } else if (opcion == 3) {

                String dia;
                int fecha;
                int mes;
                
                System.out.println("CLASES");
                System.out.println("");
                System.out.println("Ingrese la fecha:");
                
                System.out.print("Día: ");
                dia=scan.next();
                System.out.print("Fecha: ");
                fecha=scan.nextInt();
                System.out.print("Mes: ");
                mes=scan.nextInt();
               
                System.out.println("");
                
            }else if (opcion==4){
                 cicloMenu = 1;
            }
        }
    }
}
