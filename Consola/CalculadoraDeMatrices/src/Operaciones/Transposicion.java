package Operaciones;

public class Transposicion {
    int filas, columnas;

    public int[][] getTransposicion(int[][] Matriz1){

        this.columnas = Matriz1[0].length;
        this.filas = Matriz1.length;

        int [][] MatrizTranspuesta = new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                MatrizTranspuesta[i][j] = Matriz1[j][i];
            }
        }
        
        return MatrizTranspuesta;
    }
}
