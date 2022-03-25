package code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Read {
	
	public static void Readfile(List<Item> Itemlist) throws Exception {
		try {
			String path = "D://Development/Eclipse-Workspace/Projects/Atividade-Pratica-Ordenacao-EDRAF1/file/JogosDesordenados.csv";
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
