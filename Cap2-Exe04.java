package fonte;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num1, num2, resto, quociente;
        
        System.out.println("Informe um numero inteiro: ");
        num1 = scan.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        num2 = scan.nextInt();
        
        quociente = num1/num2;
        resto = num1%num2;
        
        System.out.println("O quociente da divisao dos numeros e " + quociente + " e o resto e " + resto);
    }
}
