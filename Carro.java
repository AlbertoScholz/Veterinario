package Carros;


public class Carro {
     private String marca;
     private String modelo;
     private double preco;
     
     
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Carro(String marca, String modelo, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
     

     




     
}