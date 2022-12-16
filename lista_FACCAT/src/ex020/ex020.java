package ex020;
import javax.swing.JOptionPane;

public class ex020 {
	public static void main(String args[]) {

		double conta;
		double A;
		double B;
		double C;

		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de B: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de C: "));


		conta = (A + B + C)*(A + B + C);
		JOptionPane.showMessageDialog(null,"O quadrado da soma dos tr�s valores lidos � " +conta);

		System.exit(0); 

		 }
		}  