package br.com.ctup.dsj;

import java.util.Vector;

public class Vetor
{
	public void MostraVetor(Vector<Integer> vet) {
		int count = 0;
		
		for (int i = 0; i < vet.size(); i++) {
		    System.out.print(vet.get(i));
		    
		    count = i + 1;
		    if(count < vet.size()) {
		    	System.out.print(", ");
		    }
		}
	}
	
	public void MaiorElemento(Vector<Integer> vet) {
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
		for (int i = (vet.size()-1); i >= 0; i--) {
			System.out.print(vet.get(i));
		    
		    if(i != 0) {
		    	System.out.print(", ");
		    }
		}
	}

}
