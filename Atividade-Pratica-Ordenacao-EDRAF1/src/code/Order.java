package code;

import java.util.List;

public class Order {

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
}