package code;

import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.util.List; 

public class Read {
	
	// Método para ler arquivo csv 
	public static void Readfile(List<Item> Itemlist) throws Exception {
		try {
			
			String path = "C://Users/Marlinsk/git/Atividade-Pratica-Ordenacao-EDRAF1/Atividade-Pratica-Ordenacao-EDRAF1/file/JogosDesordenados.csv";
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			String line = "";
			
			while ((line = br.readLine()) != null) {
				
				String[] Gameslist = line.split(",");
				
				Item item = new Item();
				
				item.game = Gameslist[0]; 
				item.category = Gameslist[1]; 
				item.evaluation = Gameslist[2]; 
				
				Itemlist.add(item);
				
			}
			
		} catch (FileNotFoundException e) {
			throw e;
		}
	}
}
