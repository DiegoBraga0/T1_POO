package main;

import java.util.Scanner;
public class Q22 {

	public static void main(String[] args) {
		
		/* Entre com um salario base e a quantidade de Kw consumidos e receba dados de acordo
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		
		System.out.println("Seu salario : ");
		vlr_sal = sc.nextDouble();
		System.out.println("Quilowatts consumidos : ");
		qtd_kw = sc.nextDouble();
		
		vlr_kw = vlr_sal / 5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * 15 / 100;
		vlr_desc = vlr_reais - desc;
		
		System.out.println("O valor a ser pago em Kw é : "+vlr_kw);
		System.out.println("O valor total a ser pago é : "+vlr_reais);
		System.out.println("Com o desconto o valor é : "+vlr_desc);
		
	}

}
