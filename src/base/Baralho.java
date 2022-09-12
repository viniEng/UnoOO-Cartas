// package base;

import java.util.Random;

public class Baralho {
	private Carta[] cartas = new Carta[112];
	private int proximaCarta = 0;
	
	private void mostrarCartas() {
		for(int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].toString());
		}
	}
	
	public void inicializar() {
		String cores[] = { Carta.AZUL, Carta.AMARELO, Carta.VERMELHO, Carta.VERDE };
		int i = 0;
		for(int j = 0; j < 4; j++) {
			for(int k = 0; k < 2; k++) {
				for(int n = 0; n <= 9; n++) {
					this.cartas[i++] = new Carta(cores[j], n);
				}
				this.cartas[i++] = new Carta(cores[j], Carta.MAIS2);
				this.cartas[i++] = new Carta(cores[j], Carta.INVERTE);
				this.cartas[i++] = new Carta(cores[j], Carta.BLOQ);
			}
			this.cartas[i++] = new Carta(Carta.MAIS4);
			this.cartas[i++] = new Carta(Carta.TROCACOR);
		}
	}
	
	public void embaralhar() {
		Random random = new Random();
		for(int i = 0; i < this.cartas.length; i++) {
			int posicaoTroca = random.nextInt(cartas.length);
			Carta carta = this.cartas[0];
			this.cartas[0] = this.cartas[posicaoTroca];
			this.cartas[posicaoTroca] = carta;
		}
	}
	
	public Carta pegarCarta() {
		Carta carta = cartas[proximaCarta++];
		cartas[proximaCarta] = null;
		return carta;
	}
}
