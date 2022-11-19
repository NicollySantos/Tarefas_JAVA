package ex06;
import javax.swing.JOptionPane;

public class ex06 {


public static void main(String args[]) {

int divi;
int num1 = 0; 
int num2 = 0;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número:"));

divi = num1 / num2; 
JOptionPane.showMessageDialog(null,"A divisão dos números é: " + divi);

System.exit(0); 

 }
} 