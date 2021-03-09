package controller;

public class ThreadVetor extends Thread {
	private int x;
	private int vet[] = new int [1000];
	
	public ThreadVetor (int x, int vet[]) {
		this.vet = vet;
		this.x = x;
	}
	
	@Override
	public void run() {
		contador();
	}
	
	public int Par (int par) {
		if (x % 2 == 0) {
			par = 1;
			return par;
		}
		else {
			par = 0;
			return par;
		}
	}
	
	public void contador() {
		double tempoInicial, tempoFinal, total;
		tempoInicial = System.nanoTime();
		if (Par(x) == 1) {
			for (int i = 0; i < vet.length; i++) {
			}
			}
		else if (Par(x) == 0) {
			for (int j : vet) {
				j = j + 0;
			}
		}
		tempoFinal = System.nanoTime();
		
		total = tempoFinal - tempoInicial;
		total = total / Math.pow(10, 9);
	
		System.out.println("TID #"+ getId() +" - "+ "Tempo total: "+ total + "s.");
	}
}
