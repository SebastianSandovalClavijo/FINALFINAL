/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.lab2;

import java.util.Scanner;
import java.util.Random;

/*Escriba un programa que calcule la media, varianza y desviación estándar
de un arreglo de números enteros aleatorios. El usuario debe ingresar el
tamaño del arreglo.
/**
 *
 * @author SANDOVAL
 */
public class PracticaLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Procedimientos model = new Procedimientos();
        Scanner teclado = new Scanner(System.in);
        String opc;
        while (true) {
            System.out.println("=== MENU ===");
            System.out.println();
            System.out.println("1.Programa");
            System.out.println("2.Programa");
            System.out.println("3.Programa");
            System.out.println("4.Programa");

            System.out.print("Digite la opcion ");
            opc = teclado.nextLine();

            switch (opc) {
                case "1":
                  
                    Random aleatorios = new Random();
                    System.out.println();

                
                    int[] arreglo = new int[5];
                    for (int i = 0; i < arreglo.length; i++) {
                        arreglo[i] = aleatorios.nextInt(50) + 1;
System.out.println(arreglo[i]);
                        
                    }
                   

                    System.out.println();
                    System.out.println("Resultado Media " + model.Media(arreglo));
                    System.out.println();
                    System.out.println("Resultado Variacion " + model.Varianza(arreglo));
                    System.out.println();
                    System.out.println("Resultado Desviacion Estandar " + model.DesviacionEstandar());
                    break;
                case "2":
                    model.Programa2();
                    break;
                case "3":
                    //Crear aleatorios
                    Procedimientos o = new Procedimientos();
                    int tamaño2;
                    System.out.println();
                    System.out.print("Cual es el tamaño del arreglo ");
                    tamaño2 = teclado.nextInt();
                    double[] arreglo2 = new double[tamaño2];
                    for (int i = 0; i < arreglo2.length; i++) {
                        arreglo2[i] = (double) Math.random() * 25;
                        System.out.println("Arreglo " + (i + 1) + "-------> " + Math.round((arreglo2[i]) * 100.0) / 100.0);
                    }

                    o.organizadorInsercion(arreglo2);
                    System.out.print("===organizadorInsercion=== ");
                    System.out.println();
                    long inicio = System.nanoTime();
                    for (int i = 0; i < arreglo2.length; i++) {

                        System.out.println(Math.round((arreglo2[i]) * 100.0) / 100.0);
                    }
                    long fin = System.nanoTime();
                    double dif = (double) (fin - inicio) * (1.0e-9);
                    System.out.print("El programa dura " + Math.round((dif) * 10000.0000) / 10000.0000 + "seg");
                    System.out.println();

                    System.out.print("===organizadorseleccion=== ");
                    o.organizadorSeleccion(arreglo2);
                    System.out.println();
                    long inicio2 = System.nanoTime();
                    for (int i = 0; i < arreglo2.length; i++) {

                        System.out.println(Math.round((arreglo2[i]) * 100.0) / 100.0);
                    }
                    long fin2 = System.nanoTime();
                    double dif2 = (double) (fin2 - inicio2) * (1.0e-9);
                    System.out.print("El programa dura " + Math.round((dif2) * 10000.0000) / 10000.0000 + "seg");
                    System.out.println();

                    System.out.print("===organizadorBurbuja=== ");
                    o.organizadorBurbuja(arreglo2);
                    System.out.println();
                    long inicio3 = System.nanoTime();
                    for (int i = 0; i < arreglo2.length; i++) {

                        System.out.println(Math.round((arreglo2[i]) * 100.0) / 100.0);
                    }
                    long fin3 = System.nanoTime();
                    double dif3 = (double) (fin3 - inicio3) * (1.0e-9);
                    System.out.print("El programa dura " + Math.round((dif3) * 10000.0000) / 10000.0000 + "seg");
                    System.out.println();
                    System.out.print("===organizadorMergeSort=== ");

                    MergeSort mergeSort = new MergeSort();

                    int n = arreglo2.length;

                    System.out.println();
                    long inicio4 = System.nanoTime();
                    mergeSort.sort(arreglo2, 0, n - 1);
                    mergeSort.printArray(arreglo2);
                    long fin4 = System.nanoTime();
                    double dif4 = (double) (fin4 - inicio4) * (1.0e-9);
                    System.out.print("El programa dura " + Math.round((dif4) * 10000.0000) / 10000.0000 + "seg");
                    break;
                case "4":
                    Scanner sc = new Scanner(System.in);
                    int num;
                    System.out.print("El tamaño del arreglo ");
                    num = sc.nextInt();

                    Persona arreglo1[] = new Persona[num];
                    String nombre;
                    int edad;
                    double cedula;

                    for (int i = 0; i < arreglo1.length; i++) {
                        sc.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        nombre = sc.nextLine();
                        System.out.print("Ingrese la edad: ");
                        edad = sc.nextInt();
                        System.out.print("Ingrese la cedula: ");
                        cedula = sc.nextDouble();
                        arreglo1[i] = new Persona(cedula, nombre, edad);

                    }

                    for (int j = 0; j < arreglo1.length; j++) {
                        System.out.println("-----------------------");
                        System.out.println("Cedula   nombre   edad  ");
                        System.out.println(arreglo1[j].getcedula() + "   " + arreglo1[j].getnombre() + "   " + arreglo1[j].getedad());

                    }
                    break;
            }

        }

    }
}
