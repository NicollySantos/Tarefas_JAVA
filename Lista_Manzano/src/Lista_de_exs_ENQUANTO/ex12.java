package Lista_de_exs_ENQUANTO;


import javax.swing.JOptionPane;

public class ex12 {


public static void main(String args[]) {


	int contadora = 1;
	int menor =0;
	int maior =0;
	int numero=0;



	while (contadora>0) {
	    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo ou para encerrar digite um negativo"));
	    
	    if (numero<0) {
	        menor = numero;
	        contadora = contadora-20;
	    }
	    else{
	        if (numero>maior) {
	            maior = numero;                
	        }
	        else{
	            menor = numero;
	        }   
	    }
	            
	}  
System.out.println("O maior e o menor valor digitado respectivamente foi: " + maior + " e " + menor);
}}
