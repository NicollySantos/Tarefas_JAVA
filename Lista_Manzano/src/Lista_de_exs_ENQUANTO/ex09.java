package Lista_de_exs_ENQUANTO;


import javax.swing.JOptionPane;

public class ex09 {


public static void main(String args[]) {


	int contador = 1;
	int valor=0;
	int soma = 0;
	int media = 0;



while (contador <= 10) {
	valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o " + contador + "º valor:"));
    soma = soma + valor;
    media = soma / contador;
    contador++;
}
System.out.println("Soma dos valores = " + soma + " | Média dos valores = " + media);
}}