package com.arreglos;

import java.util.Scanner;

public class TablaBingo {

    public static void main(String[] args) {
        // Arreglos multidimensionales 
        Scanner sc = new Scanner(System.in);
        String [][] bingo;
        bingo = new String [5][];
        int min = 3;
        int max = 5;
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

        for(int i = 0; i < bingo.length; i++){
            for(int j = 0 ; j < bingo[i].length; j++){
                bingo[i][j] = String.valueOf((int)(Math.random()*100)+1);
            }

        }
        
         for(int i = 0; i < bingo.length; i++){
            for(int j = 0 ; j < bingo[i].length; j++){
                System.out.print(bingo[i][j] + " \t");
            }
            System.out.println();
        }

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
        }

        



        }

    }
    
}
