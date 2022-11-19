package ex01;
import javax.swing.JOptionPane;

public class ex01 {


public static void main(String args[]) {

int sucessor;
int num1 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));

sucessor = num1 + 1; 
JOptionPane.showMessageDialog(null,"O sucessor do número é: " + sucessor);

System.exit(0); 

 }
} 
