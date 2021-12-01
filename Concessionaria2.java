package Carros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concessionaria {

    public Concessionaria() {
    	
    	
    	      this.carros = new ArrayList<Carro>();
    	      this.tabela_placaCar_preco = new HashMap<String, Double>();
    	    }
    

    ArrayList<Carro> carros;
    Map<String, Double> tabela_placaCar_preco;

    //O método adicionaVeiculo deverá adicionar um veículo ao estoque (atributo listaAutomoveis).
    public void adicionaVeiculo(Carro automovel){
         carros.add(automovel);
    }
    // O método vendaVeiculo remove um veículo do estoque.
    public void vendaVeiculo(Carro automovel){
        carros.remove(automovel);
    }

    //O método consultaEstoqueVeiculo devolve os veículos em estoque.
    public String consultaEstoqueVeiculo(){
        return carros.size()+"";
    }
    
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        Carro automovel = new Carro("Volvo", "X30", 109.00);
        concessionaria.adicionaVeiculo(automovel);

        System.out.println(concessionaria.carros);
        System.out.println(concessionaria.consultaEstoqueVeiculo());
        
      }


}