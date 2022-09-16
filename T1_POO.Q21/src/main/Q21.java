package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q21 {
    
    public static void main(String[] args) {
        /* Entre com o tamanho de uma escada e uma altura desejada, e receba a dist�ncia que a escada tem que ficar da parede
        */        
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        
        double altura, distancia, escada;
        
        System.out.println("Qual o tamanho da escada?(metros)");
        escada = sc.nextDouble();
        
        System.out.println("Qual a altura desejada?(metros)");
        altura = sc.nextDouble();
        
        if (escada < altura){
            System.out.println("Voc� precisar� de uma escada maior!");
            
        }
        else{
        
        // O Math.pow eleva um n�mero a uma pot�ncia (x^n) => Math.pow(base,pot�ncia)
        distancia = Math.pow(escada,2) - Math.pow(altura,2);
            
        // � possivel obter uma raiz elevando um n�mero a uma fra��o, no caso raiz quadrada seria n^1/2 == n^0.5
        distancia = Math.pow(distancia,0.5);
        
        System.out.println("A dist�ncia que a escada deve ficar da parede � de " + df.format(distancia) +"m !");
        }
        
    }
    
}

