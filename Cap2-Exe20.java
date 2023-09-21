package fonte;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float x1, x2, y1, y2;
        double distancia, aux1, aux2;
        
        System.out.println("Calculadora de distancia entre pontos:");
        System.out.println("Informe as coordenadas do primeiro ponto: \nx:");
        x1 = scan.nextFloat();
        System.out.println("y:");
        y1 = scan.nextFloat();
        System.out.println("Informe as coordenadas do segundo ponto: \nx:");
        x2 = scan.nextFloat();
        System.out.println("y:");
        y2 = scan.nextFloat();
        
        aux1 = x2 - x1;
        aux2 = y2 - y1;
        
        aux1 = Math.pow(aux1, 2);
        aux2 = Math.pow(aux2, 2);
        
        distancia = Math.sqrt(aux1 + aux2);
        
        System.out.println("A distancia entre os pontos e: " + distancia);
    }
}
