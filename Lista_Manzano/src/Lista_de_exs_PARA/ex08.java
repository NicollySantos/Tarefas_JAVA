package Lista_de_exs_PARA;


import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int i = 0;
		int resultado = 1;
		
		System.out.println("Digite a base");
		int base = sc.nextInt();
		System.out.println("Digite o expoente");
		int expoente = sc.nextInt();
		
		
		for (i = 0; i < expoente; i++) {
			resultado = base * resultado;
			if (expoente == 0 ) {
				resultado = 1;
			}
		}
		System.out.println("O resultado é " + resultado);
	}




}
