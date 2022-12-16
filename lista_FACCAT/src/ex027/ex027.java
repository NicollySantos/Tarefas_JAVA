package ex027;
import javax.swing.JOptionPane;
public class ex027 {

	public static void main(String args[]) {

		double A;
		
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A: "));
		
if (A >= 0 ) {
	JOptionPane.showMessageDialog(null,"Seu valor é positivo");
    if (A == 0){
    	JOptionPane.showMessageDialog(null,"Seu valor é igual a zero");
    }
  }
  else{
	  JOptionPane.showMessageDialog(null,"Seu valor é negativo");
  }


		System.exit(0); 

		 }
		}  
			