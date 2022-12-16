package ex042;
import javax.swing.JOptionPane;
public class ex042 {

	public static void main(String args[]) {

	
		int codigo=0;
		int anoNascimento = 0;
		int anoIngresso = 0;
		int aposentadoria=0;
		int idade=0;
		int anosTrabalhado=0;
		codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o seu código:"));
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o seu ano de nascimento:"));
		anoIngresso = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano de ingresso:"));

	
	    
	    idade = 2022 - anoNascimento;
	    anosTrabalhado = 2022 - anoIngresso;
	    if (idade >= 65) {
	    	JOptionPane.showMessageDialog(null,"Requerer aposentadoria");
	    } else if (anosTrabalhado >= 30) {
	    	JOptionPane.showMessageDialog(null,"Requerer aposentadoria");
	    } else {
	    	JOptionPane.showMessageDialog(null,"Não requerer aposentadoria");
	    }
	    
	    JOptionPane.showMessageDialog(null,"Empregado código: " + codigo + " | Idade: " + idade + " anos.");
	    JOptionPane.showMessageDialog(null,"Tempo trabalhado: " + anosTrabalhado + " anos.");
	    JOptionPane.showMessageDialog(null,"Situação: " + aposentadoria);
		
		System.exit(0); 

		 }
		}  
			