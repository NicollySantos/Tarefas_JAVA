package Lista_de_exs_ENQUANTO;



public class ex05 {


public static void main(String args[]) {


int base = 3;
int expoente = 0;
int potencia = 1;
int contador = 1;




while (expoente <= 15) {
    while (contador <= expoente) {
        potencia *= base;
        contador++;
    }
System.out.print("\n" + base + " ** " + expoente + " = " + potencia);
expoente++;

}}}