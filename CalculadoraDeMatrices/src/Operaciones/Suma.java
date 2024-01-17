package Operaciones;

public class Suma {
    int columnas, filas;

    public int[][] getSuma(int[][] Matriz1, int[][] Matriz2){

        this.columnas = Matriz1[0].length;
        this.filas = Matriz1.length;

        int [][] MatrizSuma = new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                MatrizSuma[i][j] = Matriz1[i][j] + Matriz2[i][j];
            }
        }
        
        return MatrizSuma;
    }
}
