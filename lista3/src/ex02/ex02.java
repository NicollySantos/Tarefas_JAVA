package ex02;

import javax.swing.JOptionPane;

public class ex02 {

public static void main(String args[]) {

double conta;
double num1; 
double num2; 
double num3; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da largura:"));
num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do comprimento:"));
conta = num1*num2*num3;

JOptionPane.showMessageDialog(null,"O volume será: "+ conta);

System.exit(0); 

}}

