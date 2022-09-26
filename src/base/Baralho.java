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
	private ArrayList<Carta> baralho = new ArrayList<>();
	// private Carta[] baralho = new Carta[112];

	/**
	 * Construtor padrão para qualquer baralho
	 */
	public Baralho() {

	}

	/**
	 * Esse método somente será chamado quando o baralho criado for do tipo inicial.
	 */
	public void inicializarBaralho() {
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

		return this.baralho.remove(0);
	}

	public int quantCarta() { // para verificar a quantidade de cartas
		return this.baralho.size();
	}

	/**
	 * @return the baralho
	 */
	public ArrayList<Carta> getBaralho() {
		return baralho;
	}

	/**
	 * @param baralho the baralho to set
	 */
	public void setBaralho(ArrayList<Carta> baralho) {
		this.baralho = baralho;
	}

}