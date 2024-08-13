package exlistadetarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeitorDeLista {

	public static void main(String[] args) throws IOException {
		Path tarefas = Paths.get("F:\\IDE\\exLista\\listaDeTarefas.txt");
		
		List<String> lista = Files.readAllLines(tarefas);
		
		for (int i = 1; i < lista.size(); i++) {
			String tarefa = lista.get(i);
			System.out.println("A tarefa " + i + " é a de " + tarefa);
		}
	}

}
