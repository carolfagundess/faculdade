/*
 * Autor: Luciano J. Ferreira
 * Data: 02/09/2023
 * Ação: Exercício 014
 * Crie um programa que leia um número fracionário e mostre:
 * A parte inteira do número;
 * A parte fracionária (mantissa);
 * O número arredondado.
 */

package fonte;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in, "UTF-8");
        
        int     numerador = 0, denominador = 0, parteInteira, tamanhoNumeradorMaiorQueDenominador;
        float   equivalenteReal, mantissa;
        String  separadorFracao;
        boolean testaEntrada;
        
        System.out.println("*** Informe um numero em forma de fração (numerador/denominador) ***");
        
        /*** ENTRADA DO NUMERADOR ************************************/
        do{
            
            try{
                
                System.out.print("Informe o numerador: ");
                numerador    = entrada.nextInt();
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número inteiro!!!");
                
            }
            
            entrada.nextLine();
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        /*** ENTRADA DO DENOMINADOR ************************************/
        do{
            
            try{
                
                System.out.print("Informe o denominador: ");
                denominador = entrada.nextInt();
                
                if(denominador != 0)
                    testaEntrada = true;
                else{
                    
                    System.out.println("O denominador deve ser diferente de 0.");
                    testaEntrada = false;
                    
                }
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número inteiro!!!");
                
            }
            
            entrada.nextLine();
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        equivalenteReal = (float) numerador / denominador;
        parteInteira    = (int) equivalenteReal;
        mantissa        = equivalenteReal - parteInteira;
        
        /**** CRIA O SEPARADOR DE FRAÇÃO (-----) ****/
        tamanhoNumeradorMaiorQueDenominador = String.valueOf(numerador).length() - String.valueOf(denominador).length();
        if(tamanhoNumeradorMaiorQueDenominador >= 0)
            separadorFracao = "-".repeat(String.valueOf(numerador).length() + 2);
        else
            separadorFracao = "-".repeat(String.valueOf(denominador).length() + 2);
        /*********************************************************************************************************************/
        
        
        System.out.println("");
        
        System.out.println(" ".repeat((int) Math.ceil((float)(separadorFracao.length() - String.valueOf(numerador).length()) / 2) + 9) + numerador);
        
        System.out.println("A fração " + separadorFracao + " é equivalente ao número real "                    + 
                            String.valueOf(equivalenteReal).replace(".",",") + ", sua parte inteira é "        + 
                            ((parteInteira == 0 && equivalenteReal < 0) ? ("-" + parteInteira) : parteInteira) + 
                           " e a mantissa é "  + String.valueOf(mantissa).replace("0.",",").replace("-", ""));
        
        System.out.println(" ".repeat((int) Math.ceil((float)(separadorFracao.length() - String.valueOf(denominador).length()) / 2) + 9) + denominador);
        
        System.out.println("");
        System.out.printf("O arredondamento em 2 casas decimais resulta em --> %.2f\n", equivalenteReal);
        System.out.printf("O arredondamento em 1 casa  decimal  resulta em --> %.1f\n", equivalenteReal);
        System.out.printf("O arredondamento em 0 casas decimais resulta em --> %.0f\n", equivalenteReal);
        System.out.println("");
        
    }
    
}
