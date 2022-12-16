package ex040;
import javax.swing.JOptionPane;
public class ex040 {

	public static void main(String args[]) {

	
		int quantidade=0;
		float precoUnitario = 0;
		double total = 0.0;
		double totalApagar = 0.0;
		double desconto = 0.0;
		String nome = JOptionPane.showInputDialog(null,"Informe o nome do produto:");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade adquirida:"));
		precoUnitario = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o preço unitário:"));


		   
		    total = quantidade * precoUnitario;
		    if (quantidade <= 5) {
		        totalApagar = total * 0.98;
		        desconto = total - totalApagar;
		    } else if (quantidade > 5 && quantidade <= 10) {
		        totalApagar = total * 0.97;
		        desconto = total - totalApagar;
		    } else {
		        totalApagar = total * 0.95;
		        desconto = total - totalApagar;
		    }
		    
		    JOptionPane.showMessageDialog(null,"Produto: " + nome + ", o total foi de: R$ " + total+ " reais.");
		    JOptionPane.showMessageDialog(null,"Produto: " + nome + ", o valor de desconto foi de: R$ " + desconto + " reais.");
		    JOptionPane.showMessageDialog(null,"Produto: " + nome + ", o valor total a pagar é: R$ " + totalApagar + " reais.");
		
		System.exit(0); 

		 }
		}  
			