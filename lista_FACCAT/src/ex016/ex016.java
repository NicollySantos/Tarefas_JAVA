package ex016;
import javax.swing.JOptionPane;

public class ex016 {

public static void main(String args[]) {

double A = 0; 
double conta;

A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor:"));

if (A > 12) {
	JOptionPane.showMessageDialog(null,"O custo é de R$ "+A); 
}
else{
	conta = A * 1.30;
	JOptionPane.showMessageDialog(null,"O custo é de R$ "+conta);
}

System.exit(0); 

 }}