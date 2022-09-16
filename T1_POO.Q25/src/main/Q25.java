package main;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double custo, convite, qtd;
		 
		
		System.out.println("Qual op custo do espetáculo?");
		custo = sc.nextDouble();
		System.out.println("Qual o preço do convite?");
		convite = sc.nextDouble();
		
		qtd = custo / convite;
		System.out.println("Devem ser vendidos "+qtd+" para cobrir os custos do espetáculo!");
		

	}

}
