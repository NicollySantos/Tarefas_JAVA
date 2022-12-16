package ex032;
import javax.swing.JOptionPane;
public class ex032 {

	public static void main(String args[]) {

	
		double C=0;
		double D=0;
		
		
		
		String A = JOptionPane.showInputDialog(null,"Digite o nome do time de A: ");
		String B = JOptionPane.showInputDialog(null,"Digite o nome do time de B: ");
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de gols do time de A: "));
		D = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de gols do time de B: "));
		
		 if (C == D) {
			    JOptionPane.showMessageDialog(null,"Empate: " + C + " x " + D);
			} else if (C > D) {
				JOptionPane.showMessageDialog(null,"Vitória do time " + A + ": " + C + " x " + D);
			} else {
				JOptionPane.showMessageDialog(null,"Vitória do time " + B + ": " + C + " x " + D);
			}

		System.exit(0); 

		 }
		}  
			