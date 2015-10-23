package br.com.ctup.dsj;

/**
// 1.  PA (Progressão Aritmética)
// A expressão an = a1 + (n – 1) * r é denominada termo geral da PA.
// Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
// r é a razão e a1 é o primeiro termo da Progressão Aritmética.
// Elabore um método que forneça o n-ésimo termo de uma progressão aritmética.
// Exemplo: a1 = 10, n = 7, r = 3. Resultado: an = 28 
**/

/**
 * @author nandomoreirame
 *
 */
public class Pa
{
	private Integer an; // termo de ordem
	private Integer n; // n-ésimo termo
	private Integer r; // razão
	private Integer a1; // primeiro termo
	
	public Integer getN() {
		return n;
	}
	
	public void setN(Integer n) {
		this.n = n;
	}
	
	public Integer getR() {
		return r;
	}
	
	public void setR(Integer r) {
		this.r = r;
	}
	
	public Integer getA1() {
		return a1;
	}
	
	public void setA1(Integer a1) {
		this.a1 = a1;
	}
	
	public String resultPA() {
		this.an = this.a1 + (this.n - 1) * this.r;
		return "Resultado: an = " + this.an;
	}
}
