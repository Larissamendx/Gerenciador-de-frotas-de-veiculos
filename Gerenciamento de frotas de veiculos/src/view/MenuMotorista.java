package view;

import java.util.Scanner; 

class Motorista {
	
	public void menu() {
	
	int opcao;
	
	Scanner sc = new Scanner(System.in);
	 
	do {
		System.out.println("*******MENU********");
		System.out.println("Bem  vindo motorista! O que deseja acessar?\n");
		System.out.println("1 - Registrar inicio da viagem.\n");
		System.out.println("2 - Registrar localização atual.\n");
		System.out.println("3 - Registrar chegada.\n");
		System.out.println("0 - Sair\n");
		
		opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				registrarInicio();
				break;
		
			case 2:
				registrarLocalizacao();
				break;
				
			case 3:
				registrarChegada();
				break;
				
			default:
				break;
		}
	}while(opcao!=0);

}
}
