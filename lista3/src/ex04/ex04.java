package ex04;
import javax.swing.JOptionPane;

public class ex04 {


public static void main(String args[]) {

float conta;
float num1; 
float num2; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de d�lares para convers�o:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor da cota��o do d�lar:"));

conta = num1 * num2;
JOptionPane.showMessageDialog(null,"O valor convertido em reais � : " + conta);

System.exit(0); 

 }
} 