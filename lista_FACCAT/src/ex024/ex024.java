package ex024;
import javax.swing.JOptionPane;

public class ex024 {

	public static void main(String args[]) {

			double A;
			double B;
			double sal_final;
			

			A = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o seu salário fixo: "));
			B = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor total das vendas deste mês: "));

			if (B > 1500) {
			      sal_final = A + A * (5/100);
			      JOptionPane.showMessageDialog(null,"Seu salário final será R$" + sal_final);
			    }
			    else{
			      sal_final = A + A * (3/100);
			      JOptionPane.showMessageDialog(null,"Seu salário final será R$" + sal_final);

			    }



			System.exit(0); 

			 }
			}  