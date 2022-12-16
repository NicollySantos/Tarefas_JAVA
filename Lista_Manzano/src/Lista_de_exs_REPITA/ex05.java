package Lista_de_exs_REPITA;

public class ex05 {




public static void main(String args[]) {

	int numero=0;
	int contador = 1;
	int somatorio = 0;
	int fatorial = 1;


do {
    System.out.println("Digite o " + contador + "º valor:");
    do {
        fatorial = fatorial * numero;
        numero--;
    } while (numero > 1);
    
    somatorio = somatorio + fatorial;
    contador++;
    fatorial = 1;
} while (contador <= 15);
System.out.println("O somatório do fatorial dos 15 valores é igual a: " + somatorio);
}}