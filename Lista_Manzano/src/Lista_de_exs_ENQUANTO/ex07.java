package Lista_de_exs_ENQUANTO;



public class ex07 {


public static void main(String args[]) {


	int anterior = 1;
	int atual = 1;
	int contador = 3;
	int proximo=0;


	System.out.println( "Prossiga para ver a série de Fibonacci até o 15º termo:");
	System.out.println( "1º = " + anterior);
	System.out.println( "2º = " + atual);


while (contador <= 15) {
    proximo = anterior + atual;
    System.out.println( "\n"  +contador + "º: " + anterior + " + " + atual + " = " + proximo);
    contador++;
    anterior = atual;
    atual = proximo;
}

}}

