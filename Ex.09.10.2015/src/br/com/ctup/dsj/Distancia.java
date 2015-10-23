package br.com.ctup.dsj;

/**
// 2.Distância
// Tendo como dados de entrada dois pontos quaisquer no plano,
// P1(x1,y1) e P2(x2,y2), calcule e retorne a distância entre eles.
// A fórmula que efetua tal cálculo é:
**/

/**
 * @author nandomoreirame
 *
 */
public class Distancia extends Helpers
{
	private Integer x1;
	private Integer y1;
	private Integer x2;
	private Integer y2;
	private double dis;
	
	public Integer getX1() {
		return x1;
	}
	
	public void setX1(Integer x1) {
		this.x1 = x1;
	}
	
	public Integer getY1() {
		return y1;
	}
	
	public void setY1(Integer y1) {
		this.y1 = y1;
	}
	
	public Integer getX2() {
		return x2;
	}
	
	public void setX2(Integer x2) {
		this.x2 = x2;
	}
	
	public Integer getY2() {
		return y2;
	}
	
	public void setY2(Integer y2) {
		this.y2 = y2;
	}

	public String getDistacia() {
		this.dis = this.raiz( this.potencia(this.x2 - this.x1, 2) + this.potencia( this.y2 - this.y1, 2));
		return "A distância entre os postos é: " + this.dis;
	}
}
