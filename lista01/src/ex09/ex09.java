package ex09;
import javax.swing.JOptionPane;

public class ex09 {


public static void main(String args[]) {

int conta;
int num1 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do lado:"));


conta = num1 * num1; 
JOptionPane.showMessageDialog(null,"A área do quadrado é: " + conta);

System.exit(0); 

 }
} 