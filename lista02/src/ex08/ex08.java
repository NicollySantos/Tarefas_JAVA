package ex08;
import javax.swing.JOptionPane;

public class ex08 {

public static void main(String args[]) {

	double conta;
	double num1; 
	double num2;
	double conta2;

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o tempo gasto (horas) na viagem:"));

num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a velocidade média:"));

conta = num1 * num2; 
JOptionPane.showMessageDialog(null,"A distância percorrida foi de: " + conta);
conta2 = (num1*num2)/12;
JOptionPane.showMessageDialog(null,"O consumo foi de: " + conta2);

System.exit(0); 

 }
} 