package ex06;
import javax.swing.JOptionPane;

public class ex06 {


public static void main(String args[]) {

int divi;
int num1 = 0; 
int num2 = 0;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro n�mero:"));

divi = num1 / num2; 
JOptionPane.showMessageDialog(null,"A divis�o dos n�meros �: " + divi);

System.exit(0); 

 }
} 