package prova4;

import java.util.Scanner;

public class Triangulo_2 {
	
	public static void main(String[] args) {
		
	int num, num1, num2;
	

	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um numero");
	num = input.nextInt();
	System.out.println("Digite o segundo numero");
	num1 = input.nextInt();
	System.out.println("Digite o terceiro numero");
	num2 = input.nextInt();
	
	if (num == num1 && num1 == num2) {
		
		System.out.println("**Triângulo Equilátero**");
		
	}
	if (num == num1 && num1 !=num2 ) {
		
		System.out.println("**Triângulo Isósceles**");	
		
	}
	if (num != num1 && num1 != num2) {
		
		System.out.println("**Triângulo Escaleno**");
		
	}
	
	
	
	
	}
}
