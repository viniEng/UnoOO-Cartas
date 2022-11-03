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
		return this.compra;
	}

	/**
	 * Getter do baralho de descarte.
	 * @return Baralho de descarte da roda.
	 */
	public Baralho getDescarte(){
		return this.descarte;
	}

	/**
	 * Getter do arraylist dos jogadores.
	 * @return Arraylist de jogadores da roda.
	 */
	public ArrayList<Jogador> getJogadores(){
		return this.jogadores;
	}

	/**
	 * Getter do sentido.
	 * @return Sentido da roda.
	 */
	public int getSentido(){
		return this.sentido;
	}

	/**
	 * Getter da Posicao Atual.
	 * @return Posicao Atual da roda.
	 */
	public int getPosicaoAtual(){
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
		LOGGER.info("{} Cartas foram recebidas do baralho inicial", recebido.quantCarta());
		this.jogadores = jogadoresRecebidos;
		LOGGER.info("Há {} Jogadores na roda", jogadoresRecebidos.size());
		this.posicaoAtual = 0;
		LOGGER.info("Iniciando distribuição de cartas iniciais");
		for (int i = 0; i < this.jogadores.size(); i++) {
			for (int j = 0; j < 7; j++) {
				Carta cartaAux = entregarCarta();
				Jogador jogadorAux = this.jogadores.get(i);
				jogadorAux.comprar(cartaAux);
				LOGGER.info("Jogador {} recebeu Carta {}", jogadorAux, cartaAux);
			}
		}
		LOGGER.info("Comprando primeira carta do jogo");
		Carta cartaAux;
		do {
			cartaAux = entregarCarta();
			this.descarte.receberCarta(cartaAux);
			if(cartaAux instanceof CartaEspecialSemCor)
				LOGGER.info("{} foi a carta retirada, comprando mais uma", cartaAux);
		} while (cartaAux instanceof CartaEspecialSemCor);
		LOGGER.info("{} é a primeira carta do jogo", cartaAux);

	}

	/**
	 * Insere uma carta no monte de descarte.
	 * @param recebida Carta recebida para inserir no monte de descarte.
	 */
	public void descartarCarta(Carta recebida) {
		LOGGER.info("Descartando carta {}", recebida);
		this.descarte.receberCarta(recebida);
	}

	/**
	 * Compra uma carta do baralho de compra.
	 * @return Primeira carta do monte de compra.
	 */
	public Carta entregarCarta() {
		Carta cartaAux;
		if (this.compra.getCartas().size() < 1) {
			this.transformaDescarte();
		}
		cartaAux = this.compra.comprarCarta();
		LOGGER.info("Entregando carta {}", cartaAux);
		return cartaAux;
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
		this.sentido *= -1;
		LOGGER.info("Sentido invertido: {}", this.sentido);
	}

	/**
	 * Dobra o sentido.
	 */
	public void pular() {
		this.sentido *= 2;
		LOGGER.info("Sentido dobrado: {}", this.sentido);
	}

	/**
	 * Determina qual é o jogador responsavel por jogar no turno.
	 * @param jogadorRecebido Jogador
	 * @return Posição do jogador na roda
	 */
	public Jogador jogadorDaVez() {
		int proxPosicao;
		proxPosicao = (this.posicaoAtual + this.sentido) % this.jogadores.size();
		if(sentido%2==0){
			LOGGER.info("Sentido voltou ao normal");
			this.sentido/=2;
		}
		Jogador jogadorAux = this.jogadores.get(proxPosicao);
		LOGGER.info("O jogador da vez é {}", jogadorAux);
		return jogadorAux;
	}

	/**
	 * @return Ultima carta do baralho de descarte.
	 */
	public Carta getUltimaCarta() {
		Carta cartaAux = this.descarte.ultimaCarta();
		LOGGER.info("A ultima carta é {}", cartaAux);
		return cartaAux;
	}

	/**
	 * Compra um numero de cartas e entrega a um jogador.
	 * @param qtd Quantidade de cartas a serem compradas.
	 * @param jogador Jogador que vai comprar.
	 */
	public void comprar(int qtd, Jogador jogador) {
		LOGGER.info("Comprando {} carta(s) ao jogador {}", qtd, jogador);
		for (int i = 0; i < qtd; i++) {
			jogador.comprar(entregarCarta());
		}
	}

	/**
	 * Método sobrescrito que adiciona informaçoes importantes sobre a Roda.
	 * @return String com informações sobre um objeto da classe Roda.
	 */
	@Override
	public String toString(){
		String sent;
		if(this.sentido > 0)
			sent = "Positivo";
		else
			sent = "Negativo";
		return "Roda: Posição atual: " + this.posicaoAtual + ", Sentido: " + sent 
			   + ", Num cartas compra: " + this.compra.quantCarta() + ", Num cartas descarte: " 
			   + this.descarte.quantCarta();
	}
}

