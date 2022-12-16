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
			JOptionPane.showMessageDialog(null,"Não formam um triângulo! | Tipo: ");
		} else if (A == B && B == C) {
			JOptionPane.showMessageDialog(null,"Formam um Triângulo | Tipo: Equilátero");
		} else if (A != B && B != C && A != C) {
			JOptionPane.showMessageDialog(null,"Formam um triângulo | Tipo: Escaleno");
		} else {
			JOptionPane.showMessageDialog(null,"Formam um triângulo | Tipo: Isósceles");
		}

		System.exit(0); 

		 }
		}  
			