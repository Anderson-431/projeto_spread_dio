package Spread;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 !=0) {
			System.out.println("�MPAR");
		}else {
			System.out.println("PAR");
		}
		
		
		
		sc.close();

	}

}
