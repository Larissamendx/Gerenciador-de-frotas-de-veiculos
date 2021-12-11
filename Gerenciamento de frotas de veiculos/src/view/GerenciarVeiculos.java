package view;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciarVeiculos {
	
	private ArrayList <Veiculo> veiculos = new ArrayList <Veiculo> ();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("*******MENU********");
			System.out.println("1 - Cadastrar veículo\n");
			System.out.println("2 - Editar veículo\n");
			System.out.println("3 - Excluir veículo\n");
			System.out.println("4 - Listar Veículo\n");
			System.out.println("0 - Sair\n");
			
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					adicionar();
					break;
			
				case 2:
					excluir();
					break;
					
				case 3:
					listar();
					break;
					
				case 4:
					editar();
					break;
					
				default:
					break;
			}
		}while(opcao!=0);
		
		sc.close();
	}
	public void adicionar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero da placa:");
		int placa = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Tipo de veiculo:");
		String tipo = sc.nextLine();
		sc.nextLine();
		
		veiculo.setPlaca(placa);
	}
	
	public void excluir() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a placa do veiculo que tu quer excluir?");
		int placa = sc.nextInt();
		sc.nextLine();
		
	}
	
	public void listar() {
		
	}
	
	public void editar() {
		int opcao;
		int placa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a placa do veiculo que você quer modificar?");
		placa = sc.nextInt();
		sc.nextLine();
		
		if () {
			System.out.println("Veiculo não identificado.");
			
			return;
		}
		else {
			
			do {
				System.out.println("***Editar veiculo***");
				System.out.println("1 - Editar placa do veiculo:" + veiculo.getPlaca());
				System.out.println("2 - Editar tipo do veiculo:" + veiculo.getTipo());
				
				opcao = sc.nextInt();
				sc.nextLine();
				
				switch(opcao) {
				case 1:
					System.out.println("Digite o novo numero da placa:");
					placa = sc.nextInt();
					sc.nextLine();
					break;
			
				case 2:
					System.out.println("Digite o novo tipo de veiculo:");
					int tipo = sc.nextInt();
					sc.nextLine();
					break;
					
				default:
					break;
			}
		}while(opcao!=0);
			}
		}
	}
