package br.com.ctup.dsj;

public class Header
{
	private Eye eyeLeft;
	private Eye eyeRight;
	
	public Header()
	{
		eyeLeft = new Eye();
		eyeRight = new Eye();
	}
	
	public Eye getEyeLeft()
	{
		return eyeLeft;
	}

	public void setEyeLeft(Eye eyeLeft)
	{
		this.eyeLeft = eyeLeft;
	}

	public Eye getEyeRight()
	{
		return eyeRight;
	}

	public void setEyeRight(Eye eyeRight)
	{
		this.eyeRight = eyeRight;
	}
}
