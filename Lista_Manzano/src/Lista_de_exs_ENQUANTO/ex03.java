package Lista_de_exs_ENQUANTO;

public class ex03 {


public static void main(String args[]) {

int somaPares = 0; 
int contador = 1; 


while (contador < 501) {
    if (contador % 2 == 0) {
       somaPares += contador;
    }
    contador++;
}
System.out.print("A soma dos pares entre 1 e 500 é igual a: " + somaPares);

}}

