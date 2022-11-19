package ex10;
import javax.swing.JOptionPane;

public class ex10 {


public static void main(String args[]) {

int num1; 
int num2; 
int troca;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B:"));


troca = num1;
num1 = num2;
num2 = troca;
JOptionPane.showMessageDialog(null,"O novo valor de A é: " + num1);
JOptionPane.showMessageDialog(null,"O novo valor de B é: " + num2);

System.exit(0); 

 }
} 