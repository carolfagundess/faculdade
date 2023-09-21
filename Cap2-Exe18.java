/*
AUTOR: Patricia Schonarth
DATA: 24 / 08 / 2023
AÇÃO: Atividade 18 - Formato Ano MÊs
[...]....
 */
package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Variaveis
        Scanner teclado = new Scanner(System.in); //para chamar teclado
        int data, dia, mes, ano;
        
        //Logica
        System.out.println("Informe uma data no formato DDMMAA: ");//para chamar teclado
       
        data = teclado.nextInt();
        
        //Logica - conta
        dia = data / 10000;//conta 140923/1000 = 14,09 -> 14 dia   desloca a vircula 14,0923
        mes = (data%10000) / 100;//conta: 140923/10000 = 14; resto = 923/100 = 9,23 -> 9 mes
        ano = (data%10000) % 100; //conta: 140923/10000 = 14 resto = 923 -> 923/100 = 23 -> ano
       
        //Saida
        System.out.println("--------------------------------------------");
        System.out.println("Dia: " +dia);
        System.out.println("Mes: " +mes);
        System.out.println("Ano: " +ano);
        
        ano = ano + 2000; //23 + 2000 = 2023 para usar na formatação logo em baixo
        
        System.out.println("--------------------------------------------");
        System.out.println("Formato DD/MM/AAAAA: " +dia+ "/" +mes+ "/" +ano);
        System.out.println("Formato AAAAMMDD: " +ano+ "" +mes+ "" +dia);
        System.out.println("---------------------------------------------");
        
    }
    
}
