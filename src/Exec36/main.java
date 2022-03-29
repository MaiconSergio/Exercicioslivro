package Exec36;

import java.util.concurrent.Semaphore;
import Exec36.controller;

public class main {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int idPessoa = 1; idPessoa < 5; idPessoa++) {
			Thread pessoa = new controller(idPessoa, semaforo);
			pessoa.start();
		}
	}

}