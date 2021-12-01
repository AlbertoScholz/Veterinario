package Carros;

public class Carro {
     String marca;
     String modelo;
     Double preco;



    Carro(String marca, String modelo, Double preco) {
       this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }



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



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}

	


     




     
}