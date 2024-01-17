package Operaciones;

public class Multiplicacion {

    public int[][] getMultiplicacion(int filas, int columnas, int repetido, int[][] MatrizA, int[][] MatrizB) {
        int[][] Multiplicacion = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < repetido; k++) {
                    Multiplicacion[i][j] += MatrizA[i][k] * MatrizB[k][j];
                }
            }
        }

        return Multiplicacion;
    }
}

