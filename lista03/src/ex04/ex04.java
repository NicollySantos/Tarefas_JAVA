package ex04;
import javax.swing.JOptionPane;

public class ex04 {


public static void main(String args[]) {

float conta;
float num1; 
float num2; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de dólares para conversão:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor da cotação do dólar:"));

conta = num1 * num2;
JOptionPane.showMessageDialog(null,"O valor convertido em reais é : " + conta);

System.exit(0); 

 }
} 