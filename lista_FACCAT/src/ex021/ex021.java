package ex021;
import javax.swing.JOptionPane;

public class ex021 {

public static void main(String args[]) {

		double A;
		double B;
		double conta;


		A = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o horário do início da partida? "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o horário do fim da partida? "));

		 if (B > A) {
		        conta = B - A;	
		        JOptionPane.showMessageDialog(null,"A duração da partida foi de : "+ conta +" Horas");

		    }
		    else{
		        conta = (24 - A) + B;	
		        JOptionPane.showMessageDialog(null,"A duração da partida foi de : "+ conta +" Horas");    

		    }


		System.exit(0); 

		 }
		}  
