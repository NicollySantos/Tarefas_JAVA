package ex01;
import javax.swing.JOptionPane;

public class ex01 {


public static void main(String args[]) {

int sucessor;
int num1 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero:"));

sucessor = num1 + 1; 
JOptionPane.showMessageDialog(null,"O sucessor do n�mero �: " + sucessor);

System.exit(0); 

 }
} 
