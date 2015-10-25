package br.com.ctup.dsj;

import java.util.Vector;

public class Principal
{
	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		Vector<Integer> vet = new Vector<Integer>(2, 3);
		
		vet.addElement(23);
		vet.addElement(5);
		vet.addElement(4);
		vet.addElement(6);
		vet.addElement(30);
		vet.addElement(7);
		vet.addElement(10);
		
		// Exercício 01.
		vetor.MostraVetor(vet);
		
		// Exercício 02.
		vetor.MaiorElemento(vet);
		
		// Exercício 03.
		vetor.MenorElemento(vet);
		
		// Exercício 04.	
		vetor.VetorInverso(vet);

		// Exercício 05.
		System.out.println("\n\n--- Exercício 05 ---");
		
		Vector<Double> v1 = new Vector<Double>(5);
		Vector<Double> v2 = new Vector<Double>(5);

		v1.addElement(3.1);
		v1.addElement(2.2);
		v1.addElement(4.3);
		v1.addElement(6.4);
		
		v2.addElement(1.2);
		v2.addElement(7.2);
		v2.addElement(4.3);
		v2.addElement(2.7);
		
        Vector<Double> vetMultiplicado = vetor.MultiplicaVetores(v1, v2);
        
		for (int i = 0; i < vetMultiplicado.size(); i++) {
			System.out.printf("%.2f", vetMultiplicado.get(i));
			System.out.print(" - ");
		}
	}
}