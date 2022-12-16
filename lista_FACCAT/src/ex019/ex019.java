package ex019;
import javax.swing.JOptionPane;

public class ex019 {

	public static void main(String args[]) {

		double conta;
		double A;
		double B;
		double C;

		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de B: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de C: "));


		conta = (A + A)*(B + B)*(C + C);
		JOptionPane.showMessageDialog(null,"A soma dos quadrados dos tr�s valores lidos � " +conta);

		System.exit(0); 

		 }
		}  