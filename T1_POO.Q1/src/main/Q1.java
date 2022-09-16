package main;

import java.util.Scanner ;

public class Q1 {

	public static void main(String[] args) {
		int num1,num2,num3,num4,soma	 ;
		
		Scanner sc = new Scanner (System.in); // var scanner 
		System.out.println("Escreva o primeiro numero a ser somado.");
		num1 = sc.nextInt();
		
		System.out.println("Escreva o segundo numero a ser somado.");
		num2 = sc.nextInt();
		
		System.out.println("Escreva o terceiro numero.");
		num3 = sc.nextInt();
		
		System.out.println("Quarto");
		num4 = sc.nextInt();
	    
		soma = num1 + num2+num3+num4 ;
		System.out.println("Sua soma é exatemente: " + soma); // prints the result
	}

}
