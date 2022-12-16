package Lista_de_exs_REPITA;

import javax.swing.JOptionPane;
import javax.swing.Spring;

public class ex10 {




public static void main(String args[]) {


int dividendo, divisor, quociente;
String resposta=null;

do {
    dividendo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do dividendo:"));
    divisor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do divisor:"));
    quociente = Integer.parseInt(JOptionPane.showInputDialog(null,dividendo / divisor));
    System.out.println("O resultado da divisão inteira entre " + dividendo + " e " + divisor + " é igual a: " + quociente);
    resposta = ("Deseja realizar outro cálculo [S/N]? ");
} while (resposta == "S");

if (resposta != "S") {
    System.out.println("Programa Finalizado!");
}}}
