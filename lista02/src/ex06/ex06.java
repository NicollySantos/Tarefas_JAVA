package ex06;
import javax.swing.JOptionPane;

public class ex06 {


public static void main(String args[]) {

	double conta;
	double num1; 

	num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o grau em Farenheit: "));


	conta = (num1-32)*5/9;
	JOptionPane.showMessageDialog(null,"De " +num1+ " Farenheit para " +conta+ " Celsius");

	System.exit(0); 

	 }
	}  