package ex038;
import javax.swing.JOptionPane;
public class ex038 {

	public static void main(String args[]) {

	
		int codigoDigitado=0;
		int codigoCadastrado = 1234;
		int senhaCadastrada = 9999;
		int senhaDigitada = 0;
	
		
		
		codigoDigitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de código do usuário:"));
		senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a senha do usuário:"));
		
		

		if (codigoDigitado == codigoCadastrado) {
		    
		    if (senhaDigitada == senhaCadastrada) {
		    	JOptionPane.showMessageDialog(null,"Acesso permitido!");
		    } else {
		    	JOptionPane.showMessageDialog(null,"Senha incorreta!");
		    }
		} else {
			JOptionPane.showMessageDialog(null,"Usuário inválido!");
		}

		
		System.exit(0); 

		 }
		}  
			