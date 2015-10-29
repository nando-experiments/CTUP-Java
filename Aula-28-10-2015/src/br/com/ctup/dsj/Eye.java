package br.com.ctup.dsj;

public class Eye
{
	private String color;

	public String open()
	{
		return " - Abrindo.. - Mostrando a cor " + this.getColor();
	}

	public String close()
	{
		return " - Fechando..";
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
}
