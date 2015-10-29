package br.com.ctup.dsj;

public class People
{
	private Calculos calc;
	private double altura;
	private String sexo;
	
	public People()
	{
		calc = new Calculos();
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	public void setSexo(String string)
	{
		this.sexo = string;
	}
	
	public String pesoIdeal()
	{
		return "O peso ideal da pessoa é: " + calc.calculaPesoIdeal(this.altura, this.sexo);
	}
}
