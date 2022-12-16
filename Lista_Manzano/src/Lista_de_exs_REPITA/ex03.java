package Lista_de_exs_REPITA;

public class ex03 {




public static void main(String args[]) {


int contador = 1;
int somador = 0;


do {
    if (contador % 4 == 0) {
    	System.out.println("Números divisíveis por 4 entre 1 e 200: " + contador);
    }
    contador++;
} while (contador < 201);
}}