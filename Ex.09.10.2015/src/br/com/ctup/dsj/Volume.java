package br.com.ctup.dsj;

/**
 * @author nandomoreirame
 *
 */
public class Volume extends Helpers
{
	private int raio;
	private int altura;
	
	public int getRaio() {
		return raio;
	}
	
	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String getVolume() {
		return "Volume do cilindro é: " + this.volume(this.raio, this.altura);
	}	
}
