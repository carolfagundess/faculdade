/*
 * Autor: Luciano J. Ferreira
 * Data: 02/09/2023
 * Ação: Exercício 015
 * Escreva um programa que leia os coeficientes a,b,c,d,e,f e calcule e mostre os
 * valores de x e y, que pode ser resolvido assim:
 * x = (ce - bf) / (ae - bd) y = (af - cd) / (ae - bd)
 */

package fonte;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in, "UTF-8");
        
        float   coefA = 0, coefB = 0, coefC = 0, coefD = 0, coefE = 0, coefF = 0, x = 0, y = 0;
        String  strCoefA, strCoefB, strCoefC, strCoefD, strCoefE, strCoefF;
        String  testeEntrada;
        boolean testaEntrada;
        
        System.out.println("Informe valores para os coeficientes a, b, c, d, e, f \n"     +
                           "a fim de serem calculados x e y nas respectivas fórmulas: \n" + 
                           "x = (ce - bf) / (ae - bd)      y = (af - cd) / (ae - bd)\n");
        
        /*** ENTRADA DO COEFICIENTE A ************************************/
        do{
            
            System.out.print("Informe o coeficiente 'a': ");
            testeEntrada = entrada.nextLine().trim().replace(',', '.');
            
            try{
                
                coefA        = Float.parseFloat(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número!!!");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        /*** ENTRADA DO COEFICIENTE B ************************************/
        do{
            
            System.out.print("Informe o coeficiente 'b': ");
            testeEntrada = entrada.nextLine().trim().replace(',', '.');
            
            try{
                
                coefB        = Float.parseFloat(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número!!!");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        /*** ENTRADA DO COEFICIENTE C ************************************/
        do{
            
            System.out.print("Informe o coeficiente 'c': ");
            testeEntrada = entrada.nextLine().trim().replace(',', '.');
            
            try{
                
                coefC        = Float.parseFloat(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número!!!");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        /*** ENTRADA DO COEFICIENTE D ************************************/
        do{
            
            System.out.print("Informe o coeficiente 'd': ");
            testeEntrada = entrada.nextLine().trim().replace(',', '.');
            
            try{
                
                coefD        = Float.parseFloat(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número!!!");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        /*** ENTRADA DO COEFICIENTE E ************************************/
        do{
            
            System.out.print("Informe o coeficiente 'e': ");
            testeEntrada = entrada.nextLine().trim().replace(',', '.');
            
            try{
                
                coefE        = Float.parseFloat(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número!!!");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        /*** ENTRADA DO COEFICIENTE F ************************************/
        do{
            
            System.out.print("Informe o coeficiente 'f': ");
            testeEntrada = entrada.nextLine().trim().replace(',', '.');
            
            try{
                
                coefF        = Float.parseFloat(testeEntrada);
                testaEntrada = true;
                
            }catch(Exception e){
                
                testaEntrada = false;
                System.out.println("Entrada inválida, informe um número!!!");
                
            }
            
        }while(!testaEntrada);
        /***********************************************************************/
        
        /**** CONVERTE OS COEFICIENTES EM STRINGS ANALISANDO A EXISTÊNCIA OU NÃO DE CASAS DECIMAIS ****/
        strCoefA = ((coefA != (int) coefA) ? String.valueOf(coefA).replace(".",",") : String.valueOf((int) coefA));
        strCoefB = ((coefB != (int) coefB) ? String.valueOf(coefB).replace(".",",") : String.valueOf((int) coefB));
        strCoefC = ((coefC != (int) coefC) ? String.valueOf(coefC).replace(".",",") : String.valueOf((int) coefC));
        strCoefD = ((coefD != (int) coefD) ? String.valueOf(coefD).replace(".",",") : String.valueOf((int) coefD));
        strCoefE = ((coefE != (int) coefE) ? String.valueOf(coefE).replace(".",",") : String.valueOf((int) coefE));
        strCoefF = ((coefF != (int) coefF) ? String.valueOf(coefF).replace(".",",") : String.valueOf((int) coefF));
        
        /**** EXIBE A FÓRMULA DE X PREENCHIDA ****/
        System.out.println("");
        System.out.println("x = (ce - bf) / (ae - bd)");
        System.out.println("x = (" + strCoefC + " x " + strCoefE + " - " + strCoefB + " x " + strCoefF + ")" +
                            " / (" + strCoefA + " x " + strCoefE + " - " + strCoefB + " x " + strCoefD + ")");
        
        /**** CÁLCULA E EXIBE X ****/
        x = (coefC * coefE - coefB * coefF) / (coefA * coefE - coefB * coefD);
        System.out.println("x = "+ ((x != (int) x) ? String.valueOf(x).replace(".",",") : String.valueOf((int) x)));
        
        /**** EXIBE A FÓRMULA DE Y PREENCHIDA ****/
        System.out.println("");
        System.out.println("y = (af - cd) / (ae - bd)");
        System.out.println("Y = (" + strCoefA + " x " + strCoefF + " - " + strCoefC + " x " + strCoefD + ")" +
                            " / (" + strCoefA + " x " + strCoefE + " - " + strCoefB + " x " + strCoefD + ")");
        
        /**** CÁLCULA E EXIBE Y ****/
        y = (coefA * coefF - coefC * coefD) / (coefA * coefE - coefB * coefD);
        System.out.println("y = "+ ((y != (int) y) ? String.valueOf(y).replace(".",",") : String.valueOf((int) y)));
        
        System.out.println("");
    }
    
}
