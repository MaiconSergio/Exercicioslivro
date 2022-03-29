package Exec39;

import java.util.concurrent.Semaphore;

import Exec39.controller;
import Exec39.controller1;

public class main {

	public static void main(String[] args) {
		Semaphore limitacaoDeposito = new Semaphore(1);
		Semaphore limitacaoSaque = new Semaphore(1);
		for (int i = 0; i < 20; i++) {
			int tipo = (int) (Math.random() * 2);
			int idConta = (int) (Math.random() * 10000);
			double saldoConta = Math.round((Math.random() * 10000) * 100d) / 100d;
			double valorTransacao = Math.round((Math.random() * 10000) * 100d) / 100d;
			if (tipo == 0) {
				controller deposito = new controller(idConta, saldoConta, valorTransacao, limitacaoSaque);
				deposito.start();
			} else if (tipo == 1) {
				controller1 saque = new controller1(idConta, saldoConta, valorTransacao, limitacaoDeposito);
				saque.start();
			}
		}
	}

}