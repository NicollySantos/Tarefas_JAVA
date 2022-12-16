package ex041;
import javax.swing.JOptionPane;
public class ex041 {

	public static void main(String args[]) {

	
		float nota1=0;
		float nota2 = 0;
		float nota3 = 0;
		float nota4 = 0;
		double mediaAproveitamento=0;
		mediaAproveitamento = ((nota1 + nota2) * 2 + nota3 * 3 + nota4) / 7;
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a 1° nota:"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a 2° nota:"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a 3° nota:"));
		nota4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a 4° nota:"));
		
		
		if (mediaAproveitamento >= 9) {
			JOptionPane.showMessageDialog(null,"Média de aproveitamento: " + mediaAproveitamento + " | Conceito do Aluno: A");
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			JOptionPane.showMessageDialog(null,"Média de aproveitamento: " + mediaAproveitamento + " | Conceito do Aluno: B");
		} else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			JOptionPane.showMessageDialog(null,"Média de aproveitamento: " + mediaAproveitamento + " | Conceito do Aluno: C");
		} else {
			JOptionPane.showMessageDialog(null,"Média de aproveitamento: " + mediaAproveitamento + " | Conceito do Aluno: D");
		}
		
		System.exit(0); 

		 }
		}  
			