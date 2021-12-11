package view;

import java.util.Scanner;

class MenuPrincipal {
	
	
	public void menu() {
		
		int opcao;
		
		Scanner sc = new Scanner(System.in);
		 
		do {
			System.out.println("*******MENU********");
			System.out.println("Bem  vindo! Qual sistema deseja acessar?\n");
			System.out.println("1 - Motorista\n");
			System.out.println("2 - Administrativo\n");
			System.out.println("0 - Sair\n");
			
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					motorista.menu();
					break;
			
				case 2:
					administrativo.menu();
					break;
					
				default:
					break;
			}
		}while(opcao!=0);
	}
}
