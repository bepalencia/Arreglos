package com.arreglos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String [] nameProducto = {"Mouse", "Teclado", "Monitor", "Tarjeta Gráfica", "Cables", "Cargadores"};
        double [] priceProducto = {5.15,8.92,114.15,568.91,3.00,82.00};
        int [] cantidadProducto = new int [6];
        /*
        System.out.println("Ingrese las cantidades de los productos: ");
        

        for(int i = 0; i < priceProducto.length; i++){

            System.out.println("Para "+ nameProducto[i] + " con precio $" + priceProducto[i]);
            String input = System.console().readLine();

            if (input == "exit"){

                System.exit(0);
            }else{
                cantidadProducto[i] = Integer.parseInt(input);
            }
        }


        
        for(int i = 0; i < nameProducto.length; i++){
            System.out.println("Producto: " + nameProducto[i]+
                               " Precio: $" + priceProducto[i] + 
                               " Cantidad: " + cantidadProducto[i]);
        }
*/

         /*

        double [][] preciosCantidades = new double [6][6];
        
        for(int i = 0; i < nameProducto.length; i++){

            System.out.println("Ingrese el precio del producto " + nameProducto[i]);
            double precio = scanner.nextDouble();
            preciosCantidades[i][0] = precio;

            System.out.println("Ingrese la cantidad del producto " + nameProducto[i]);
            double cantidad = scanner.nextDouble();
            preciosCantidades[i][1] = cantidad;
        }
            */

        int [][] tablaBingo = new int [5][5];
        int numero;
        

        for(int i = 0; i < tablaBingo.length; i++){
            for(int j = 0; j < tablaBingo[i].length; j++){
                tablaBingo[i][j] = (int)(Math.random() * 100) + 1;
                System.out.print(tablaBingo[i][j] + " ");
            }
            System.out.println();
        }

        do{
            System.out.println("Ingrese el numero que desea encontrar en la tabla de Bingo: ");
            numero = scanner.nextInt();

            for(int i = 0; i < tablaBingo.length; i++){
                for(int j = 0; j < tablaBingo[i].length; j++){
                
                    if(tablaBingo[i][j] == numero){
                        System.out.println("El numero " + numero + " se encuentra en la posición [" + i + "][" + j + "]");
                    }
                }
            }
        }while(numero != -1);
       
        

        



        
    }
}