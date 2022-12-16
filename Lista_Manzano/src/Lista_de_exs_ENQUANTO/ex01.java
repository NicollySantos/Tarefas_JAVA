package Lista_de_exs_ENQUANTO;


import javax.swing.JOptionPane;

public class ex01 {


public static void main(String args[]) {

int numero = 0; 
int contadora = 1; 

numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));
while (contadora<=10) {
  

JOptionPane.showMessageDialog(null, (numero  + " x "+ contadora+" = "+ contadora*numero));
contadora++;

 }
}}


