package br.com.ctup.dsj;

import java.util.Vector;

public class Helpers
{
	static long fibo(int n)
	{
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public Integer SomaValoresVetor(Vector<Integer> vet)
	{
		int soma = 0;
		
		for (int i = 0; i < vet.size(); i++) {
			soma += vet.get(i);
		}
		
		return soma;
	}

	public Integer MediaValoresVetor(Vector<Integer> vet)
	{
		int media = 0;
		media = this.SomaValoresVetor(vet) / vet.size();
		return media;
	}
}
