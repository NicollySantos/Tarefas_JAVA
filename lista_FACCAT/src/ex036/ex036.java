package ex036;
import javax.swing.JOptionPane;
public class ex036 {

	public static void main(String args[]) {

	
		int idadeHomem1=0;
		int idadeHomem2 = 0;
		int idadeMulher1 = 0;
		int idadeMulher2 = 0;
		int somaIdade=0;
		int produtoIdade=0;
	
		
		
		idadeHomem1 =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade do 1° homem: "));
		idadeHomem2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade do 2° homem: "));
		idadeMulher1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade da 1° mulher: "));
		idadeMulher2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade da 2° mulher: "));
		

		  if (idadeHomem1 > idadeHomem2) {
		    if (idadeMulher1 < idadeMulher2) {
		        somaIdade = idadeHomem1 + idadeMulher1;
		        produtoIdade = idadeHomem2 * idadeMulher2;
		    } else {
		        somaIdade = idadeHomem1 + idadeMulher2;
		        produtoIdade = idadeHomem2 * idadeMulher1;
		    }
		} else if (idadeHomem1 < idadeHomem2) {
		    somaIdade = idadeHomem2 + idadeMulher1;
		    produtoIdade = idadeHomem1 * idadeMulher2;
		} else {
		    somaIdade = idadeHomem2 + idadeMulher2;
		    produtoIdade = idadeHomem1 * idadeMulher1;
		}

		if (idadeHomem1 == idadeHomem2 || idadeMulher1 == idadeMulher2) {
			JOptionPane.showMessageDialog(null,"[ERRO] Digite apenas idades diferentes entre si.");
		} else {
			JOptionPane.showMessageDialog(null,"A soma entre a idade do homem mais velho e da mulher mais nova é: " + somaIdade + " anos.");
			JOptionPane.showMessageDialog(null,"O produto da idade do homem mais novo e da mulher mais velha é: " + produtoIdade + " anos.");
		}
		
		System.exit(0); 

		 }
		}  
			