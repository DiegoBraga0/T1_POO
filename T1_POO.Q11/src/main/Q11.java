package main;

import java.util.Scanner;

public class Q11 {

 public static void main(String[] args) {
   /* Entre com um número real e receba : ele ao quadrado,
   * ao cubo, sua raiz quadrada e sua raíz cúbica    
   */
  
  Scanner sc = new Scanner(System.in); // new scanner pra declarar

  System.out.println("Escreva o numero.");
  double num = sc.nextDouble(); 
        
         double quadrado = Math.pow(num,2);
         double cubo = Math.pow(num,3);
         double rootquad = Math.pow(num, 0.5);
         double rootcubohelper = (double) 1/3; //Ajuda na linha abaixo
         double rootcubo = Math.pow(num, rootcubohelper);
           
    System.out.println("Seu numero ao quadrado é: " + quadrado );
    System.out.println("Seu numero ao cubo é: " + cubo);
    System.out.println("Raiz quadrada do numero: " + rootquad);
    System.out.println("Raiz cubica do numero: " + rootcubo);
    }


 }
