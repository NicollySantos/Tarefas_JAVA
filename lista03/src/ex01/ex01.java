package ex01;
import javax.swing.JOptionPane;

public class ex01 {


public static void main(String args[]) {

int A = 0; 
int B = 0; 
int C = 0; 
int D = 0; 

A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C:"));
D = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de D:"));



JOptionPane.showMessageDialog(null,"A primeira adi��o ser� A+B: "+ (A+B));
JOptionPane.showMessageDialog(null,"A segunda adi��o ser� A+C: "+ (A+C));
JOptionPane.showMessageDialog(null,"A terceira adi��o ser� A+D: "+ (A+D));
JOptionPane.showMessageDialog(null,"A quarta adi��o ser� B+C: "+ (B+C));
JOptionPane.showMessageDialog(null,"A quinta adi��o ser� B+D: "+ (B+D));
JOptionPane.showMessageDialog(null,"A sexta adi��o ser� C+D: "+(C+D));
JOptionPane.showMessageDialog(null,"A primeira multiplica��o ser� A X B: "+ A*B);
JOptionPane.showMessageDialog(null,"A segunda multiplica��o ser� A X C: "+ A*C);
JOptionPane.showMessageDialog(null,"A terceira multiplica��o ser� A X D: "+ A*D);
JOptionPane.showMessageDialog(null,"A quarta multiplica��o ser� B X C: "+ B*C);
JOptionPane.showMessageDialog(null,"A quinta multiplica��o ser� B X D: "+ B*D);
JOptionPane.showMessageDialog(null,"A sexta multiplica��o ser� C X D: "+ C*D);


System.exit(0); 

 }
} 
