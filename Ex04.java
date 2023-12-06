package ex01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4, dif;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número 1 :\n");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o número 2 :\n");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o número 3 :\n");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o número 4 :\n");
		n4 = leia.nextFloat();
		
		dif = (n1 * n2) - (n3 * n4); 
		System.out.printf("\n a diferença é :\n"+ dif);
	}

}
