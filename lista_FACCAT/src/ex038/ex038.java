package ex038;
import javax.swing.JOptionPane;
public class ex038 {

	public static void main(String args[]) {

	
		int codigoDigitado=0;
		int codigoCadastrado = 1234;
		int senhaCadastrada = 9999;
		int senhaDigitada = 0;
	
		
		
		codigoDigitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de c�digo do usu�rio:"));
		senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a senha do usu�rio:"));
		
		

		if (codigoDigitado == codigoCadastrado) {
		    
		    if (senhaDigitada == senhaCadastrada) {
		    	JOptionPane.showMessageDialog(null,"Acesso permitido!");
		    } else {
		    	JOptionPane.showMessageDialog(null,"Senha incorreta!");
		    }
		} else {
			JOptionPane.showMessageDialog(null,"Usu�rio inv�lido!");
		}

		
		System.exit(0); 

		 }
		}  
			