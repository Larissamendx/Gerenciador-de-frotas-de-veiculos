package view;

import java.util.Scanner;

class MenuPrincipal {
	
    /*private Administrativo adm;
    private MotoristaMenu motor;

    public MenuPrincipal() {
        this.adm = new Administrativo();
        this.motor = new MotoristaMenu();
    } 
    
    public void main(String args[]) {
        menu();
    }*/

            public void main(String args[]){

		int opcao;
                Administrativo adm = new Administrativo();
                MotoristaMenu motor = new MotoristaMenu();
          	
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
					motor.menu();
					break;
			
				case 2:
					adm.menu();
					break;
					
				default:
					break;
			}
		}while(opcao!=0);
	}
}