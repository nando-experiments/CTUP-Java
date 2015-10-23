package br.com.ctup.dsj;

/**
 * @author nandomoreirame
 *
 */
public class MediaPonderada
{
	private double n1;
	private double n2;
	private double n3;
	private int p1;
	private int p2;
	private int p3;
	private double media;
	
	public double getN1() {
		return n1;
	}
	
	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	public double getN2() {
		return n2;
	}
	
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double getN3() {
		return n3;
	}
	
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	public int getP1() {
		return p1;
	}
	
	public void setP1(int p1) {
		this.p1 = p1;
	}
	
	public int getP2() {
		return p2;
	}
	
	public void setP2(int p2) {
		this.p2 = p2;
	}
	
	public int getP3() {
		return p3;
	}
	
	public void setP3(int p3) {
		this.p3 = p3;
	}
	
	public String getMedia() {
		this.media = (this.n1 * this.p1 + this.n2 * this.p2 + this.n3 * this.p3) / (this.p1 + this.p2 + this.p3);
		return "Média Ponderada é = " + this.media;
	}
}
