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

	public boolean confereFim() {
		if (baralho.quantCarta() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public void run() {
		 while(true){
			 Carta ultimaCarta = roda.getUltimaCarta();
			 
			 /**
			  * Se houver acumulo
			  */
			 if(this.acumulo.isEmpty()) {
				 jogadorAtual.executarJogada(this.roda);
			 }
			 else {
				 jogadorAtual.excutarJogadaAcumulada(this.acumulo.get(0));
				 
			 }


	            

	            /*por enquanto não temos acesso ao tipo de retorno das cartas para poder definir a comparação e os métodos para executar */
	            
	            /**
	            *verificar AcaoAcumulada
	            *@see Acao.java
	            *@see Jogador.java
	            */
	            if(getAcumulo()==0)/*se não tem acumulo*/
	            {
	                jogadorAtual.realizarJogada();/*jogador joga uma carta ou compra UMA da pilha de compra */
	                
	                if(/*se a carta descartada for reverso, bloqueio ou troca cor*/)
	                {
	                    jogadorAtual.executarAcao(); /*executar a ação da carta, 
	                    no caso das cartas +4 e escolher Cor, essa carta já é passada com uma cor definida pelo jogador*/
	                }
	                else if(/*se a carta descartada for +2 ou +4*/)
	                {
	                    setAcumulo( getAcumulo() + ultimaCarta.getValor());
	                }
	            } 

	            else /*se tem acumulo*/
	            {
	                /**
	                *Jogador decide se joga uma carta do mesmo tipo e acumula, 
	                ou compra a quantidade acumulada 
	                *@see Jogador.java
	                *@see Acao.java
	                */
	                realizarJogada(); 
	                if(/*se nao tem carta igual para jogar*/)
	                    /**
	                    *Roda executa a ação acumulada
	                    *@see Roda.java
	                    */
	                    jogadorAtual.executaAcaoAcumulada(); 

	                else
	                {
	                    /**
	                    *Jogador joga carta
	                    *@see Jogador.java
	                    *@see Mao.java
	                    */
	                    jogadorAtual.realizarJogada();
	                }
	            }

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

	            /**
	            *define o próximo jogador
	            */
	            setJogadorAtual(proximoJogador());

	          }
	}

}
