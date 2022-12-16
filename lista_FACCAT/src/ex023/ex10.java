package ex023;
import javax.swing.JOptionPane;

public class ex10 {


public static void main(String args[]) {

	float A; 
	float B; 
	float C; 
	float nulo; 
	float branco;
	float total;
	
	A = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os votos do candidato A :"));
	B = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os votos do candidato B :"));
	C = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os votos do candidato C :"));
	nulo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os votos nulos: "));
	branco = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe os votos brancos: "));


	total = A+B+C+nulo+branco;
	JOptionPane.showMessageDialog(null,"O total de eleitores �: "+ total);
	JOptionPane.showMessageDialog(null,"Votos de A : " + (A/total)*100+ " %");
	JOptionPane.showMessageDialog(null,"Votos de B : " + (B/total)*100+ " %");
	JOptionPane.showMessageDialog(null,"Votos de C : " + (C/total)*100+ " %");
	JOptionPane.showMessageDialog(null,"Votos nulos : " + (nulo/total)*100+ " %");
	JOptionPane.showMessageDialog(null,"Votos brancos : " + (branco/total)*100+ " %");

System.exit(0); 

 }
} 