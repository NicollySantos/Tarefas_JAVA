package ex02;

import javax.swing.JOptionPane;

public class ex02 {

public static void main(String args[]) {

double num1; 
double num2; 
double num3; 
double num4; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de eleitores:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de votos válidos:"));
num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de votos brancos:"));
num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de votos nulos:"));

if (num3<0){
	JOptionPane.showMessageDialog(null,"O valor do voto branco é incompatível");
}
else{
	JOptionPane.showMessageDialog(null,"O total de votos brancos é : "+num3);
	JOptionPane.showMessageDialog(null,"Porcentagem de Votos Brancos: " +num3/num1*100+"%");
}

if(num2<0){
	JOptionPane.showMessageDialog(null,"O valor de votos válidos é incompatível");
}
else{
	JOptionPane.showMessageDialog(null,"O total de votos válidos é : "+num2);
	JOptionPane.showMessageDialog(null,"Porcentagem de Votos Válidos: " +num2/num1*100+"%");
}

if(num4<0){
	JOptionPane.showMessageDialog(null,"O valor de votos nulos é incompatível");
}
else{
	JOptionPane.showMessageDialog(null,"O total de votos nulos é : "+num4);
	JOptionPane.showMessageDialog(null,"Porcentagem de Votos Nulos: " +num4/num1*100+"%");
}

if (num1<0){
	JOptionPane.showMessageDialog(null,"Valor inválido");
}
else{
	JOptionPane.showMessageDialog(null,"O número de leitores é "+num1);

}}




 }
