package com.arreglos;

import java.util.Scanner;

public class TablaBingo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       String [][] bingo;
        bingo = new String [5][5];

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
