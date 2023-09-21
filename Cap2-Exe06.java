/*
AUTOR: Patricia Schonarth
DATA: 24 / 08 / 2023
AÇÃO: Atividade 6 - Saldo Reajustado
[...]....
 */
package principal;

import java.util.Scanner;//biblioteca para chamar teclado

public class Principal {

    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in); //para chamar teclado 
        
        final float reajuste;
        float saldoAtual, novoSaldo;
        
        //Logica
        System.out.println("Informe seu saldo :");//para chamar teclado
        saldoAtual = teclado.nextFloat();
        
        reajuste = 0.05f;
        novoSaldo = ((saldoAtual * reajuste)+ saldoAtual);//conta
                  
        //Saida
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Seu novo saldo bancario com o reajuste de 5% e de R$: " +novoSaldo+ " reais !");
        System.out.println("---------------------------------------------------------------------------");
    }
    
}
