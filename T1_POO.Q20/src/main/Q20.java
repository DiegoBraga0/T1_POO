package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q20 {
    
    /* Entre coma angulação e altura de uma escada que está encostada na parede e receba o comprimento da mesma
    */
    
    public static void main(String[] args) {
        
        // definindo as variáveis dos imports
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.0");
        
        //definindo variáveis 
        double alt, ang, escada, rad;
        
        System.out.println("Qual o ângulo formado pela escada?(graus °)");
        ang = sc.nextDouble();
        
        System.out.println("Qual a altura que a escada está encostada na parede?(metros)");
        alt = sc.nextDouble();
        
        // é necessário converter o grau em radiano pq o Math.sin que calcula o seno não recebe o valor em graus
        rad = (ang * 3.14)/180 ;
        
        escada = alt/ Math.sin(rad);
        
        System.out.println("O tamanho da escada é de " + df.format(escada)+ "m !");
        
    }
    
}