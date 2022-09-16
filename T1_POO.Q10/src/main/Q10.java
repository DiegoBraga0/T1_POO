package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q10 {
	/* Entre com 
	 */
	
public static void main(String[] args) {
	float raio ;
	double area ;
	
	DecimalFormat df = new DecimalFormat("0.00");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escreva o raio do circulo.");
	raio = sc.nextFloat();
	
    area = 3.1415 * (raio * raio) ;
	System.out.println("A area do seu circulo é : " + df.format(area));
	

    }
}