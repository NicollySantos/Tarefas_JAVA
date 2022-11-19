package ex05;
import javax.swing.JOptionPane;

public class ex05 {


public static void main(String args[]) {

int conta;
int num1 = 0; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o grau em Celsius: "));


conta = (9*num1+160)/5; 
JOptionPane.showMessageDialog(null,"De " +num1+ " Celsius para " +conta+ " Farenheit");

System.exit(0); 

 }
} 