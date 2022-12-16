package ex014;
import javax.swing.JOptionPane;

public class ex014 {


public static void main(String args[]) {

double A = 0; 


A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor:"));

if (A > 10) {
	JOptionPane.showMessageDialog(null,"O valor é maior que 10!"); 
}
else{
	JOptionPane.showMessageDialog(null,"O valor é menor que 10!");
}

System.exit(0); 

 }
} 
