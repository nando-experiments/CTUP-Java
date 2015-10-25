package br.com.ctup.dsj;

import java.util.Vector;

public class Principal
{
	public static void main(String[] args)
	{
		Vetor vetor = new Vetor();
		Vector<Integer> vet = new Vector<Integer>(2, 3);
		
		vet.addElement(23);
		vet.addElement(5);
		vet.addElement(4);
		vet.addElement(6);
		vet.addElement(30);
		vet.addElement(7);
		vet.addElement(10);
		
		// ------------------------------------------------------
		// Exercício 01.
		// ------------------------------------------------------
		vetor.MostraVetor(vet);
		
		// ------------------------------------------------------
		// Exercício 02.
		// ------------------------------------------------------
		vetor.MaiorElemento(vet);
		
		// ------------------------------------------------------
		// Exercício 03.
		// ------------------------------------------------------
		vetor.MenorElemento(vet);
		
		// ------------------------------------------------------
		// Exercício 04.
		// ------------------------------------------------------
		vetor.VetorInverso(vet);
		
		// ------------------------------------------------------
		// Exercício 05.
		// ------------------------------------------------------
		System.out.println("\n\n--- Exercício 05 ---");
		
		Vector<Double> e5v1 = new Vector<Double>(3);
		Vector<Double> e5v2 = new Vector<Double>(3);

		e5v1.addElement(1.5);
		e5v1.addElement(3.8);
		e5v1.addElement(4.2);
		
		e5v2.addElement(8.0);
		e5v2.addElement(9.5);
		e5v2.addElement(3.5);
		
        Vector<Double> e5VetMultp = vetor.MultiplicaVetores(e5v1, e5v2);
        
		for (int i = 0; i < e5VetMultp.size(); i++) {
			System.out.printf("%.2f", e5VetMultp.get(i));
			System.out.print(" - ");
		}
		
		// ------------------------------------------------------
		// Exercício 06.
		// ------------------------------------------------------

		Vector<Double> e6v1 = new Vector<Double>(5);
		Vector<Double> e6v2 = new Vector<Double>(5);
		
		e6v1.addElement(0.0);
		e6v1.addElement(2.0);
		e6v1.addElement(4.0);
		e6v1.addElement(6.0);
		e6v1.addElement(8.0);
		
		e6v2.addElement(1.0);
		e6v2.addElement(3.0);
		e6v2.addElement(5.0);
		e6v2.addElement(7.0);
		e6v2.addElement(9.0);
		
		vetor.ProdutoEscalar(e6v1, e6v2);
	}
}