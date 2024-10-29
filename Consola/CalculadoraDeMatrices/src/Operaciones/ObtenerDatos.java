package Operaciones;

import java.util.Scanner;

public class ObtenerDatos {
    private Scanner entrada;
    int filas, columnas;

    public int[][] ObtenerMatriz1(int filas, int columnas){
        entrada = new Scanner(System.in);
        
        int[][] Matriz1 = new int[filas][columnas];

        System.out.println("\n  ");

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Matriz 1 ["+i+"]["+j+"]: ");
                Matriz1[i][j] = entrada.nextInt();	
            }
        }

        return Matriz1;
    }

    public int[][] ObtenerMatriz2(int filas, int columnas){
        entrada = new Scanner(System.in);
        
        int[][] Matriz2 = new int[filas][columnas];

        System.out.println("\n  ");

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Matriz 2 ["+i+"]["+j+"]: ");
                Matriz2[i][j] = entrada.nextInt();	
            }
        }

        return Matriz2;
    }

    public int[][] ObtenerMatriz(int filas, int columnas){
        entrada = new Scanner(System.in);
        
        int[][] Matriz2 = new int[filas][columnas];

        System.out.println("\n  ");

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                Matriz2[i][j] = entrada.nextInt();	
            }
        }

        return Matriz2;
    }

}
