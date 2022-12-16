package ex026;

import javax.swing.JOptionPane;
public class ex026 {



	public static void main(String args[]) {

		double A;
		double B;
		double C;
		double media;
		

		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade no estoque atualmente: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade máxima do estoque: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade mínima do estoque: "));

		media = (B + C)/2;
		JOptionPane.showMessageDialog(null,"A quantidade média do estoque é: "+ media);
	   
	    if (A >= media) {
	    	JOptionPane.showMessageDialog(null,"Não efetuar compra");
	    }
	    else{
	    	JOptionPane.showMessageDialog(null,"Efetuar compra");

	    }


		System.exit(0); 

		 }
		}  
			