package br.com.ctup.dsj;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private Boolean ligado = false;
	private Integer qttPortas = 2;

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public Boolean isLigado() {
		return ligado;
	}

	public void setQttPortas(Integer portas) {
		this.qttPortas = portas;
	}

	public Integer getQttPortas() {
		return qttPortas;
	}
}
