package br.com.ctup.dsj;

public class Calculos
{
	public double calculaPesoIdeal(double altura, String sexo)
	{
		if(sexo.toLowerCase() == "m") {
			return (72.7 * altura) - 58;
		} else {
			return (62.1 * altura) - 44.7;
		}
	}
}
