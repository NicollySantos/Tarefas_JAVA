package Lista_de_exs_ENQUANTO;



public class ex04 {


public static void main(String args[]) {

int somaImpares = 0; 
int contador = 0; 



while (contador < 21) {
    if (contador % 2 == 1) {
        somaImpares++;
        System.out.print(contador + " é ímpar!\n");
    }
    contador++;
}
System.out.print("Entre 0 e 20 existem " + somaImpares + " valores ímpares.");

}}

