package Operaciones;

public class Escalar {
    int columnas, filas;

    public int[][] getEscalar(int[][] Matriz1, int escalar){

        this.columnas = Matriz1[0].length;
        this.filas = Matriz1.length;
        int [][] MatrizEscalar = new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                MatrizEscalar[i][j] = Matriz1[i][j] * escalar;
            }
        }
        
        return MatrizEscalar;
    }
}
