//UnoOO
//Disciplina de LPOO 2022.2

package base;

import java.util.ArrayList;
import java.util.Scanner;

import acao.Acao;
import base.jogador.Jogador;
import cartas.Carta;

/**
 * @author Autores: Daniel Schutz, Felipe Pellissari, Fernanda Pessoa e José
 *         Lucas. Classe destinada a inicializar a partida e verificar seu
 *         término, bem como preparar o jogo - instanciando o baralho inicial,
 *         jogadores e passando estes por parâmero a classe 'Roda'
 */
public class Jogo {

	private Baralho baralho;
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	public static Roda roda;
	private int numeroJogadores;
	private Jogador jogadorAtual;// já tem essa no roda.java

	private ArrayList<Acao> acumulo = new ArrayList<>();

	/**
	 * Inicia o Baralho, lendo número de jogadores em 'numeroJogadores' e lendo o
	 * nome dos jogadores em 'nome', passando por parâmetro para a classe Jogador
	 * passando por parâmetro para a classe Roda(baralho, jogador)
	 * 
	 * @see Baralho.java
	 * @see Jogador.java
	 * @see Roda.java
	 */
	public void prepararJogo() {
		/**
		 * Inicia o baralho
		 */
		this.baralho = new Baralho(Baralho.INICIAL);

		/**
		 * definir quantidade de jogadores
		 */
		System.out.println("Quantos jogadores?\n");
		Scanner sc = new Scanner(System.in);
		this.numeroJogadores = sc.nextInt();

		/**
		 * instanciar jogadores
		 */
		for (int i = 0; i < numeroJogadores; i++) {

			jogadores.add(new Jogador());

		}

		/**
		 * instanciar a roda e mandar baralho e lista de jogadores
		 */
		this.roda = new Roda(this.baralho, this.jogadores);
	}

	/**
	* função que confere se ainda há cartas na mão do jogador 
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
	            setJogadorAtual(proximoJogador());
		     /**
	            *Jogador atual realiza a jogada (entra em contato com a roda para ver se há acumulo e decide se compra, joga ou executa as ações acumuladas
		    *@see Jogador.java
	            */
	            jogadorAtual.realizarJogada();
		

	            confereFim();
	            /**
	            *Verifica se a quantida de cartas na mão do jogador é igual a 0
	            *e define o ganhador se for o caso
	            *@see Mao.java
	            */
	            if(confereFim()==false)
	            {
	                System.out.print("O jogador %s ganhou.", jogadorAtual); /*printar o jogador que ficou sem cartas na mão*/
	                exit(0);
	            }

	            

	          }
	}

}
