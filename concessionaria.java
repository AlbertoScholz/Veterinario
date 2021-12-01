package Carros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class concessionaria {
	static ArrayList<String> carros = new ArrayList<String> (); 

	public static void listarCarros() {
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ferrari");

		
		 for (int indice = 0; indice < carros.size(); indice++) {
		System.out.println(carros.get(indice));
		 }	
	}
	

	 static Map<String,Double> tbPrice = new HashMap<String,Double>();
	 public static void main(String[] args){
		 tbPrice.put("AAAA", 100.00);
		 tbPrice.put("BBBBB", 200.00);
		 tbPrice.put("CCCCC", 300.00);

	 
	 listarCarros();
	 tbPrice.entrySet().stream().forEach(e -> {
			System.out.println("Placa: " + e.getKey()+ "  Preço: " + e.getValue());
		});


	 }
}