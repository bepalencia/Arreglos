package com.arreglos;

import java.util.Scanner;

public class TablaBingo {

    public static void main(String[] args) {
        // Arreglos multidimensionales 
        // 1. Ingresar el valor y que automaticamente se asigne x si es el correcto.
        // 2. Cambiar la matriz por una de 6 filas.
        // 3. Asignar los números del bingo del 1 al 50 sin que se repitan.

        Scanner sc = new Scanner(System.in);
        String [][] bingo;
        bingo = new String [6][];
        int min = 3;
        int max = 5;
        String numero;

        //Algoritmo para que no se repitan los números del bingo 
        int totalElementos = 50;
        int arregloBase[] = new int[totalElementos];

        for (int i = 0; i < totalElementos; i++) {
            arregloBase[i] = i + 1; 
        }

        for (int i = totalElementos - 1; i > 0; i--) {
            
            int indiceAleatorio = (int) (Math.random() * (i + 1));
            
            
            int temporal = arregloBase[i];
            arregloBase[i] = arregloBase[indiceAleatorio];
            arregloBase[indiceAleatorio] = temporal;
        }

        /*
        En los arreglos multidimensionales, solo se define el tamaño de la primera dimensión, 
        las demás pueden ser dinámicas.
        
        bingo[0] = new String[4];
        bingo[1] = new String[3];
        bingo[2] = new String[4];
        bingo[3] = new String[5];
        bingo[4] = new String[3];*/

        for(int i = 0; i < bingo.length; i++){
            bingo[i] = new String [(int)(Math.random()*(max - min + 1)) + min];
        }
        int contador = 0;
        for(int i = 0; i < bingo.length; i++){
            for(int j = 0 ; j < bingo[i].length; j++){
                bingo[i][j] = String.valueOf(arregloBase[contador]);
                contador++;
            }

        }

        do{

        for(int i = 0; i < bingo.length; i++){
            for(int j = 0 ; j < bingo[i].length; j++){
                System.out.print(bingo[i][j] + " \t");
                
            }
            System.out.println();
        }

        System.out.println("Ingrese el numero que desea encontrar en la tabla de Bingo: ");
        numero = sc.nextLine();

          for(int i = 0; i < bingo.length; i++){
                for(int j = 0; j < bingo[i].length; j++){
                
                    if(bingo[i][j].equals(numero)){
                        System.out.println("El numero " + numero + " se encuentra en la posición [" + i + "][" + j + "]");
                        bingo[i][j] = "x";
                    }else{
                        System.out.println("El numero " + numero + " no se encuentra en la posición [" + i + "][" + j + "]");
                    }
                }
            }

        System.out.println("-----------------------------------------------");
            
        }while(true);
       

        

        /* 
        while(true){

            System.out.println("Ingrese la fila (i):");
            int fila = sc.nextInt();

            System.out.println("Ingrese la columna (j):");
            int columna = sc.nextInt();

            bingo[fila][columna]= "x";

            for(int i = 0; i < bingo.length; i++){
                for(int j = 0 ; j < bingo[i].length; j++){
                    System.out.print(bingo[i][j] + " \t");
            }
            System.out.println();
        }*/
 
        



        

    }
    
}
