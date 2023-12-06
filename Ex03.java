package ex01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto, adNoturno, horasEx, descontos, salarioLiq;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto :\n");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno :\n");
		adNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras :\n");
		horasEx = leia.nextFloat();
		
		System.out.println("Digite os descontos :\n");
		descontos = leia.nextFloat();
		
		salarioLiq = (salarioBruto+adNoturno+(horasEx * 5)-descontos); 
		System.out.printf("\n seu salário líquido é :\n"+ salarioLiq);
	}

}
