package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q20 {
    
    /* Entre coma angula��o e altura de uma escada que est� encostada na parede e receba o comprimento da mesma
    */
    
    public static void main(String[] args) {
        
        // definindo as vari�veis dos imports
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("0.0");
        
        //definindo vari�veis 
        double alt, ang, escada, rad;
        
        System.out.println("Qual o �ngulo formado pela escada?(graus �)");
        ang = sc.nextDouble();
        
        System.out.println("Qual a altura que a escada est� encostada na parede?(metros)");
        alt = sc.nextDouble();
        
        // � necess�rio converter o grau em radiano pq o Math.sin que calcula o seno n�o recebe o valor em graus
        rad = (ang * 3.14)/180 ;
        
        escada = alt/ Math.sin(rad);
        
        System.out.println("O tamanho da escada � de " + df.format(escada)+ "m !");
        
    }
    
}