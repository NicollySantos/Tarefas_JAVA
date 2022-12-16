package Lista_de_exs_ENQUANTO;


import javax.swing.JOptionPane;

public class ex06 {


public static void main(String args[]) {


	int base=0;
	int expoente = 0;
	int contador = 1;
	int potencia = 1;




base = Integer.parseInt(JOptionPane.showInputDialog(null,"Potência - Digite o valor da base:"));

expoente = Integer.parseInt(JOptionPane.showInputDialog(null,"Potência - Digite o valor da expoente:"));


while (contador <= expoente) {
    potencia *= base;
    contador++;
}

System.out.print("\n" + base + " ** " + expoente + " = " + potencia);

}}

