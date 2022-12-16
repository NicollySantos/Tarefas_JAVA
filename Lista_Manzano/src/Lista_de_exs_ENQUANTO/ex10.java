package Lista_de_exs_ENQUANTO;



public class ex10 {


public static void main(String args[]) {


	int contador = 50;
	int valor=0;
	int soma = 0;
	int media = 0;
	int pares=0;



	while (contador <= 70) {
	    if (contador % 2 == 0) {
	        soma = soma + contador;
	        pares++;
	    }
	    contador++;
	}
	media = soma / pares;
System.out.println("Soma dos valores = " + soma + " | Média dos valores = " + media);
}}


