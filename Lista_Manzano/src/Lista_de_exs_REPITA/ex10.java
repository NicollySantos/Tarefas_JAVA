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
    System.out.println("O resultado da divis�o inteira entre " + dividendo + " e " + divisor + " � igual a: " + quociente);
    resposta = ("Deseja realizar outro c�lculo [S/N]? ");
} while (resposta == "S");

if (resposta != "S") {
    System.out.println("Programa Finalizado!");
}}}
