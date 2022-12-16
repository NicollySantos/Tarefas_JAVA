package ex025;

import javax.swing.JOptionPane;
public class ex025 {



	public static void main(String args[]) {

		double A;
		double B;
		double C;
		double D;
		double saldo_at;
		

		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da conta do cliente: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o saldo: "));
		C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o débito: "));
		D = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o crédito: "));

		saldo_at = B - C + D;
		 JOptionPane.showMessageDialog(null,"O saldo atual do cliente é: " + saldo_at);

	    if (saldo_at <= 0) {
	    	 JOptionPane.showMessageDialog(null,"Saldo Ngativo");
	    }
	    else{
	    	 JOptionPane.showMessageDialog(null,"Saldo Positivo");

	    }


		System.exit(0); 

		 }
		}  
			