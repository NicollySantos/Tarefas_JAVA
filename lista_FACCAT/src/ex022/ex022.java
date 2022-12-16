package ex022;
import javax.swing.JOptionPane;

public class ex022 {


public static void main(String args[]) {

double conta;
double A = 0; 
double B = 0; 

A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de horas trabalhas no mês :"));
B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor recebido por horas trabalhadas :"));


if (A < 160) {
    var salarioFinal = A * B;
    JOptionPane.showMessageDialog(null,"O salário final corresponde a : R$ "+salarioFinal);

}
else{
 var horaExtra = A - 160;
 var salarioHoraExtra = (((horaExtra*B*50/100)+B)*horaExtra);
 var salarioFinal = salarioHoraExtra+(160*B);
 JOptionPane.showMessageDialog(null,"O salário final corresponde a : R$ " + salarioFinal);

}
System.exit(0); 

 }
} 