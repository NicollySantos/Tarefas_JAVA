package ex01;
import javax.swing.JOptionPane;

public class ex01 {


public static void main(String args[]) {

int conta;
int num1 = 0; 
int num2 = 0; 
int num3 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos anos voc� tem:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos meses voc� tem:"));
num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos dias voc� tem:"));

conta = (num1*365)+(num2*30)+num3;
JOptionPane.showMessageDialog(null,"Voc� tem " + conta + " dias de vida.");

System.exit(0); 

 }
} 
