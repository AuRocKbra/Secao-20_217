package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Produto;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Produto>list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		Function<Produto, String> upName = p -> p.getNome().toUpperCase();
		
		List<String> novaLista = list.stream().map(upName).collect(Collectors.toList());
		
		novaLista.forEach(System.out::println);
	}

}
