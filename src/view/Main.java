package view;
import java.util.Random;
import controller.ThreadVetor;

public class Main {
	public static void main(String[] args) {

		Random random = new Random();
		int x;
		int vet [] = new int [1000];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = random.nextInt(101);
		}
		
		for (x = 1; x < 3; x++) {
			Thread threadVetor = new ThreadVetor (x,vet);
			threadVetor.start();
		}
	}
}
