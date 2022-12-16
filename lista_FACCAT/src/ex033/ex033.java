package ex033;
import javax.swing.JOptionPane;
public class ex033 {

	public static void main(String args[]) {

	
		double A=0;
		double B=0;
		
		
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B: "));
		
		if (A == B) {
			JOptionPane.showMessageDialog(null,"Os valores digitados são iguais: " + A + " = " + B);
		} else if (A > B) {
			JOptionPane.showMessageDialog(null,"O primeiro valor digitado é o maior: " + A + " > " + B);
		} else {
			JOptionPane.showMessageDialog(null,"O segundo valor digitado é o maior: " + B + " > " + A);
		}

		System.exit(0); 

		 }
		}  
			