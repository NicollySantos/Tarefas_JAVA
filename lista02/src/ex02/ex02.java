package ex02;

import javax.swing.JOptionPane;

public class ex02 {

public static void main(String args[]) {

double num1; 
double num2; 
double num3; 
double num4; 

num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de eleitores:"));
num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de votos v�lidos:"));
num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de votos brancos:"));
num4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de votos nulos:"));

if (num3<0){
	JOptionPane.showMessageDialog(null,"O valor do voto branco � incompat�vel");
}
else{
	JOptionPane.showMessageDialog(null,"O total de votos brancos � : "+num3);
	JOptionPane.showMessageDialog(null,"Porcentagem de Votos Brancos: " +num3/num1*100+"%");
}

if(num2<0){
	JOptionPane.showMessageDialog(null,"O valor de votos v�lidos � incompat�vel");
}
else{
	JOptionPane.showMessageDialog(null,"O total de votos v�lidos � : "+num2);
	JOptionPane.showMessageDialog(null,"Porcentagem de Votos V�lidos: " +num2/num1*100+"%");
}

if(num4<0){
	JOptionPane.showMessageDialog(null,"O valor de votos nulos � incompat�vel");
}
else{
	JOptionPane.showMessageDialog(null,"O total de votos nulos � : "+num4);
	JOptionPane.showMessageDialog(null,"Porcentagem de Votos Nulos: " +num4/num1*100+"%");
}

if (num1<0){
	JOptionPane.showMessageDialog(null,"Valor inv�lido");
}
else{
	JOptionPane.showMessageDialog(null,"O n�mero de leitores � "+num1);

}}




 }
