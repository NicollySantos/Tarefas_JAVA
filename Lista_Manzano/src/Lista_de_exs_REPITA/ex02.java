package Lista_de_exs_REPITA;

public class ex02 {


public static void main(String args[]) {


int contador = 1;
int somador = 0;

do {
    if (contador % 2 == 0) {
        somador = somador + contador;
        
    }
    contador++;
} while (contador <= 500);
System.out.println("A soma dos valores pares entre 1 e 500 é igual a: " + somador);
}}
