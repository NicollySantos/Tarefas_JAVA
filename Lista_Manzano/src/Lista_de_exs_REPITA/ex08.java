package Lista_de_exs_REPITA;

import javax.swing.Spring;

public class ex08 {




public static void main(String args[]) {


String resposta=null;
int comodo = 0, largura = 0, comprimento = 0, area=0;
int areaTotal = 0;

System.out.println("Cálculo da área total de uma residência");
do {
	System.out.println("Informe o nome do comodo:");
	System.out.println("Informe a largura do(a) " + comodo + " em (m):");
	System.out.println("Informe o comprimento do(a) " + comodo + " em (m):");
    area = largura * comprimento;
    System.out.println("A área do(a) " + comodo + " é igual a: " + area + " m²");
    System.out.println("Deseja informar outro comodo? [sim/não]");
    areaTotal += area;
} while (resposta == "sim");

System.out.println("A área total da residência é igual a: " + areaTotal + " m²");
}}

