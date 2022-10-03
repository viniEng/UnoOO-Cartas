package base;

import java.util.ArrayList;

import cartas.Carta;

/**
 * Representa a abstração de um conjunto de cartas
 * 
 * @author luciano.silva
 *
 */
public class Baralho {
	public static final boolean NORMAL = false;
	public static final boolean INICIAL = true;

	private ArrayList<Carta> cartas = new ArrayList<>();
	private boolean tipo;

	// private Carta[] baralho = new Carta[112];

	/**
	 * 
	 * @param tipo Baralho.INICIAL se for baralho inicial, ou Baralho.Normal para os
	 *             demais tipos de baralho.
	 */
	public Baralho(boolean tipo) {
		this.tipo = tipo;
		if (tipo == Baralho.INICIAL) {
			gerarCartas();
			embaralhar();
		}

	}

	/**
	 * Esse método somente será chamado quando o baralho criado for do tipo inicial.
	 */
	public void gerarCartas() {
	}

	public void embaralhar() {
	}

	/**
	 * @deprecated quem distribui é a roda, excluir este método
	 */
	public void distribuir() {
	}

	/**
	 * 
	 * @return a primeira carta do baralho
	 */
	public Carta comprarCarta() {

		return this.cartas.remove(0);
	}

	/**
	 * 
	 * @param c
	 */
	public void receberCarta(Carta c) {
		this.cartas.add(c);
	}

	public int quantCarta() { // para verificar a quantidade de cartas
		return this.cartas.size();
	}

	/**
	 * @return the baralho
	 */
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the baralho to set
	 */
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	/**
	 * @return the tipo
	 */
	public boolean isTipo() {
		return tipo;
	}

}