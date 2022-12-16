package ex035;
import javax.swing.JOptionPane;
public class ex035 {

	public static void main(String args[]) {

	
		float litrosVendidos=0;
		double precoAlcool = 2.90;
		double precoGasolina = 3.30;
		double valorPago = 0.0;
	
		
		
		litrosVendidos = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a quantidade de litros vendidos:"));
		String tipoCombustivel = JOptionPane.showInputDialog(null,"Informe o tipo de combustível [A] - Álcool ou [G] - Gasolina:");
		

switch (tipoCombustivel) {
  case "A":
      if (litrosVendidos <= 20) {
          valorPago = litrosVendidos * (precoAlcool * 0.97);
          JOptionPane.showMessageDialog(null,"O valor pago pelo cliente será de: R$ " + valorPago+ " reais.");
      } else {
          valorPago = litrosVendidos * (precoAlcool * 0.95);
          JOptionPane.showMessageDialog(null,"O valor pago pelo cliente será de: R$ " + valorPago + " reais.");
      }
  break;
  
  case "G":
      if (litrosVendidos <= 20) {
          valorPago = litrosVendidos * (precoGasolina * 0.96);
          JOptionPane.showMessageDialog(null,"O valor pago pelo cliente será de: R$ " + valorPago + " reais.");
      } else {
          valorPago = litrosVendidos * (precoGasolina * 0.94);
          JOptionPane.showMessageDialog(null,"O valor pago pelo cliente será de: R$ " + valorPago + " reais.");
      }
  break;

  default:
	  JOptionPane.showMessageDialog(null,"Opção inválida! Digite somente 'A' ou 'G' para escolher o tipo de combustível.");
  break;
}
		
		System.exit(0); 

		 }
		}  
			