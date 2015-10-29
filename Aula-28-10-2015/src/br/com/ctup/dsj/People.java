package br.com.ctup.dsj;

public class People
{
	private Header head;
	private String name;
	private int idade;
	
	public People()
	{
		head = new Header();
	}

	public Header getHead()
	{
		return head;
	}

	public void setHead(Header head)
	{
		this.head = head;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public String look()
	{
		return "Olhando.. ";
	}
	
	public String blink(int eye)
	{
		String res;
		
		res = "vai piscar";
		
		switch (eye) {
			case 1:
				res += " o olho esquerdo" + head.getEyeLeft().close() + head.getEyeLeft().open();
				break;
				
			case 2:
				res += " o olho direito" + head.getEyeRight().close() + head.getEyeRight().open();
				break;
	
			default:
				res += " os dois olhos.. " + this.look();
				break;
		}
		res += " ";
		
		return res;
	}
	
	public String turnsHead(String direction)
	{
		return "Virando a cabeça para " + direction + " ";
	}
	
	public String turnsAndBlink(String direction, int eye)
	{
		String res = "";
		
		switch (direction) {
			case "left":
				res += this.turnsHead("esquerda");			
				break;
			case "right":
				res += this.turnsHead("direita");
				break;
	
			default:
				break;
		}
		
		res += this.blink(eye);
		
		return res;
	}
}
