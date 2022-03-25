package code;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		
		try{

			List<Item> itemlist = new ArrayList<>(); 
			
			Read.Readfile(itemlist);
			
			Order.sortListbyCategory(itemlist);
			
			System.out.println("LISTA ANTES DA FORMATAÇÃO:");
			for(int i = 0; i < itemlist.size(); i++) {
				System.out.println(itemlist.get(i).game + ", " + itemlist.get(i).category + ", " + itemlist.get(i).evaluation);
			}
			
			System.out.println("\nLISTA DEPOIS DA FORMATAÇÃO:");
			
			Order.sortListbyNote(itemlist);
			
			for(int i = 0; i < itemlist.size(); i++) {
				System.out.println(itemlist.get(i).game + ", " + itemlist.get(i).category + ", " + itemlist.get(i).evaluation);
			}
			
			System.out.println("\nArquivo JogosOrdenados.csv criado!\n");
			
			Write.writeFile(itemlist);
       }
       catch(Exception e){
           throw e;
       }
	}
}
