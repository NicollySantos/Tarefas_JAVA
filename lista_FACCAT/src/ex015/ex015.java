package ex015;

import javax.swing.JOptionPane;

public class ex015 {

public static void main(String args[]) {

double A = 0; 


A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor:"));

if (A >= 0) {
	JOptionPane.showMessageDialog(null,"O valor é positivo!"); 
}
else{
	JOptionPane.showMessageDialog(null,"O valor é negativo!");
}

System.exit(0); 

 }}

