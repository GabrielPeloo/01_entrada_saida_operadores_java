package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário :\n");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono :\n");
		abono = leia.nextFloat();
		
		novoSalario = (salario + abono); 
		System.out.printf("\n Seu novo salário é:\n"+ novoSalario);
	}

}
