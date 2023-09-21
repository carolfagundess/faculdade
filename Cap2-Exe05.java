/*
AUTOR: Patricia Schonarth
DATA: 24 / 08 / 2023
AÇÃO: Atividade 5 - Minutos que Passaram
[...]....
 */
package principal;

import java.util.Scanner;//biblioteca para chamar teclado

public class Principal {

    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in);//para chamar teclado
        int minuto, hora, horaConv, horaAtual, segundos;

        //Logica
        System.out.println("Informe a hora: ");
        hora = teclado.nextInt();
        System.out.println("Informe a minuto: ");
        minuto = teclado.nextInt();
        
        //Logica - conta
        horaConv = hora * 60;
        
        horaAtual = horaConv + minuto;
        segundos = horaAtual * 60;
        //minutos = (horaatual * 60);//para chamar teclado ---> usar 00,00 no teclado
        
        //Saida
        System.out.println("--------------------------------------------");
        System.out.println("Ja se passaram " +horaAtual+ " minutos do dia ! ");
        System.out.println("Ja se passaram " +segundos+ " segundos do dia ! ");
    }
    
}
