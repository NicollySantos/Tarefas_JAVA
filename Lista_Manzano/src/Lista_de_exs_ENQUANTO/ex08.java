package Lista_de_exs_ENQUANTO;



public class ex08 {


public static void main(String args[]) {


	int fahrenheit = 0;
	int contador = 10;

	System.out.println("Conversão de graus Celsius para Fahrenheit de 10 em 10 graus:");
while (contador <= 100) {
    fahrenheit = (9 * contador + 160) / 5;
    System.out.println("\n " + contador + "ºC = " + fahrenheit + "ºF");
    contador += 10;
}

}}
