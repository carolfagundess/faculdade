/*
AUTOR: Bruna Kroth
DATA: 29/08/2023
AÇÃO: Exercício 12 - LP02
*/
package fonte;

//BIBLIOTECAS:
import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // VARIÁVEIS:
        float altura, comprimento, area, quantidadeDeTinta, rendimentoDaTinta;
        
        // LÓGICA:
        System.out.print("Informe as medidas da parede em metros (m):\nAltura: ");
        altura = teclado.nextFloat();
        System.out.print("Comprimento: ");
        comprimento = teclado.nextFloat();
        System.out.print("Informe o rendimento da tinta em metros quadrados por litros (m²/l): ");
        rendimentoDaTinta = teclado.nextFloat();

        area = altura * comprimento;
        rendimentoDaTinta = rendimentoDaTinta - (rendimentoDaTinta * 15 / 100);
        quantidadeDeTinta = area / rendimentoDaTinta;

        // RESULTADO:
        System.out.println("A área a ser pintada é de "+df.format(area)+
        "m² e a quantidade de tinta necessária, considerando a perda de 15% é de "+df.format(quantidadeDeTinta)+" litros.");
    }
    
}
