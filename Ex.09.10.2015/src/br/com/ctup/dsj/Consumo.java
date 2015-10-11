package br.com.ctup.dsj;

/**
 * @author nandomoreirame
 *
 */
public class Consumo extends Helpers
{
	private double tempo;
	private double velocidadeMedia;
	
	public double getTempo() {
		return tempo;
	}
	
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}
	
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String getLitros() {
		return "Foram gastos " + this.distacia(this.tempo, this.velocidadeMedia) / 12 + " litros de combustível";
	}
}
