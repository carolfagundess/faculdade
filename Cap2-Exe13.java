/*
AUTOR: Bruna Kroth
DATA: 29/08/2023
AÇÃO: Exercício 13 - LP02
*/
package fonte;

//BIBLIOTECAS:
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat dfMilhas = new DecimalFormat("0.000000000");
        DecimalFormat dfPes = new DecimalFormat("0.000000");
        DecimalFormat dfPolegadas = new DecimalFormat("0.00000");
        // VARIÁVEIS:
        float metros, quilometros, centimetros, milimetros, milhas, pes, polegadas;
        
        // LÓGICA:
        System.out.print("Informe a distância em metros: ");
        metros = teclado.nextFloat();
    
        quilometros = metros/1000;
	centimetros = metros*100;
	milimetros = metros*1000;
	milhas = metros/1609.344f;
	pes = metros/0.3048f;
	polegadas = metros/0.0254f;

        // RESULTADO:
        System.out.println("Valores correspondentes...\n Medidas métricas: \n- Quilômetro: "+quilometros+
        "km\n- Centímetro: "+centimetros+"cm\n- Milímetro: "+milimetros+
        "mm \n\nMedidas britânicas/americanas:\n- Milha: "+dfMilhas.format(milhas)+"mi\n- Pé: "+dfPes.format(pes)+
        "ft\n- Polegada: "+dfPolegadas.format(polegadas)+"in");
    }
    
}
