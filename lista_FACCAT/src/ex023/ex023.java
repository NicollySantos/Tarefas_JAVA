package ex023;
import javax.swing.JOptionPane;

public class ex023 {


public static void main(String args[]) {

	int B; 
	Float C;  
	double peso_ideal;
	double peso_ideal2;
	
	B = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o seu gênero (1 para F e 2 para M):"));
	C = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a sua altura"));
	

    if (B == 1) {
        peso_ideal = C * 62.1 - 44.7;
        peso_ideal2 = peso_ideal * -1;
    	JOptionPane.showMessageDialog(null,"Seu peso ideal é " + peso_ideal2 + " quilos");
    }
    else{
        peso_ideal = C * 72.7 - 58;
        peso_ideal2 = peso_ideal * -1;
    	JOptionPane.showMessageDialog(null,"Seu peso ideal é " + peso_ideal2 +" quilos");

    }
System.exit(0); 

 }
} 