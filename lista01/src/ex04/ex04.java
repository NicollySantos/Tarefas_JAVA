package ex04;
import javax.swing.JOptionPane;

public class ex04 {


public static void main(String args[]) {

int subtracao;
int num1 = 0; 
int num2 = 0;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro n�mero:"));

subtracao = num1 - num2; 
JOptionPane.showMessageDialog(null,"A subtra��o dos n�meros �: " + subtracao);

System.exit(0); 

 }
} 