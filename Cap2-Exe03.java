package lista1_lp;

import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        //variáveis
        float nota1, nota2, nota3;
        double media;
        
        System.out.println("Informe a sua primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println("Informe a sua segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.println("Informe a sua terceira nota: ");
        nota3 = sc.nextFloat();
        
        nota1 = (nota1*0.3f);
        nota2 = (nota2*0.4f);
        nota3 = (nota3*0.3f);
        
        media = (nota1 + nota2 + nota3);
        
        System.out.println("A media ponderada e de "+media);
    }
}
