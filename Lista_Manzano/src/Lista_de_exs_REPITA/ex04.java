package Lista_de_exs_REPITA;

public class ex04 {




public static void main(String args[]) {

int quadrado = 0;
int graos = 1;
int somatorio = 0;


do {
    somatorio += graos;
    graos *= 2;
    quadrado++;
    
} while (quadrado < 64);
System.out.println("O somatório do número de grãos de trigo que se pode obter num tabuleiro de xadrez é: " + somatorio);
}}
