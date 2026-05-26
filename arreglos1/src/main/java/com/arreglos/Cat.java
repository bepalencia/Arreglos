package com.arreglos;

public class Cat {

     private final String name;

    public Cat(String name){
        this.name = name; 
    }
    
    public static void main(String[] args){

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Michi");
        cats[1] = new Cat("Behemoth");
        cats[2] = new Cat("Fluffy");

        int[][] matrix = new int[3][3]; 
        System.out.println(matrix[0].length);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix [i][j] = i + j;
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }



    }

    
}
