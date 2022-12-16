package Lista_de_exs_REPITA;

public class ex07 {




public static void main(String args[]) {


int numero = 1;
int contador = 1;
int fatorial;

do {
    if (contador % 2 == 1) {
        fatorial = 1;
        numero = contador;
        do {
            fatorial *= numero;
            numero--;
        } while (numero > 1);
        System.out.println("O fatorial de " + contador + " é igual a: " + fatorial);
    }
    contador++;
} while (contador <= 10);
}}
