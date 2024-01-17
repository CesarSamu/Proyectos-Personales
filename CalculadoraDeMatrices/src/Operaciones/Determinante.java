package Operaciones;

public class Determinante {

    public int getDeterminante2x2 (int [][] Matriz){

        int determinante = Matriz[0][0] * Matriz[1][1] - Matriz[1][0] * Matriz[0][1];

        return determinante;
    }

    public int getDeterminante3x3 (int [][] Matriz){

    int determinante = Matriz[0][0] * Matriz[1][1] * Matriz[2][2] +
                   Matriz[1][0] * Matriz[2][1] * Matriz[0][2] +
                   Matriz[0][1] * Matriz[1][2] * Matriz[2][0] -
                   Matriz[0][2] * Matriz[1][1] * Matriz[2][0] -
                   Matriz[0][1] * Matriz[1][0] * Matriz[2][2] -
                   Matriz[1][2] * Matriz[2][1] * Matriz[0][0];

    return determinante;
    }

    public int getDeterminante4x4 (int [][] matriz){

        int determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] * matriz[3][3]
                + matriz[2][1] * matriz[3][2] * matriz[1][3]
                + matriz[3][1] * matriz[1][2] * matriz[2][3]
                - matriz[1][3] * matriz[2][2] * matriz[3][1]
                - matriz[2][3] * matriz[3][2] * matriz[1][1]
                - matriz[3][3] * matriz[1][2] * matriz[2][1]);

        return determinante;
    } 
}
