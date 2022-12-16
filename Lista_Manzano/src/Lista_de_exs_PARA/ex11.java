package Lista_de_exs_PARA;



public class ex11 {


	public static void main(String[] args) {
		for (int numero = 1; numero <= 10; numero += 2) {
			  int resultado = 1;
			  for (int i = numero; i > 0; i--) {
			    resultado = resultado * i;
			  }
			  System.out.println(resultado);
			}
	   }




}
