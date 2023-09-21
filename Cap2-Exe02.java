//Sara

package atividadessara;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        int minutos;
        float horas;
    
        System.out.println("Informe o tempo em minutos: ");
        minutos = scan.nextInt();
        
        horas = minutos/60f;
        
        System.out.println("O tempo em horas eh de: "+ horas);
    
    }
}
