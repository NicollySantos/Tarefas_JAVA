package ex018;
import javax.swing.JOptionPane;

public class ex018 {


public static void main(String args[]) {

float conta;
float num1; 
float num2; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano atual:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano do seu nascimento:"));

conta = num1 - num2;
if (conta >= 16) {
	JOptionPane.showMessageDialog(null,"Você vai poder votar");
	JOptionPane.showMessageDialog(null,"Você tem "+ conta+ " anos de idade");
}
else{
	JOptionPane.showMessageDialog(null,"Não poderá votar");
	JOptionPane.showMessageDialog(null,"Você tem "+ conta+ " anos de idade");
}

System.exit(0); 

 }
} 