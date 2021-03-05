/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lab2;

import java.util.Random;

/**
 *
 * @author SANDOVAL
 */
public class MetodosSueltos {

    int media;
    double varianza;
    int[] arreglo5;

    public static void main(String[] args) {

    }

    public int Media(int[] arreglo) {
        this.arreglo5 = arreglo;
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {

            suma = arreglo[i] + suma;

        }
        media = Math.round(suma / arreglo.length);
        return media;

    }

    public int Varianza(int[] arreglo) {
 this.arreglo5 = arreglo;
        double sumatoria = 0;

        for (int i = 0; i < arreglo.length; i++) {

            sumatoria = sumatoria + Math.pow((arreglo[i] - this.media), 2);

        }

        varianza = Math.round(sumatoria / arreglo.length);

        return (int) varianza;

    }

    public int DesviacionEstandar() {

        double desviacion = Math.sqrt(varianza);

        return (int) desviacion;

    }

    public void organizadorSeleccion(double[] array) {
        double aux;
        int min;

        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[min]) {
                    min = j;

                }
            }
            aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }
        System.out.print("===Organizadorseleccion=== ");
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            System.out.println(Math.round((array[i]) * 100.0) / 100.0);
        }
        System.out.println();
    }

    public void organizadorBurbuja(double[] arreglo2) {
        for (int contador1 = 0; contador1 < arreglo2.length; contador1++) {
            for (int contador2 = 0; contador2 < arreglo2.length; contador2++) {
                if ((contador2 + 1) < arreglo2.length) {
                    if (arreglo2[contador2] > arreglo2[contador2 + 1]) {
                        double temporal = arreglo2[contador2];
                        arreglo2[contador2] = arreglo2[contador2 + 1];
                        arreglo2[contador2 + 1] = temporal;
                    }
                }
            }
            //ImprimirArregloAOrdenar(arregloEntrada);
        }
        System.out.print("===OrganizadorBurbuja=== ");
        System.out.println();
        for (int i = 0; i < arreglo2.length; i++) {

            System.out.println(Math.round((arreglo2[i]) * 100.0) / 100.0);
        }
        System.out.println();
    }

    public void organizadorInsercion(double[] array) {

        double aux;
        int coun1;
        int coun2;
        for (coun1 = 1; coun1 < array.length; coun1++) {

            aux = array[coun1]; //16
            for (coun2 = coun1 - 1; coun2 >= 0 && array[coun2] > aux; coun2--) {//15
                array[coun2 + 1] = array[coun2];
                array[coun2] = aux;

            }
        }
        System.out.print("===OrganizadorInsercion=== ");
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            System.out.println(Math.round((array[i]) * 100.0) / 100.0);
        }
        System.out.println();
    }

}
