
package fonte;

import java.util.Scanner;

/**[ Consumo de combustível ] Crie um programa que calcule a quantidade de litros de combustível
consumidos em uma viagem, sabendo-se que o carro tem autonomia de 12 km por litro de combustível. O
programa deverá ler o tempo decorrido na viagem e a velocidade média e aplicar as fórmulas. Ao final, o
programa deverá mostrar a distância percorrida e a quantidade de litros consumidos na viagem.
D = Distância percorrida; T = Tempo decorrido em horas; V = Velocidade média; L = Litros de combustível
 *D=T*V e L=D/12
 *Autor: Leandro Luis Coutinho da Silva
 *Data: 09/09/2023
 *Ação: Exercício 11 
 **/
public class Principal 
{
   
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner (System.in);
        
        //VARIÁVEIS:
        final int autonomia = 12;
        float tempoDecorrido;
        float velocidadeMedia;
        float distanciaPercorrida;
        float consumoDaViagem;
        
        //LÓGICA DO PROGRAMA:
        
        //Entrada de Dados:
        System.out.println("Informe o tempo de viagem(em horas): ");
        tempoDecorrido = teclado.nextFloat();
        System.out.println("informe a velocidade média durante a viagem: ");
        velocidadeMedia = teclado.nextFloat();
        
        //Cálculos:
        distanciaPercorrida = tempoDecorrido * velocidadeMedia;
        consumoDaViagem = distanciaPercorrida / autonomia;
        
        //Dados informados ao usuário:
        System.out.printf("A distância percorrida durante a viagem foi de %.2f",distanciaPercorrida);
        System.out.printf("\nO consumo de combustível durante a viagem, em litros, foi de: %.2f",consumoDaViagem);
    
    }
    
}
