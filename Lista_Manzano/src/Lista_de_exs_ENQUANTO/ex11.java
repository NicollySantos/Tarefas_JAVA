package Lista_de_exs_ENQUANTO;


import javax.swing.JOptionPane;

public class ex11 {


public static void main(String args[]) {



int comodo;
int largura, comprimento, area, areaTotal = 0;
String resposta = null;

while (resposta == "sim") {

comodo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o nome do comodo:"));

    largura = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a largura do(a) " + comodo + " (m):"));
    comprimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o comprimento do(a) " + comodo + " (m):"));
    area = largura * comprimento;
    System.out.println("A área do(a) " + comodo + " corresponde a: " + area + " m²");
    resposta = JOptionPane.showInputDialog(null,"Deseja continuar? [sim/não]");
    areaTotal += area;
}
System.out.println("A área total da residência corresponde a: " + areaTotal + " m²");
}}

