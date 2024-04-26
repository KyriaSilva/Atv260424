package titio;

import java.util.Scanner;

public class Atv260424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    float sal_carlos, sal_joao;
	    int meses = 0;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o salário do Carlos: ");
	    sal_carlos =  sc.nextFloat();
	    
	    sal_joao = sal_carlos/3;
	    while (sal_joao < sal_carlos) {
	    	sal_carlos  = sal_carlos + (sal_carlos * 0.6f / 100);
	    	sal_joao = sal_joao + (sal_joao  * 1 / 100);
	    	meses = meses + 1;  
	    	
	    	System.out.print("\n-------------------------------------------------------------------");
	    	System.out.printf("\n No mês %d, o salario de carlos é de R$ %.2f | salário do joão é R$ %.2f ", meses, sal_carlos, sal_joao);
	    }
	    System.out.print("\n-------------------------------------------------------------------");
	    System.out.println("\n Quantidade de meses necessários para que João ultrapasse Carlos? " + meses);
	    		
	}

}
