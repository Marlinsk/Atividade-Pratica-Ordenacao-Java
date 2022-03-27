package code;

import java.util.ArrayList; // utilizado para criar um array de objetos
import java.util.List; // lê um objeto arrayList

// Classe App
public class Main {

	public static void main(String[] args) throws Exception {
		
		try{
			
			// instanciando a classe Item e seus arrays
			List<Item> itemlist = new ArrayList<>(); 
			
			// acessando o método de leitura do arquivo
			Read.Readfile(itemlist);
			
			// acessando o método para ordenar a categória em ordem alfabética
			Order.sortListbyCategory(itemlist);
			
			System.out.println("LISTA ANTES DA FORMATAÇÃO:"); // Escreve na tela
			
			// array para percorrer e escrever na tela, a lista de dados armazenados nos atributos
			for(int i = 0; i < itemlist.size(); i++) {
				System.out.println(itemlist.get(i).game + ", " + itemlist.get(i).category + ", " + itemlist.get(i).evaluation); // Escreve na tela
			}
			
			System.out.println("\nLISTA DEPOIS DA FORMATAÇÃO:"); // Escreve na tela
			
			// acessando o método para filtrar os dados 
			Order.sortListbyNote(itemlist);
			
			// array para percorrer e escrever na tela, a lista de dados armazenados nos atributos
			for(int i = 0; i < itemlist.size(); i++) {
				System.out.println(itemlist.get(i).game + ", " + itemlist.get(i).category + ", " + itemlist.get(i).evaluation); // Escreve na tela
			}
			
			System.out.println("\nArquivo JogosOrdenados.csv criado...\n"); // Escreve na tela 
			
			// criando arquivo com os dados formatados
			Write.writeFile(itemlist); 
			
       }
       catch(Exception e){
           throw e;
       }
	}
}
