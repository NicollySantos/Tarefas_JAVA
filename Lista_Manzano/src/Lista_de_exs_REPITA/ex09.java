package Lista_de_exs_REPITA;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class ex09 {




public static void main(String args[]) {


	int valor = 0 ;
			int menor = valor;
			int maior = valor;

			valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor numérico inteiro:"));
			do {
			    valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro valor numérico inteiro: [- interrompe]"));
			    if (valor > maior) {
			        maior = valor;
			    }
			    if (valor < menor) {
			        menor = valor;
			    }
			} while (valor >= 0);
			System.out.println("O maior e o menor valor digitado respectivamente foi: " + maior + " e " + menor);
}}

