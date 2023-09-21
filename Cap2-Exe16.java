
package fonte;

import java.util.Scanner;

public class Ex16ExpressaoD {

      public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //VARIAVEIS LOCAIS
        double a, b, c, d, r, s;
        
        //LÓGICA
        System.out.println("Digite o primeiro valor(inteiro e positivo): ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor(inteiro e positivo): ");
        b = scan.nextDouble();
        System.out.println("Digite o terceiro valor(inteiro e positivo): ");
        c = scan.nextDouble();
        r =  Math.pow(a + b, 2); // 8 + 6 = 14 * 14 (vezes ele mesmo, elevado a 2) = 196
        s =  Math.pow(b + c, 2); // 6 + 2 = 8 * 8 = 64
        d = ((r + s) / 2.0); // 196 + 64 = 260 / 2 = 130
        
        //CHAMADA TERMINAL      
        System.out.println("A expressão D equivale a: " + d);    
    }      
}

