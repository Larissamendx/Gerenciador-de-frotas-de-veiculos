package view;

import java.util.Scanner;

public class Administrativo {
	
	public void menu() {
		
	int opcao;
	
	Scanner sc = new Scanner(System.in);
	 
	do {
		System.out.println("*******MENU********");
		System.out.println("Bem  vindo adm! O que deseja acessar?\n");
		System.out.println("1 - Gerenciar veiculos.\n");
		System.out.println("2 - Gerenciar motoristas.\n");
		System.out.println("3 - Gerenciar rotas.\n");
		System.out.println("4 - Relatório de veículos.\n");
		System.out.println("5 - Relatório de alocação de motoristas.\n");
		System.out.println("6 - Relatório de viagens completas.\n");
		System.out.println("0 - Sair\n");
		
		opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				gerenciarVeiculos.menu();
				break;
		
			case 2:
				gerenciarMotoristas.menu();
				break;
				
			case 3:
				gerenciarRotas.menu();
				break;
				
			case 4:
				relatorioVeiculos.menu();
				break;
				
			case 5:
				RelatorioAlocacao.menu();
				break;
				
			case 6:
				RelatorioViagens.menu();
				break;
				
			default:
				break;
		}
	}while(opcao!=0);

}
}
