package exlistadetarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tarefas = new ArrayList<String>();
		
		for(int i = 1 ; i < 15 ; i++) {
			System.out.print("Digite 0 para sair ou adicione a tarefa de número " + i + " : ");
			String tarefa = sc.next();
			if(tarefa == "0") {
				break;
			}else {
				tarefas.add(tarefa);
			}
		}
		
		
		Path listaDeTarefas = Paths.get("F:\\IDE\\exLista\\listaDeTarefas.txt");
		Files.write(listaDeTarefas ,tarefas);
	}

}
