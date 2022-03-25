package code;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Write {
	
	public static void writeFile(List<Item> listaItens) throws IOException {

        FileWriter writer = new FileWriter("C://Users/Marlinsk/git/Atividade-Pratica-Ordenacao-EDRAF1/Atividade-Pratica-Ordenacao-EDRAF1/file/JogosOrdenados.csv");

        String collect =  listaItens.stream().map(item -> item.game + ", " + item.category + ", " + item.evaluation + "\n").collect(Collectors.joining(""));

        System.out.println(collect);

        writer.write(collect);
        writer.close();
    }
	
}
