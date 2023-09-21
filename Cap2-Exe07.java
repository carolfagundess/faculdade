/*[ Custo do quilowatt ] Levando em conta que 100 quilowatts de energia custa um sétimo do salário
mínimo, faça um programa que leia um valor de salário mínimo e a quantidade de quilowatts gasto por uma
residência e mostre:
• O valor em reais de cada quilowatt.
• O valor em reais a ser pago.
• O novo valor a ser pago, com um desconto de 10%.

 * Autor: Leandro Luis Coutinho da Silva
 * Data: 31/08/2023
 * Ação: Exercício 7
 */
package fonte;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner (System.in);
        
        //VARIÁVEIS:
        float salarioMinimo;
        float precoDoQuilowatt;
        float consumoEmQuilowatts;
        float valorASerPago;
        double valorComDesconto;
        float valorDeCemKW;
        
        //LÓGICA DO PROGRAMA:
        
        //Entrada de Dados:
        System.out.println("Informe o valor do salário mínimo vigente: ");
        salarioMinimo = teclado.nextFloat();
        System.out.println("Informe a quantidade de quilowatts gasta em sua residência: ");
        consumoEmQuilowatts = teclado.nextFloat();
        
        //Cálculos:
        //Para descobrir quanto custam 100KW:
        valorDeCemKW = salarioMinimo / 7;
        //Para descobrir o valor de cada kW:
        precoDoQuilowatt = valorDeCemKW / 100; 
        //Para descobrir o valor em reais a ser pago:
        valorASerPago = precoDoQuilowatt * consumoEmQuilowatts; 
        //Para descobrir o valor a ser pago com desconto de 10%:
        valorComDesconto = valorASerPago - (valorASerPago * 0.1); 
        
        //Dados informados ao usuário:
        System.out.println("O valor de cada KW é de: R$ " + new DecimalFormat(".##").format(precoDoQuilowatt));
        System.out.println("O valor em reais a ser pago é de: R$ " + new DecimalFormat(".##").format(valorASerPago));
        System.out.println("O valor a ser pago com um desconto de 10% é de: R$" + new DecimalFormat(".##").format(valorComDesconto));
    }
    
}
