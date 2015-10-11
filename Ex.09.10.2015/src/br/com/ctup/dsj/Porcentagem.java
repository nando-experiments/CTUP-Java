package br.com.ctup.dsj;

/**
 * @author nandomoreirame
 *
 */
public class Porcentagem extends Helpers
{
	private double valorInicial;
	private double porcentagem;
	
	public double getValorInicial() {
		return valorInicial;
	}
	
	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	public double getPorcentagem() {
		return porcentagem;
	}
	
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public String getTotal() {
		return " = " + this.percentage(this.valorInicial, this.porcentagem);
	}
}
