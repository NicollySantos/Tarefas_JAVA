package Lista_de_exs_ENQUANTO;



public class ex07 {


public static void main(String args[]) {


	int anterior = 1;
	int atual = 1;
	int contador = 3;
	int proximo=0;


	System.out.println( "Prossiga para ver a s�rie de Fibonacci at� o 15� termo:");
	System.out.println( "1� = " + anterior);
	System.out.println( "2� = " + atual);


while (contador <= 15) {
    proximo = anterior + atual;
    System.out.println( "\n"  +contador + "�: " + anterior + " + " + atual + " = " + proximo);
    contador++;
    anterior = atual;
    atual = proximo;
}

}}

