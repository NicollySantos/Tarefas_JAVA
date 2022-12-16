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



JOptionPane.showMessageDialog(null,"A primeira adição será A+B: "+ (A+B));
JOptionPane.showMessageDialog(null,"A segunda adição será A+C: "+ (A+C));
JOptionPane.showMessageDialog(null,"A terceira adição será A+D: "+ (A+D));
JOptionPane.showMessageDialog(null,"A quarta adição será B+C: "+ (B+C));
JOptionPane.showMessageDialog(null,"A quinta adição será B+D: "+ (B+D));
JOptionPane.showMessageDialog(null,"A sexta adição será C+D: "+(C+D));
JOptionPane.showMessageDialog(null,"A primeira multiplicação será A X B: "+ A*B);
JOptionPane.showMessageDialog(null,"A segunda multiplicação será A X C: "+ A*C);
JOptionPane.showMessageDialog(null,"A terceira multiplicação será A X D: "+ A*D);
JOptionPane.showMessageDialog(null,"A quarta multiplicação será B X C: "+ B*C);
JOptionPane.showMessageDialog(null,"A quinta multiplicação será B X D: "+ B*D);
JOptionPane.showMessageDialog(null,"A sexta multiplicação será C X D: "+ C*D);


System.exit(0); 

 }
} 
