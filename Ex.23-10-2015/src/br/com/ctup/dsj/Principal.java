package br.com.ctup.dsj;

import java.util.Vector;

public class Principal
{
	public static void main(String[] args) {
		Vetor v1 = new Vetor();
		Vector<Integer> vet = new Vector<Integer>(2, 3);
		
		vet.addElement(23);
		vet.addElement(5);
		vet.addElement(4);
		vet.addElement(6);
		vet.addElement(30);
		vet.addElement(7);
		vet.addElement(10);
		v1.MostraVetor(vet);

		System.out.println("");
		System.out.println("---");
		
		v1.MaiorElemento(vet);
		
		System.out.println("---");
		
		v1.MenorElemento(vet);
		
		System.out.println("---");
		
		v1.VetorInverso(vet);
	}
}