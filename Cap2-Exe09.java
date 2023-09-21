/*
 * Autor: Luciano J. Ferreira
 * Data: 14/09/2023
 * Ação: Exercício 009
 * Crie um programa que leia o raio de um círculo e calcule a área.
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
              
        System.out.println("*** CÁLCULO DA ÁREA DE UM CÍRCULO ***");
        
        /*** ENTRADA DO RAIO DE UM CÍRCULO ************************************/
        do{
            
            System.out.print("Informe o raio do círculo: ");
            testeEntrada = entrada.nextLine().replace(",", ".");
            
            try{
                
                raioCirculo  = Double.parseDouble(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número!!!\n");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        areaCirculo = PI * (raioCirculo * raioCirculo);
        
        System.out.println("");
        
        System.out.printf("A área do circulo é: %f", areaCirculo);
        
        System.out.println("\n");
        
    }
    
}
