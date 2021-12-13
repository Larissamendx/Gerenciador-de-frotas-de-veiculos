package view;

import java.util.Scanner; 

class MotoristaMenu {
	
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

        public void registrarInicio(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Este é o início da viagem?:\n");
            boolean inicio = sc.nextBoolean();
            sc.nextLine();  
            System.out.println("Informe a data de início:\n");
            String dataIni = sc.nextLine();
            sc.nextLine();
            System.out.println("Informe o horário do início:\n");
            String horarioIni = sc.nextLine();
            sc.nextLine();
            System.out.println("Informe o local de início:\n");
            String localIni = sc.nextLine();
            sc.nextLine();
        }

        public void registrarLocalizacao(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe a sua localização atual:\n");
            String local = sc.nextLine();
            sc.nextLine();
            System.out.println("Informe a data:\n");
            String data = sc.nextLine();
            sc.nextLine();
            System.out.println("Informe o horário:\n");
            String horario = sc.nextLine();
            sc.nextLine();
        }

        public void registrarChegada(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Esta é o fim da viagem?:\n");
            boolean chegada = sc.nextBoolean();
            sc.nextLine();
            System.out.println("Informe a data de chegada:\n");
            String dataFim = sc.nextLine();
            sc.nextLine();
            System.out.println("Informe o horário de chegada:\n");
            String horarioFim = sc.nextLine();
            sc.nextLine();
            System.out.println("Informe o local de chegada:\n");
            String localFim = sc.nextLine();
            sc.nextLine();
        }   

}