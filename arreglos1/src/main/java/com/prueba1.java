package com;

public class prueba1{
    public static void main(String[] args) {
        int filas = 6;
        int columnas = 6;
        int[][] matriz = new int[filas][columnas];
        
        // 1. Crear un arreglo plano con el total de elementos
        int totalElementos = filas * columnas;
        int[] arregloBase = new int[totalElementos];
        
        for (int i = 0; i < totalElementos; i++) {
            arregloBase[i] = i + 1; // Llena con números del 1 al 9
        }
        
        // 2. Algoritmo Fisher-Yates usando Math.random()
        // Recorremos el arreglo de atrás hacia adelante intercambiando posiciones
        for (int i = totalElementos - 1; i > 0; i--) {
            // Genera un índice aleatorio entre 0 e i (inclusive)
            int indiceAleatorio = (int) (Math.random() * (i + 1));
            
            // Intercambiar arregloBase[i] con arregloBase[indiceAleatorio]
            int temporal = arregloBase[i];
            arregloBase[i] = arregloBase[indiceAleatorio];
            arregloBase[indiceAleatorio] = temporal;
        }
        
        // 3. Pasar el arreglo ya mezclado a la matriz bidimensional
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = arregloBase[contador];
                contador++;
            }
        }
        
        // Imprimir la matriz resultante
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}