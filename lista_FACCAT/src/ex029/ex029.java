package ex029;
import javax.swing.JOptionPane;
public class ex029 {

	public static void main(String args[]) {

		double A=0;
		double B=0;
		double C=0;
		double result1=0;
		double result2=0;
		double result3=0;
		
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C: "));
		

		result1 = A + B;
		result2 = C + B;
		result3 = A + C;
		  if (A == B || B == C || C == A) {
			 JOptionPane.showMessageDialog(null,"Digite apenas valores diferentes!");
		} else if (A > B) {
			JOptionPane.showMessageDialog(null,"Os maiores valores digitados foram A(" + A + ") e B(" +B+") = " +result1);
		} else if (B > A) {
			JOptionPane.showMessageDialog(null,"Os maiores valores digitados foram B(" + B + ") e A(" +A+") = " +result1);
		} else if (C > B){
			JOptionPane.showMessageDialog(null,"Os maiores valores digitados foram C(" + C + ") e B(" +B+") = " +result2);
		}else if (B > C){
			JOptionPane.showMessageDialog(null,"Os maiores valores digitados foram B(" + B + ") e C(" +C+") = " +result2);
		}else if (C > A){
			JOptionPane.showMessageDialog(null,"Os maiores valores digitados foram C(" + C + ") e A(" +A+") = " +result3);
		}else if (C > B){
			JOptionPane.showMessageDialog(null,"Os maiores valores digitados foram C(" + C + ") e B(" +B+") = " +result3);
		}else{
			JOptionPane.showMessageDialog(null,"Nenhum valor válido!");
		}


		System.exit(0); 

		 }
		}  
			