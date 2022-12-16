package sistemaCadastro;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
	cadastro(0,0);
	
	}
	public static void cadastro(int j, int k) {
		Scanner obj = new Scanner(System.in);
		String nome[] = new String[3];
		int idade[] = new int[3];
		
		for (int i = 0; i<3; i++) {
			System.out.println("Digite seu nome: ");
			nome[i] = obj.next();
			System.out.println("Digite sua idade: ");
			idade[i] = obj.nextInt();
		}
		System.out.println("Cadastros Feitos:");
		System.out.println("++++++++++++++++++++++++++++++");
		
		for (int c=0; c<nome.length; c++) {
			System.out.println(c+1 + " ° Cadastro");
			System.out.println("Nome : " +nome[c]);
			System.out.println("Idade : " +idade[c]);
			System.out.println("++++++++++++++++++++++++++++++");

		}
		obj.close();
	}
}
