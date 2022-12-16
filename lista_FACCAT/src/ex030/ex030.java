package ex030;
import javax.swing.JOptionPane;
public class ex030 {

	public static void main(String args[]) {

		double A=0;
		double B=0;
		double C=0;
		double maior=0;
		double menor=0;
		double meio=0;
		
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C: "));
		
		 if (A == B || B == C || C == A) {
			 JOptionPane.showMessageDialog(null,"Digite apenas valores diferentes!");
			} else if (A > B && A > C) {
			    maior = A;
			    if (B < C) {
			        meio = C;
			        menor = B;
			    } else {
			        meio = B;
			        menor = C;
			    }
			    JOptionPane.showMessageDialog(null,"Ordem crescente: " + menor + ", " + meio + ", " + maior);
			} else if (B > A && B > C) {
			    maior = B;
			    if (A < C) {
			        meio = C;
			        menor = A;
			    } else {
			        meio = A;
			        menor = C;
			    }
			    JOptionPane.showMessageDialog(null,"Ordem crescente: " + menor + ", " + meio + ", " + maior);
			} else if (C > A && C > B) {
			    maior = C;
			    if (B < A) {
			        meio = A;
			        menor = B;
			    } else {
			        meio = B;
			        menor = A;
			    }
			    JOptionPane.showMessageDialog(null,"Ordem crescente: " + menor + ", " + meio + ", " + maior);
			}

		System.exit(0); 

		 }
		}  
			