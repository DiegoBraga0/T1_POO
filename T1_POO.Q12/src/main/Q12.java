package main;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/* Entra com 2 números inteiros e receba um deles elevado ao outro e vice versa
        */


		Scanner sc = new Scanner(System.in);
        
		System.out.println("Escreva um numero maior que zero.");
		int num1 = sc.nextInt(); //obvio, var 1
        
		System.out.println("Segundo numero maior que zero.");
		int num2 = sc.nextInt(); //tambem obvio
		
		if(num1 > 0 && num2 > 0) { 
		double num1quad = Math.pow(num1, num2); //numero 1 elevado ao num2
		double num2quad = Math.pow(num2, num1); //contrario da linha anterior
		
		System.out.println(num1 + " elevado a " + num2 + " é igual a " + num1quad);
		System.out.println(num2 + " elevado a " + num1 + " é igual a " + num2quad);
		}
		else {
			System.out.println("Por favor confirme que seus numeros são positivos e maiores que zero!");
		} // fim do else
	

	}

}

