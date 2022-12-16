package ex018;
import javax.swing.JOptionPane;

public class ex018 {


public static void main(String args[]) {

float conta;
float num1; 
float num2; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de reais para convers�o:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor da cota��o do real:"));

conta = num1 * num2;
JOptionPane.showMessageDialog(null,"O valor convertido em d�lares � : " + conta);

System.exit(0); 

 }
} 