package ex019;
import javax.swing.JOptionPane;

public class ex019 {

	public static void main(String args[]) {

		double A;
		double B;
		

		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor de B: "));


	    if (A > B) {
	    	JOptionPane.showMessageDialog(null,"O maior valor é: " + A + ".");	
	    }

	    if (A < B) {
	    	JOptionPane.showMessageDialog(null,"O maior valor é: " + B + ".");	
	    }

	    else if(A == B){
	    	JOptionPane.showMessageDialog(null,"Os dois valores são iguais!");	
	    }


		System.exit(0); 

		 }
		}  