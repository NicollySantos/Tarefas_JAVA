package ex02;

import javax.swing.JOptionPane;

public class ex02 {

public static void main(String args[]) {

int antecessor;
int num1 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero:"));

antecessor = num1 - 1; 
JOptionPane.showMessageDialog(null,"O antecessor do n�mero �: " + antecessor);

System.exit(0); 

 }
} 