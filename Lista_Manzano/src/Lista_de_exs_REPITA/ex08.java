package Lista_de_exs_REPITA;

import javax.swing.Spring;

public class ex08 {




public static void main(String args[]) {


String resposta=null;
int comodo = 0, largura = 0, comprimento = 0, area=0;
int areaTotal = 0;

System.out.println("C�lculo da �rea total de uma resid�ncia");
do {
	System.out.println("Informe o nome do comodo:");
	System.out.println("Informe a largura do(a) " + comodo + " em (m):");
	System.out.println("Informe o comprimento do(a) " + comodo + " em (m):");
    area = largura * comprimento;
    System.out.println("A �rea do(a) " + comodo + " � igual a: " + area + " m�");
    System.out.println("Deseja informar outro comodo? [sim/n�o]");
    areaTotal += area;
} while (resposta == "sim");

System.out.println("A �rea total da resid�ncia � igual a: " + areaTotal + " m�");
}}

