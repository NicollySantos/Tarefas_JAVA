package ex03;
import javax.swing.JOptionPane;

public class ex03 {

public static void main(String args[]) {

int soma;
int num1 = 0; 
int num2 = 0;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número:"));

soma = num1 + num2; 
JOptionPane.showMessageDialog(null,"A soma dos números é: " + soma);

System.exit(0); 
 }
} 