package ex08;
import javax.swing.JOptionPane;

public class ex08 {

public static void main(String args[]) {

		double conta;
		double A;
		double B;
		double C;
		double D;
		double conta2;


		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de B: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de C: "));
		D = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de D: "));


		conta = A * C;
		conta2 = B + D;
		JOptionPane.showMessageDialog(null,"A X C = " +conta);
		JOptionPane.showMessageDialog(null,"B + D = " +conta2);

		System.exit(0); 

		 }
		}  