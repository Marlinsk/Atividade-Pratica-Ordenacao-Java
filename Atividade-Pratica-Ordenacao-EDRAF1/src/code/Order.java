package code;

import java.util.List; 

public class Order {

	// Método responsável por ordenar os nomes das categorias em ordem alfabética 
	public static void sortListbyCategory(List<Item> ItemList) {
		for (int i = 0; i < ItemList.size(); i++) {
			for (int j = i + 1; j < ItemList.size(); j++) {
				String Arraylist1 = ItemList.get(i).category;
				String Arraylist2 = ItemList.get(j).category;
				if (Arraylist2.compareTo(Arraylist1) < 1) {
					Item temp = ItemList.get(i);
					ItemList.set(i, ItemList.get(j));
					ItemList.set(j, temp);
				}
			}
		}
	}

	/* Método responsável por:  
	 * ordenar categoria em ordem alfabética
	 * ordenar as notas em ordem decrescente
	 */
	public static void sortListbyNote(List<Item> listaItens) throws Exception {
		for (int i = 0; i < listaItens.size(); i++) {
			for (int j = i + 1; j < listaItens.size(); j++) {
				String itemA = listaItens.get(i).category;
				String itemB = listaItens.get(j).category;
				String itemC = listaItens.get(i).evaluation;
				String itemD = listaItens.get(j).evaluation;
				if (itemC.compareTo(itemD) < 1 && itemB.equals(itemA)) {
					Item temp = listaItens.get(i);
					listaItens.set(i, listaItens.get(j));
					listaItens.set(j, temp);
				}
			}
		}
	}
}