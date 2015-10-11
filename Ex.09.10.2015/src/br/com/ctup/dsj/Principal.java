package br.com.ctup.dsj;

public class Principal {

	public static void main(String[] args) {
		// a1 = 10, n = 7, r = 3
		Pa pa = new Pa();
		pa.setA1(10);
		pa.setN(7);
		pa.setR(3);
		System.out.println(pa.resultPA());
	}

}
