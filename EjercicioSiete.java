package ejercicio.siete;

import java.util.Random;
import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rd = new Random();
        int x, y;
        
        System.out.print("De que tamaño será el lado x de tu arreglo? ");
        x = sc.nextInt();
        System.out.print("De que tamaño será el lado y de tu arreglo? ");
        y = sc.nextInt();
        
        int[][] ArrayXY = new int [x][y];
        
        for (int i=0; i<ArrayXY.length; i++) {
            for (int j = 0; j<ArrayXY.length; j++) {
                ArrayXY[i][j] = rd.nextInt(9 - 0 + 1) + 0;
                System.out.print(ArrayXY[i][j] + "  ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Reconfigurando...");
        System.out.println("La matriz de "+x+"x"+y+" reorganizada quedará de la siguiente forma:");
        System.out.println();
        for (int i=0; i<ArrayXY.length; i++) {
            for (int j = 0; j<ArrayXY.length; j++) {
                System.out.print(ArrayXY[j][i] + "  ");
            }
            System.out.println();
        }
    }
    
}
