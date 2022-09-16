package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2 {
	/* Entre 
	 * 
	 */

	public static void main(String[] args) {
			float nota1 , nota2 , nota3 , media ; 
			DecimalFormat df = new DecimalFormat("0.0");
			Scanner sc = new Scanner(System.in) ;
			
			System.out.println("Sua primeira nota : ") ;
			nota1 = sc.nextFloat();
			
			System.out.println("Sua segunda nota : ");
			nota2 = sc.nextFloat();
			
			System.out.println("Sua terceira nota : ");
			nota3 = sc.nextFloat();
		media = (nota1 + nota2+ nota3) /3 ;
		System.out.println("Sua media das notas foi : " + df.format(media));
			

	}

}
