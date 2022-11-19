package ex10;
import javax.swing.JOptionPane;

public class ex10 {


public static void main(String args[]) {

int conta;
int num1 = 0; 
int num2 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da diagonal maior:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da diagonal menor:"));


conta = (num1 * num2)/2; 
JOptionPane.showMessageDialog(null,"A área do losango é: " + conta);

System.exit(0); 

 }
} 