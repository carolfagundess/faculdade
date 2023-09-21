/*
 * Autor: Luciano J. Ferreira
 * Data: 14/09/2023
 * A��o: Exerc�cio 009
 * Crie um programa que leia o raio de um c�rculo e calcule a �rea.
 */

package fonte;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in, "UTF-8");
        
        final double  PI = Math.PI;
              double  raioCirculo = 0, areaCirculo;
              String  testeEntrada;
              boolean testaEntrada;
              
        System.out.println("*** C�LCULO DA �REA DE UM C�RCULO ***");
        
        /*** ENTRADA DO RAIO DE UM C�RCULO ************************************/
        do{
            
            System.out.print("Informe o raio do c�rculo: ");
            testeEntrada = entrada.nextLine().replace(",", ".");
            
            try{
                
                raioCirculo  = Double.parseDouble(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inv�lida, informe um n�mero!!!\n");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        areaCirculo = PI * (raioCirculo * raioCirculo);
        
        System.out.println("");
        
        System.out.printf("A �rea do circulo �: %f", areaCirculo);
        
        System.out.println("\n");
        
    }
    
}
