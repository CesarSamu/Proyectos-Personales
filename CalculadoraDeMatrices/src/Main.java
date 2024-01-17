import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner a = new Scanner(System.in);
        Boolean Menu = true;
        int columnas, filas;
        Operaciones.Suma Suma = new Operaciones.Suma();
        Operaciones.Resta Resta = new Operaciones.Resta();
        Operaciones.Escalar Escalar = new Operaciones.Escalar();
        Operaciones.Determinante Determinante = new Operaciones.Determinante();
        Operaciones.Transposicion Transposicion = new Operaciones.Transposicion();
        Operaciones.Multiplicacion Multiplicacion = new Operaciones.Multiplicacion();
        Operaciones.ObtenerDatos ObMatriz = new Operaciones.ObtenerDatos();

        do{
            System.out.println("\nElija una opción: adwdadw"+
            "\n1. Suma"+"\n2. Resta"+
            "\n3. Multiplicación por escalar"+"\n4. Multiplicación de matrices"+
            "\n5. Transposición de matrices"+"\n6. Determinante de una matriz"+
            "\n7. Salir");
            int opcion = a.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese las filas ");
                    filas = a.nextInt();
                    System.out.print("Ingrese las columnas ");
                    columnas = a.nextInt();

                    if(filas > 1 && columnas > 1 ){
                        int[][] Matriz1 = ObMatriz.ObtenerMatriz1(filas, columnas);
                        int[][] Matriz2 = ObMatriz.ObtenerMatriz2(filas, columnas);
                        int[][] MatrizSumada = Suma.getSuma(Matriz1, Matriz2);

                        System.out.println("\nSu matriz sumada es: ");
                        for(int i = 0;i<filas;i++){
                            for(int j = 0;j<columnas;j++){
                                System.out.print(MatrizSumada[i][j]+" ");
                            }
                            System.out.println("");
                        }
                    }
                    else{
                        System.out.println("\nMatriz inválida. Ingrese otra por favor");
                    }
                    break;
                
                case 2:
                    System.out.print("Ingrese las filas ");
                    filas = a.nextInt();
                    System.out.print("Ingrese las columnas ");
                    columnas = a.nextInt();

                    if(filas > 1 && columnas > 1 ){
                        int[][] Matriz1 = ObMatriz.ObtenerMatriz1(filas, columnas);
                        int[][] Matriz2 = ObMatriz.ObtenerMatriz2(filas, columnas);
                        int[][] MatrizRestada = Resta.getResta(Matriz1, Matriz2);

                        System.out.println("\nSu matriz sumada es: ");
                        for(int i = 0;i<filas;i++){
                            for(int j = 0;j<columnas;j++){
                                System.out.print(MatrizRestada[i][j]+" ");
                            }
                            System.out.println("");
                        }
                    }
                    else{
                        System.out.println("\nMatriz inválida. Ingrese otra por favor");
                    }
                    break;

                case 3: //Escalar
                    System.out.print("Ingrese las filas: ");
                    filas = a.nextInt();
                    System.out.print("Ingrese las columnas: ");
                    columnas = a.nextInt();
                    System.out.print("Ingrese el escalar: ");
                    int escalar = a.nextInt();

                    if(filas > 1 && columnas > 1 ){
                        int[][] Matriz1 = ObMatriz.ObtenerMatriz(filas, columnas);
                        int[][] MatrizRestada = Escalar.getEscalar(Matriz1, escalar);

                        System.out.println("\nSu matriz escalada es: ");
                        for(int i = 0;i<filas;i++){
                            for(int j = 0;j<columnas;j++){
                                System.out.print(MatrizRestada[i][j]+" ");
                            }
                            System.out.println("");
                        }
                    }
                    else{
                        System.out.println("\nMatriz inválida. Ingrese otra por favor");
                    }
                    break;

                case 4: //Multiplicacion
                    System.out.print("Ingrese las filas de la matriz 1: ");
                    filas = a.nextInt();
                    System.out.print("Ingrese las columnas de la matriz 1: ");
                    columnas = a.nextInt();
                    System.out.print("Ingrese las filas de la matriz 2: ");
                    int filas2 = a.nextInt();
                    System.out.print("Ingrese las columnas de la matriz 2: ");
                    int columnas2 = a.nextInt();
                    
                    if (columnas > 1 && filas > 1 && filas2 > 1 && columnas2 > 1 && columnas == filas2) {
                        int[][] Matriz1 = ObMatriz.ObtenerMatriz1(filas, columnas);
                        int[][] Matriz2 = ObMatriz.ObtenerMatriz2(filas2, columnas2);
                        int[][] MatrizMultiplicada = Multiplicacion.getMultiplicacion(filas, columnas2, columnas, Matriz1, Matriz2);

                        System.out.println("\nSu matriz multiplicada es: ");
                        for(int i = 0;i<filas;i++){
                            for(int j = 0;j<columnas2;j++){
                                System.out.print(MatrizMultiplicada[i][j]+" ");
                            }
                            System.out.println("");
                        }
                    }
                    else{
                        System.out.println("\nMatriz inválida. Ingrese otra por favor");
                    }
                    break;

                case 5: //Transposicion
                    System.out.print("Ingrese las filas de la matriz : ");
                    filas = a.nextInt();
                    System.out.print("Ingrese las columnas de la matriz : ");
                    columnas = a.nextInt();

                    if(filas > 1 && columnas > 1){
                        int[][] Matriz1 = ObMatriz.ObtenerMatriz(filas, columnas);
                        int[][] MatrixTranspuesta = Transposicion.getTransposicion(Matriz1);

                        System.out.println("\nSu matriz transpuesta es: ");
                        for(int i = 0;i<filas;i++){
                            for(int j = 0;j<columnas;j++){
                                System.out.print(MatrixTranspuesta[i][j]+" ");
                            }
                            System.out.println("");
                        }
                    }
                    else{

                    }
                    break;

                case 6: //Determinante
                    System.out.print("Ingrese las filas de la matriz : ");
                    filas = a.nextInt();
                    System.out.print("Ingrese las columnas de la matriz : ");
                    columnas = a.nextInt();

                    if(filas == columnas && filas > 1){
                        switch (filas) {
                            case 2:
                                int[][] Matriz2x2 = ObMatriz.ObtenerMatriz(filas, columnas);

                                System.out.println("Determinante de tu matriz es: "+Determinante.getDeterminante2x2(Matriz2x2));

                                break;
                            case 3:
                                int[][] Matriz3x3 = ObMatriz.ObtenerMatriz(filas, columnas);

                                System.out.println("Determinante de tu matriz es: "+Determinante.getDeterminante3x3(Matriz3x3));

                                break;
                            
                            default:
                                System.out.println("\nNo contamos con la capacidad de sacar determinantes de matrices con esas dimensiones");
                        }
                    }
                    else{
                        System.out.println("\nMatriz inválida");
                    }
                    
                    break;
                
                case 7:
                        System.out.println("Graciar por usar"+"\nCon el tiempo se irán agregando nuevas cosas");
                        Menu = false;
                    break;

                default:
                    break;
            }
        }
        while(Menu);

        a.close();
    }
}