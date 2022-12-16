package Lista_de_exs_PARA;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		int multiplicador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para ver a sua tabuada:");
		int numero = sc.nextInt();
		for (int i = 1; i <=
				510; i++) {
			 multiplicador = i * numero;
			 System.out.println(i + " X " + numero + " = " + multiplicador);
		}

	}


}
