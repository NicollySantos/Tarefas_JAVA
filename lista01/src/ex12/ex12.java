package ex12;

import javax.swing.JOptionPane;

public class ex12 {

public static void main(String args[]) {

double conta;
int num1 = 0; 
double num2 = 3.14;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do raio:"));

conta = num1 * num2; 
JOptionPane.showMessageDialog(null,"A área do trapézio é: " + conta);

System.exit(0); 

 }
} 