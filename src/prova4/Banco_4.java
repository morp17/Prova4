package prova4;

import java.util.Scanner;

public class Banco_4 {
	
	public static void main(String aegs[]){
		
	     Scanner teclado = new Scanner(System.in);
	     
	     double  saldo, credito;
	  
	    	 

		 System.out.print("Informe o saldo m�dio: ");
		 saldo = teclado.nextInt();
		 
		 if (saldo >= 0 && saldo <= 200) {
			 System.out.print("\n Nenhum cr�dito");
			
		}
		 else
			 if (saldo >= 201 && saldo <= 400) {
				 System.out.print("Base de c�lculo: 20% do valor do saldo m�dio");
				credito = saldo*20/100;
				System.out.print("\n O limite de credito dispon�vel �: " + credito);
			}
			 else
				 if (saldo >= 401 && saldo <= 600) {
					 System.out.print("Base de c�lculo: 30% do valor do saldo m�dio");
					credito = saldo*30/100;
					System.out.print("\n O limite de credito dispon�vel �: " + credito);
				}
				 else
					 if (saldo >= 601) {
						 System.out.print("Base de c�lculo: 40% do valor do saldo m�dio");
						 credito = saldo*40/100;
						 System.out.print("\n O limite de credito dispon�vel �: " + credito);
					}
		 
	   

	
}

}
