package ex017;
import javax.swing.JOptionPane;

public class ex017 {


public static void main(String args[]) {

float conta;
float num1; 
float num2; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a primeira nota:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a segunda nota:"));

conta = (num1 + num2)/2;

if (conta >= 6) {
	JOptionPane.showMessageDialog(null,"O aluno foi aprovado com a média "+conta); 
}
else{
	JOptionPane.showMessageDialog(null,"O aluno foi reprovado com a média "+conta);
}
System.exit(0); 

 }
} 