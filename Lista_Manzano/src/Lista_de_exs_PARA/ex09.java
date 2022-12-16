package Lista_de_exs_PARA;



public class ex09 {


	public static void main(String[] args) {
	int numeroAtual = 1;
	int numeroNovo = 0;
	int numeroAnterior = 0;
	
	for (int i = 0; i < 14; i++) {
		numeroNovo = numeroAtual + numeroAnterior;
		numeroAnterior = numeroAtual;
		numeroAtual = numeroNovo;
		}
		System.out.println(numeroAtual);
	}




}
