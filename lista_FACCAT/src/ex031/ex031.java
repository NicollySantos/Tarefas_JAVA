package ex031;
import javax.swing.JOptionPane;
public class ex031 {

	public static void main(String args[]) {

		double A=0;
		double B=0;
		double C=0;
		
		
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C: "));
		
		if (A > B + C || B > A + C || C > A + B) {
			JOptionPane.showMessageDialog(null,"N�o formam um tri�ngulo! | Tipo: ");
		} else if (A == B && B == C) {
			JOptionPane.showMessageDialog(null,"Formam um Tri�ngulo | Tipo: Equil�tero");
		} else if (A != B && B != C && A != C) {
			JOptionPane.showMessageDialog(null,"Formam um tri�ngulo | Tipo: Escaleno");
		} else {
			JOptionPane.showMessageDialog(null,"Formam um tri�ngulo | Tipo: Is�sceles");
		}

		System.exit(0); 

		 }
		}  
			