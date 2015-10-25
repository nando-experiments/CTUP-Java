package br.com.ctup.dsj;

import java.util.Vector;

public class Vetor
{
	/*
	// Exercício 01.
	*/
	public void MostraVetor(Vector<Integer> vet)
	{
		int count = 0;
		System.out.println("--- Exercício 01 ---");
		
		for (int i = 0; i < vet.size(); i++) {
		    System.out.print(vet.get(i));
		    
		    count = i + 1;
		    if(count < vet.size()) {
		    	System.out.print(", ");
		    }
		}
		System.out.println("\n");
	}

	/*
	// Exercício 02.
	*/
	public void MaiorElemento(Vector<Integer> vet)
	{
		System.out.println("--- Exercício 02 ---");
		
		int maior = 0, num = 0;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior número do vetor é: " + maior);
	}

	/*
	// Exercício 03.
	*/
	public void MenorElemento(Vector<Integer> vet)
	{
		System.out.println("\n--- Exercício 03 ---");
		
		int menor = vet.get(0), num = 0;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if (menor > num) {
				menor = num;
			}
		}
		
		System.out.println("O menor número do vetor é: " + menor);
	}

	/*
	// Exercício 04.
	*/
	public void VetorInverso(Vector<Integer> vet)
	{
		System.out.println("\n--- Exercício 04 ---");
		
		for (int i = (vet.size()-1); i >= 0; i--) {
			System.out.print(vet.get(i));
		    
		    if(i != 0) {
		    	System.out.print(", ");
		    }
		}
	}

	/*
	// Exercício 05.
	*/
	public Vector<Double> MultiplicaVetores(Vector<Double> v1, Vector<Double> v2)
	{
		Vector<Double> vet = new Vector<Double>(v1.size());
		
		for (int i = 0; i < v1.size(); i++) {
			vet.addElement(v1.get(i) * v2.get(i));
		}
		
		return vet;
	}

	/*
	// Exercício 06.
	*/
	public void ProdutoEscalar(Vector<Double> v1, Vector<Double> v2)
	{
		System.out.println("\n\n--- Exercício 06 ---");
		
		Double produtoEscalar = 0.0;
        Vector<Double> vetMultiplicado = this.MultiplicaVetores(v1, v2);
        
		for (int i = 0; i < vetMultiplicado.size(); i++) {
			produtoEscalar += vetMultiplicado.get(i);
		}
		
		System.out.println("Produto escalar de v1 e v2 é: " + produtoEscalar);
	}

	/*
	// Exercício 07.
	*/
	public Integer ProdutorioDeElementos(Vector<Integer> vet)
	{
		int num = 0, produtorio = 1;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if (num > 0 && num%2 == 0) {
				produtorio *= num;
			}
		}
		
		return produtorio;
	}

	/*
	// Exercício 07.
	*/
	public void OrdemaMaior(double[] vet)
	{
		System.out.println("\n--- Exercício 08 ---");
		double aux;
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] < vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

}
