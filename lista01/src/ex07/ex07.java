package ex07;
import javax.swing.JOptionPane;

public class ex07 {


public static void main(String args[]) {

int conta;
int num1 = 0; 
int num2 = 0;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da altura:"));

conta = num1 * num2; 
JOptionPane.showMessageDialog(null,"A �rea do ret�ngulo �: " + conta);

System.exit(0); 

 }
} 