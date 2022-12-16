package ex09;
import javax.swing.JOptionPane;

public class ex09 {


public static void main(String args[]) {

double conta;
double num1 = 0; 
double num2 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o salário mensal (R$):"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o percentual de reajuste (em %):"));


conta = num1 + (num2/100) * num1;
JOptionPane.showMessageDialog(null,"O novo salário é: " + conta);

System.exit(0); 

 }
} 