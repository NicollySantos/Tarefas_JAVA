package ex07;
import javax.swing.JOptionPane;

public class ex07 {


public static void main(String args[]) {

double conta;
double num1 = 0; 
double num2 = 0;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da altura:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o raio da circunfer�ncia:"));

conta = 3.14*(num2*num2)*num1;
JOptionPane.showMessageDialog(null,"A �rea do ret�ngulo �: " + conta);

System.exit(0); 

 }
} 