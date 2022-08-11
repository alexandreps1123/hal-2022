import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeraArquivo {

	public static void main(String[] args) throws IOException {
		ArrayList<String> nome = new ArrayList<String>();
		nome.add("Jorge");
		nome.add("Ana");
		nome.add("Lana");
		nome.add("Ranna");

		FileWriter arquivo = new FileWriter("../arquivo.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		for(String n: nome) {
			gravarArquivo.println(n);	
		}
		
		arquivo.close();
		
		
	}

}
