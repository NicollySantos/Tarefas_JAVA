package Lista_de_exs_REPITA;

public class ex06 {




public static void main(String args[]) {



int valor=0;
int valoresLidos = 0;
int somatorio = 0;
int media = 0;


do {
    System.out.println("Digite um valor numérico inteiro [- interrompe]:");
    somatorio += valor;
    valoresLidos++;
} while (valor >= 0);
    
media = somatorio / valoresLidos;

System.out.println(valoresLidos + " valores lidos | Somatório = " + somatorio + " | Média = " + media);
}}
