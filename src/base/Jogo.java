//UnoOO
//Disciplina de LPOO 2022.2

package base;

import java.util.ArrayList;
import java.util.Scanner;
import acao.Acao;
import base.jogador.Jogador;
import cartas.Carta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Autores: Daniel Schutz, Felipe Pellissari, Fernanda Pessoa e José
 *         Lucas. Classe destinada a inicializar a partida e verificar seu
 *         término, bem como preparar o jogo - instanciando o baralho inicial,
 *         jogadores e passando estes por parâmero a classe 'Roda'
 */
public class Jogo {
	private static final Logger LOGGER = LoggerFactory.getLogger(Jogo.class);
	private Baralho baralho;
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	public static Roda roda;
	private Jogador jogadorAtual;
	private ArrayList<Acao> acumulo = new ArrayList<>();

	/**
	 * Prepara o jogo, instanciando o baralho e a roda 
	 * @see Baralho.java
	 * @see Roda.java
	 */
	public void prepararJogo() {
		/**
		 * Inicia o baralho
		 */
		this.baralho = new Baralho(Baralho.INICIAL);

		/**
		 * instanciar a roda e mandar baralho e lista de jogadores
		 */
		LOGGER.info("Instanciando a roda");
		this.roda = new Roda(this.baralho, this.jogadores);
	}

	 /**
	            *Verifica se a quantida de cartas na mão do jogador é igual a 0
	            *e define o ganhador se for o caso
	            *@see Mao.java
	         */
	public boolean confereFim() {
		if (baralho.quantCarta() == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	* função que faz a execução do jogo
	*/
	public void run() {
		 while(true){
			
		    /**
	            *define o próximo jogador
	            */
		    LOGGER.info("Alterando para próximo jogador");		
	            jogadorAtual = roda.jogadorDaVez();
		     /**
	            *Jogador atual realiza a jogada (entra em contato com a roda para ver se há acumulo e decide se compra, joga ou executa as ações acumuladas
		    *@see Jogador.java
	            */
		    LOGGER.info("Jogador realizando jogada");
	            jogadorAtual.realizarJogada();
		
		
	           
	           LOGGER.info("Conferindo se acabou as cartas na mão do jogador");
	            if(confereFim()==false)
	            {
	                System.out.printf("O jogador %S ganhou.",jogadorAtual.getNome()); /*printar o jogador que ficou sem cartas na mão*/
	                break;
	            }

	            

	          }
	}
	/**
		 * construtor da classe Jogo
		 */
	public Jogo(ArrayList<Jogador> j){
		this.jogadores = j;
		LOGGER.info("Preparando o jogo");
		prepararJogo();
		LOGGER.info("Executando o jogo");
		run();
		

}

	
	
	
	

