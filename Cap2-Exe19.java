//Sara
package Principal;

import java.util.Scanner;


public class atividade19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numero, cubo, quadrado, raizQuadrada, raizCubica;
        
        System.out.println("Informe um numero: ");
        numero = teclado.nextDouble();

        quadrado = Math.pow(numero, 2.0);
        cubo = Math.pow(numero, 3.0);
        raizQuadrada = Math.sqrt(numero);
        raizCubica = Math.cbrt(numero);
        
        System.out.println("O quadrado deste numero eh: " + quadrado);
        System.out.println("O cubo deste numero eh: " + cubo);
        System.out.println("A raiz quadrada deste numero eh: " + raizQuadrada);
        System.out.println("A raiz cubica deste numero eh: " + raizCubica);
    }
    
}
    



