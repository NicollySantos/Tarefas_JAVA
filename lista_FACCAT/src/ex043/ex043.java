package ex043;
import javax.swing.JOptionPane;
public class ex043 {

	public static void main(String args[]) {

	
		double lA = 0;
		double lB = 0;
		double lC = 0;
		double tipoTriangulo=0;
		
		
		lA = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do lado A"));
		lB = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do lado B"));
		lC = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor do lado C"));
		
		 if (lA < lB + lC && lB < lA + lC && lC < lA + lB) {
		        if (lA == lB && lB == lC) {
		        	JOptionPane.showMessageDialog(null,"Tri�ngulo Equil�tero.");
		        } else if (lA != lB && lB != lC && lC != lA) {
		        	JOptionPane.showMessageDialog(null,"Tri�ngulo Escaleno.");
		        } else {
		        	JOptionPane.showMessageDialog(null,"Tri�ngulo Is�sceles.");
		        }
		    } else {
		    	JOptionPane.showMessageDialog(null,"N�o � poss�vel formar um tri�ngulo.");
		    }
		    
		 JOptionPane.showMessageDialog(null,tipoTriangulo);
		 
		System.exit(0); 

		 }
		}  
			