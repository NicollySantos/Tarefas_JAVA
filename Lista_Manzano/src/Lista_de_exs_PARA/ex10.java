package Lista_de_exs_PARA;



public class ex10 {

public static void main(String[] args) {
		
		for (float Celsius = 10; Celsius < 110; Celsius+=10) {
			System.out.println("=============================");
			System.out.println("A temperatura em Celsius � de " + Celsius);
			float Fahrenheit = (9 * Celsius + 160) / 5;
			System.out.println("A temperatura convertida � de:" + Fahrenheit);
			System.out.println("==============================");
		}

	}



}
