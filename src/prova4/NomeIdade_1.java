package prova4;

import java.util.Scanner;

public class NomeIdade_1 {
	public static void main(String args[])
	{
		
		
        Scanner input = new Scanner(System.in);
		
		int idade1, idade2, idade3,soma,local, numero3 = 0;
		String nome1, nome2, nome3;
		
		System.out.print("Digite o primeiro nome:   \n");
		nome1 = input.next();
		System.out.print("Digite a idade:   \n");
		idade1 = input.nextInt();
		
		System.out.print("Digite o segundo nome:   \n");
		nome2 = input.next();
		System.out.print("Digite a idade:    \n");
		idade2 = input.nextInt();
		
		System.out.print("Digite o terceiro nome:   \n");
		nome3 = input.next();
		System.out.print("Digite a idade:   \n");
		idade3 = input.nextInt();
		
		//Mais velha
		
       if (idade1 > idade2)
    	   local = idade1;
       else
    	   local = idade2;
       if(local > idade3)
    	   System.out.printf("\n" + local +" é a maior idade.");
       else
    	   System.out.printf("\n" + idade3 +" é a maior idade.");
       
       
       
       if (local == idade1) {
    	   System.out.println("\n" + nome1 + " é a pessoa mais velha."); 
    	   System.out.println("======================================");
    	   
	       }
       else if (local == idade2) {
		   System.out.println("\n" + nome3 + " é a pessoa mais velha.");
		   System.out.println("======================================");
            }
       else
    	   System.out.println("\n" + nome2 + " é a pessoa mais velha.");  
           System.out.println("======================================");
       
       //Mais nova
       
       if (idade1 < idade2)
    	   local = idade1;
       else
    	   local = idade2;
       if(local < idade3)
    	   
    	   System.out.printf("\n" + local +" é a menor idade.");
       else
    	   System.out.printf("\n" + idade3 +" é a menor idade.");
       
       
       
       if (local == idade1) {
    	   System.out.printf("\n" + nome1 + " é a pessoa mais nova.");   
    	   
	       }
       else if (local == idade2) {
		   System.out.printf("\n" + nome3 + " é a pessoa mais nova.");
            }
       else
    	   System.out.printf("\n" + nome2 + " é a pessoa mais nova."); 
       
       
}

}
