package br.com.ctup.dsj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carroVW = new Carro();
		carroVW.setMarca("VW");
		System.out.println(carroVW.getMarca());
		System.out.println(carroVW.getQttPortas());

		Carro carroGM = new Carro();
		carroGM.setMarca("GM");
		carroGM.setQttPortas(4);
		System.out.println(carroGM.getMarca());
		System.out.println(carroGM.getQttPortas());
	}

}
