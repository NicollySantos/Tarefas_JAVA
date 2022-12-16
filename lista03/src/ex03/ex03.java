package ex03;
import javax.swing.JOptionPane;

public class ex03 {

public static void main(String args[]) {

int conta;
int num1 = 0; 
int num2 = 0; 


num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B:"));

conta = (num1 - num2)*(num1 - num2);
JOptionPane.showMessageDialog(null,"O resultado foi de: " + conta);

System.exit(0); 

 }
} 