package ex05;
import javax.swing.JOptionPane;

public class ex05 {


public static void main(String args[]) {

int multi;
int num1 = 0; 
int num2 = 0;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro n�mero:"));

multi = num1 * num2; 
JOptionPane.showMessageDialog(null,"A multiplica��o dos n�meros �: " + multi);

System.exit(0); 

 }
} 