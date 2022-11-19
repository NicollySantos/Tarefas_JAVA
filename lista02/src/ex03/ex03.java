package ex03;
import javax.swing.JOptionPane;

public class ex03 {

public static void main(String args[]) {

int conta;
int num1 = 0; 
int num2 = 0; 


num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu salário atual:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de reajuste:"));

conta = num1 + (num2/100) * num1;
JOptionPane.showMessageDialog(null,"O reajuste foi de R$: " + conta);

System.exit(0); 

 }
} 