package base;
import java.util.ArrayList;
import cartas.Carta;
import cartas.CartaEspecialSemCor;
import base.jogador.Jogador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Roda {
	/**
	 * Logger da classe Roda.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Roda.class);

	/**
	 * Baralho de compra.
	 */
	private Baralho compra;

	/**
	 * Baralho de descarte.
	 */
	private Baralho descarte = new Baralho(Baralho.NORMAL);

	/**
	 * Arraylist de jogadores.
	 */
	private ArrayList<Jogador> jogadores;

	/**
	 * Sentido da roda (positivo ou negativo).
	 */
	private int sentido;

	/**
	 * Posicao atual da roda.
	 */
	private int posicaoAtual;

	/**
	 * Getter do baralho de compra.
	 * @return Baralho de compra da roda.
	 */
	public Baralho getCompra(){
		LOGGER.info("Get Compra");
		return this.compra;
	}

	/**
	 * Getter do baralho de descarte.
	 * @return Baralho de descarte da roda.
	 */
	public Baralho getDescarte(){
		LOGGER.info("Get descarte");
		return this.descarte;
	}

	/**
	 * Getter do arraylist dos jogadores.
	 * @return Arraylist de jogadores da roda.
	 */
	public ArrayList<Jogador> getJogadores(){
		LOGGER.info("Get jogadores");
		return this.jogadores;
	}

	/**
	 * Getter do sentido.
	 * @return Sentido da roda.
	 */
	public int getSentido(){
		LOGGER.info("Get sentido");
		return this.sentido;
	}

	/**
	 * Getter da Posicao Atual.
	 * @return Posicao Atual da roda.
	 */
	public int getPosicaoAtual(){
		LOGGER.info(("Get posicao"));
		return this.posicaoAtual;
	}

	/**
	 * Construtor:
	 * Instancia a roda, distribui as cartas iniciais aos jogadores e joga a primeira carta
	 * ao monte de descarte.
	 * @param recebido Baralho inicial recebido pelo jogo.
	 * @param jogadoresRecebidos ArrayList<Jogador> jogadores recebidos pelo jogo.
	 */
	public Roda(Baralho recebido, ArrayList<Jogador> jogadoresRecebidos) {
		LOGGER.info("Iniciando roda");
		this.compra = recebido;
		this.jogadores = jogadoresRecebidos;
		this.posicaoAtual = 0;
		LOGGER.info("Distribuindo cartas iniciais");
		for (int i = 0; i < this.jogadores.size(); i++) {
			for (int j = 0; j < 7; j++) {
				this.jogadores.get(i).comprar(entregarCarta());
			}
		}
		LOGGER.info("Jogando primeira carta");
		do {
			this.descarte.receberCarta(this.compra.comprarCarta());
		} while (this.descarte.ultimaCarta() instanceof CartaEspecialSemCor);

	}

	/**
	 * Insere uma carta no monte de descarte.
	 * @param recebida Carta recebida para inserir no monte de descarte.
	 */
	public void descartarCarta(Carta recebida) {
		LOGGER.info("Descartando carta");
		this.descarte.receberCarta(recebida);
	}

	/**
	 * Compra uma carta do baralho de compra.
	 * @return Primeira carta do monte de compra.
	 */
	public Carta entregarCarta() {
		LOGGER.info("Entregando carta");
		if (this.compra.getCartas().size() < 1) {
			transformaDescarte();
		}
		return this.compra.comprarCarta();
	}

	/**
	 * Transforma o baralho de descarte no baralho de compra.
	 */
	public void transformaDescarte() {
		LOGGER.info("Transformando monte de descarte em monte de compra");
		for (int i = 0; i < this.descarte.getCartas().size() - 1; i++) {
			this.compra.receberCarta(this.descarte.comprarCarta());
		}
		this.compra.embaralhar();
	}

	/**
	 * Altera o sentido do jogo(horário e anti-horário).
	 */
	public void inverter() {
		LOGGER.info("Invertendo sentido");
		this.sentido *= -1;
	}

	/**
	 * Dobra o sentido.
	 */
	public void pular() {
		this.sentido *= 2;
	}

	/**
	 * Determina qual é o jogador responsavel por jogar no turno.
	 * @param jogadorRecebido Jogador
	 * @return Posição do jogador na roda
	 */
	public Jogador jogadorDaVez() {
		LOGGER.info("Jogador da vez");
		int proxPosicao;
		proxPosicao = (this.posicaoAtual + this.sentido) % this.jogadores.size();
		if(sentido%2==0)
			this.sentido/=2;
		return this.jogadores.get(proxPosicao);
	}

	/**
	 * @return Ultima carta do baralho de descarte.
	 */
	public Carta getUltimaCarta() {
		LOGGER.info("Get ultima carta");
		return this.descarte.ultimaCarta();
	}

	/**
	 * Compra um numero de cartas e entrega a um jogador.
	 * @param qtd Quantidade de cartas a serem compradas.
	 * @param jogador Jogador que vai comprar.
	 */
	public void comprar(int qtd, Jogador jogador) {
		LOGGER.info("Comprando carta");
		for (int i = 0; i < qtd; i++) {
			jogador.comprar(entregarCarta());
		}
	}

}

