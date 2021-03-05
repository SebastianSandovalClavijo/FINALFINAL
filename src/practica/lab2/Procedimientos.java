/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lab2;

import java.util.Scanner;

/**
 *
 * @author SANDOVAL
 */
public class Procedimientos {

    int media;
    double varianza;

    public int Media(int[] arreglo) {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {

            suma = arreglo[i] + suma;

        }
        media = Math.round(suma / arreglo.length);
        return media;

    }

    public int Varianza(int[] arreglo) {
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

    public void Programa2() {
        Scanner lector = new Scanner(System.in);
        String frase = " ";
        char[] caracteres;
        int repetido = 0;
        char caractermasrepetido = ' ';
        int contador = 0;
        System.out.println("escriba su texto");
        frase = lector.nextLine();
        frase = frase.toLowerCase();
        caracteres = frase.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char actual = caracteres[i];
            contador = 0;
            for (int j = 0; j < caracteres.length; j++) {
                if (caracteres[j] == actual) {
                    contador++;
                }
            }
            if (repetido < contador) {
                repetido = contador;
                caractermasrepetido = actual;
            }
        }
        for (int i = 0; i < caracteres.length; i++) {
            frase = frase.replace('a', caractermasrepetido).replace('e', caractermasrepetido).replace('i', caractermasrepetido).replace('o', caractermasrepetido).replace('u', caractermasrepetido);

        }
        System.out.println(frase);

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
    }

}
