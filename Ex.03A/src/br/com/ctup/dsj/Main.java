package br.com.ctup.dsj;

public class Main
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		People people = new People();
		people.setAltura(1.80);
		people.setSexo("M");

		System.out.println(people.pesoIdeal());
	}

}
