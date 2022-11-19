package ex04;
import javax.swing.JOptionPane;

public class ex04 {


public static void main(String args[]) {

float conta;
float num1=0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de custo de fábrica:"));


conta = num1 + (num1*28) + ((num1*45)/100);
JOptionPane.showMessageDialog(null,"O valor do custo de fábrica é: " + conta);

System.exit(0); 

 }
} 