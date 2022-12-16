package ex028;
import javax.swing.JOptionPane;
public class ex028 {

	public static void main(String args[]) {

		double A=0;
		double B=0;
		double C=0;
		
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C: "));
		

		if (A == B || B == C || C == A) {
			JOptionPane.showMessageDialog(null,"Digite apenas valores diferentes!");
		} else if (A > B && A > C) {
			JOptionPane.showMessageDialog(null,"O maior valor digitado foi " + A);
		} else if (B > A && B > C) {
			JOptionPane.showMessageDialog(null,"O maior valor digitado foi " + B);
		} else {
			JOptionPane.showMessageDialog(null,"O maior valor digitado foi " + C);
		}


		System.exit(0); 

		 }
		}  
			