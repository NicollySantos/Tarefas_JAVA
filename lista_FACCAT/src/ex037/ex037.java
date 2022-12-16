package ex037;
import javax.swing.JOptionPane;
public class ex037 {

	public static void main(String args[]) {

	
		float Macas=0;
		float Morango=0;
		double valorTotalMorango=0;
		double valorTotalMacas=0;
		double valorTotalCompra=0;
		float TotalCompra=0;
		
		Macas = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe quantos kg há de maçãs:"));
		Morango = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe quantos kg há de morangos:"));
				
		
		if (Morango < 6) {
		    valorTotalMorango = Morango * 2.5;
		} else {
		    valorTotalMorango = Morango * 2.2;
		}
		
		if (Macas < 6) {
		    valorTotalMacas = Macas * 1.8;
		} else {
		  valorTotalMacas = Macas * 1.5;  
		}
		
		 TotalCompra = Morango + Macas;
		 valorTotalCompra = valorTotalMorango + valorTotalMacas;
		
		if (TotalCompra > 25 || valorTotalCompra > 8) {
		    valorTotalCompra *= 0.9;
		    JOptionPane.showMessageDialog(null,"O valor total da compra foi igual a: R$ " + valorTotalCompra + " reais.");
		} else {
			JOptionPane.showMessageDialog(null,"O valor total da compra foi igual a: R$ " + valorTotalCompra + " reais.");
		}
  		
		System.exit(0); 

		 }
		}  
			