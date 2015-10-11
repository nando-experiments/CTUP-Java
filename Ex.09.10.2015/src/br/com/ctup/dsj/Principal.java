package br.com.ctup.dsj;

public class Principal {

	public static void main(String[] args) {
		// a1 = 10, n = 7, r = 3
		Pa pa = new Pa();
		pa.setA1(10);
		pa.setN(7);
		pa.setR(3);
		System.out.println(pa.resultPA());
		
		Distancia dis = new Distancia();
		dis.setX1(2);
		dis.setX2(2);
		dis.setY1(3);
		dis.setY2(1);
		System.out.println(dis.getDistacia());
	}

}
