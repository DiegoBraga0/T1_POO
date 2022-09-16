package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
	float sal , salreceber, imp ;

	DecimalFormat df = new DecimalFormat("0.00");
	Scanner sc = new Scanner(System.in); //var scanner

	System.out.println("Escreva seu salario.");

	sal = sc.nextFloat();
	imp = sal * 10/100 ;
	salreceber = sal + 50 - imp;

	System.out.println("Você receberá R$" + salreceber);
		}
	
}
