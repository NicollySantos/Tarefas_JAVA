package ex034;
import javax.swing.JOptionPane;
public class ex034 {

	public static void main(String args[]) {

	
		double valorX=0;
		double valorZ=0;
		double valorY=0;
		double resposta = 0;
		
		
		valorX = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de X: "));
		valorY = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de Y: "));
		
		valorZ = valorX * valorY + 5;
		if (valorZ < 0) {
			JOptionPane.showMessageDialog(null," é menor do que 0! Resposta A");
		} else if (valorZ < 100){
			JOptionPane.showMessageDialog(null," é menor do que 100! Resposta B");
		} else {
			JOptionPane.showMessageDialog(null," é maior do 100! Resposta C");
		}
		
		JOptionPane.showMessageDialog(null,valorZ + resposta);

		System.exit(0); 

		 }
		}  
			