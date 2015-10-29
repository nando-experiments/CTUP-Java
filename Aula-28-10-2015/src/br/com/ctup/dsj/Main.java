package br.com.ctup.dsj;

public class Main
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		People pessoa = new People();
		pessoa.setName("Fernando Moreira");
		pessoa.setIdade(26);
		pessoa.getHead().getEyeLeft().setColor("Castanho");
		pessoa.getHead().getEyeRight().setColor("Castanho");
		
		System.out.println(pessoa.getName());
		System.out.println(pessoa.look());
		System.out.println(pessoa.blink(1));
		System.out.println(pessoa.blink(2));
		System.out.println(pessoa.blink(0));
		System.out.println(pessoa.turnsAndBlink("left", 1));
	}

}
