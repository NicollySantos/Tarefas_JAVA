package ex09;
import javax.swing.JOptionPane;

public class ex09 {


public static void main(String args[]) {

double conta;
double num1 = 0; 
double num2 = 0; 
double num3 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe valor da prestação: R$ "));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a taxa de juros (em %):"));
num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o tempo de atraso (em dias):"));


conta = num1 + (num1 * (num2/100) * num3); 
JOptionPane.showMessageDialog(null,"A prestação a pagar é:: " + conta);

System.exit(0); 

 }
} 