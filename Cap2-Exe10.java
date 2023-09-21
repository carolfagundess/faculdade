
package fonte;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10ConversaoCEmF {

   public static void main(String[] args) {
        DecimalFormat decForm = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        
         //VARIAVEIS LOCAIS
        float celsius, fahre, calculo;

        //LÓGICA
        System.out.println("Digite o valor em Celsius (°C): ");
        celsius = scan.nextFloat();
        calculo = (9 * celsius + 160) / 5; // calculo para descobrir o valor em fahreinheit

        //SAIDA TERMINAL FAHREINHEIT
        System.out.println(celsius + "°C em Fahrenheit é: " + calculo + "°F");
        
      /* ------------------------------------------------------------------------  */
      
        System.out.println("\n\nDigite o valor em Fahreinheit (°F): ");
        fahre = scan.nextFloat();
        calculo = ((fahre - 32) * 5 / 9); // calculo para descobrir o valor em celsius

        //SAIDA TERMINAL CELCIUS
        System.out.println(fahre + "°F em Celsius é: " + decForm.format(calculo) + "°C");
    }        
}
