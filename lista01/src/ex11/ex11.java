package ex11;

import javax.swing.JOptionPane;

public class ex11 {

public static void main(String args[]) {

int conta;
int num1 = 0; 
int num2 = 0; 
int num3 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base maior:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base menor:"));
num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da altura:"));


conta = (num1 + num2) * num3/2; 
JOptionPane.showMessageDialog(null,"A área do trapézio é: " + conta);

System.exit(0); 

 }
} 