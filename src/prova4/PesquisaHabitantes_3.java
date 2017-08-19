package prova4;

import java.util.Scanner;

public class PesquisaHabitantes_3 {
	
	public static void main(String aegs[]){
		
	     Scanner teclado = new Scanner(System.in);
	     
	     int  Idade, cCabelo, cOlho, Sexo, i;
	     
	     int idMax=0;
	     int espec=0;

	     for(int cont=0;cont!=3;cont++){
	    	 

		 System.out.print("Digite a idade: ");
		 Idade = teclado.nextInt();
	    	 
	     System.out.print("Digite o sexo: (1) para Masculino e (2) para Feminino \n");   
	     Sexo = teclado.nextInt();


	     System.out.print("Digite a cor dos olhos: (1) para Azul (2) para Castanhos e (3) para Verdes \n");   
	     cOlho = teclado.nextInt();

	     System.out.print("Digite a cor dos cabelos: (1) para Preto (2) para Castanhos e (3) para Loiros \n");
	     cCabelo = teclado.nextInt();

	     if(Idade>idMax){
	         idMax = Idade;
	     }
	     if((Sexo==2)&&(Idade>=18 && Idade <= 35)&&(cOlho==3)&&(cCabelo==3)){
	        espec ++; 
	     }
	     System.out.print("\n ================================================= \n");
	     }
	     System.out.println("A maior idade registrada é "+ idMax);
	     System.out.println("Pessoas com as caracteristicas especificas "+ espec);
	}

}
