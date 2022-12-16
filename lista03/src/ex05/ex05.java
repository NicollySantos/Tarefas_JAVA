package ex05;
import javax.swing.JOptionPane;

public class ex05 {


public static void main(String args[]) {

float conta;
float num1; 
float num2; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de reais para conversão:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor da cotação do real:"));

conta = num1 * num2;
JOptionPane.showMessageDialog(null,"O valor convertido em dólares é : " + conta);

System.exit(0); 

 }
} 