package br.com.ctup.dsj;

import java.util.Vector;

public class Vetor
{
	public void MostraVetor(Vector<Integer> vet) {
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
	
	public void MaiorElemento(Vector<Integer> vet) {
		System.out.println("--- Exercício 02 ---");
		
		int maior = 0;
		int num = 0;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior número do vetor é: " + maior);
	}
	
	public void MenorElemento(Vector<Integer> vet) {
		System.out.println("\n--- Exercício 03 ---");
		
		int menor = vet.get(0);
		int num   = 0;
		
		for (int i = 0; i < vet.size(); i++) {
			num = vet.get(i);
			
			if (menor > num) {
				menor = num;
			}
		}
		
		System.out.println("O menor número do vetor é: " + menor);
	}
	
	public void VetorInverso(Vector<Integer> vet) {
		System.out.println("\n--- Exercício 04 ---");
		
		for (int i = (vet.size()-1); i >= 0; i--) {
			System.out.print(vet.get(i));
		    
		    if(i != 0) {
		    	System.out.print(", ");
		    }
		}
	}
	
	public Vector<Double> MultiplicaVetores(Vector<Double> v1, Vector<Double> v2) {
		Vector<Double> vet = new Vector<Double>(v1.size());
		
		for (int i = 0; i < v1.size(); i++) {
			vet.addElement(v1.get(i) * v2.get(i));
		}
		
		return vet;
	}

}
