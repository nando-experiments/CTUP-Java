package br.com.ctup.dsj;

//import java.util.ArrayList;
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
		System.out.println("--- Exercício 01 ---");
		vetor.MostraVetor(vet);
		System.out.println("\n");
		
		// ------------------------------------------------------
		// Exercício 02.
		// ------------------------------------------------------
		System.out.println("--- Exercício 02 ---");
		int maior = vetor.MaiorElemento(vet);
		System.out.println("O maior número do vetor é: " + maior);
		
		// ------------------------------------------------------
		// Exercício 03.
		// ------------------------------------------------------
		System.out.println("\n--- Exercício 03 ---");
		int menor = vetor.MenorElemento(vet);
		System.out.println("O menor número do vetor é: " + menor);
		
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
		
		// ------------------------------------------------------
		// Exercício 07.
		// ------------------------------------------------------
		System.out.println("\n--- Exercício 07 ---");
		Vector<Integer> e7vet = new Vector<Integer>(12);
		
		e7vet.addElement(0);
		e7vet.addElement(5);
		e7vet.addElement(8);
		e7vet.addElement(1);
		e7vet.addElement(-6);
		e7vet.addElement(4);
		e7vet.addElement(-7);
		e7vet.addElement(9);
		e7vet.addElement(10);
		e7vet.addElement(-14);
		e7vet.addElement(3);
		e7vet.addElement(12);
		
		System.out.println(vetor.ProdutorioDeElementos(e7vet));

		// ------------------------------------------------------
		// Exercício 08.
		// ------------------------------------------------------
		double [] e8vet = { 1.2, 9.1, 12.7, 5.0, 7.2, 2.7 };
		vetor.OrdemaMaior(e8vet);

		// ------------------------------------------------------
		// Exercício 09.
		// ------------------------------------------------------
		vetor.VetorDeFibonacci(8);

		// ------------------------------------------------------
		// Exercício 10.
		// ------------------------------------------------------
		System.out.println("\n\n--- Exercício 10 ---");
		Vector<Integer> e10VetA = new Vector<Integer>();
		
		e10VetA.addElement(1);
		e10VetA.addElement(6);
		e10VetA.addElement(0);
		e10VetA.addElement(2);
		e10VetA.addElement(8);
		e10VetA.addElement(9);
		e10VetA.addElement(5);
		
		Vector<Integer> e10VetB = vetor.VetorBdeA(e10VetA);
		
		for (int i = 0; i < e10VetB.size(); i++) {
			System.out.print(e10VetB.get(i) + " ");
		}

		// ------------------------------------------------------
		// Exercício 11.
		// ------------------------------------------------------
		System.out.println("\n\n--- Exercício 11 ---");
		Vector<Integer> e11VetA = new Vector<Integer>();
		Vector<Integer> e11VetB = new Vector<Integer>();
		
		e11VetA.addElement(1);
		e11VetA.addElement(2);
		e11VetA.addElement(3);
		e11VetA.addElement(4);
		e11VetA.addElement(5);

		e11VetB.addElement(6);
		e11VetB.addElement(7);
		e11VetB.addElement(8);
		e11VetB.addElement(9);
		e11VetB.addElement(10);
		
		Vector<Integer> e10VetC = vetor.MesclaVetores(e11VetA, e11VetB);
		
		for (int i = 0; i < e10VetC.size(); i++) {
			System.out.print(e10VetC.get(i) + " ");
		}
	}
}