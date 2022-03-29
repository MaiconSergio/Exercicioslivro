package Exec37;

import java.util.concurrent.Semaphore;

import Exec37.controller;

public class main {

	public static void main(String[] args) {
		String[] direcoes = { "Norte para o Sul", "Leste para o Oeste", "Oeste para o Leste", "Sul para o Norte" };
		Semaphore semaforo = new Semaphore(1);
		for (int i = 1; i < 5; i++) {
			controller car = new controller(direcoes[i - 1], semaforo);
			car.start();
		}
	}
}
