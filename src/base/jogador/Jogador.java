//Somos nós, os amigos de todos vós
package base.jogador;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import acao.Acao;
import base.Jogo;
import base.Roda;
import cartas.Carta;
import cartas.CartaEspecialComCor;
import cartas.CartaEspecialSemCor;
import cartas.CartaNormal;
import cartas.CartaSemAcao;
public class Jogador {//implements Jogada{
    private static final Logger LOGGER = LoggerFactory.getLogger(Jogador.class);
    private String nome;
    private MaoCartas maoJogador;

    /**
     * Construtor que recebe o nome do jogador
     * e inicializa uma maoJogador (objeto de MaoCartas) sem
     * nenhuma carta.
     * @param nome - Nome inicial do jogador
     * @see MaoCartas
     */
    public Jogador(String nome){
        LOGGER.info("Instânciando objeto de Jogador a partir de nome e instanciando MaoCartas vazia em objeto");

        this.nome = nome.trim();
        this.inicializarMao();

        LOGGER.info("Jogador :\n{}",this.toString());
    }

    // ArrayList<Carta> maoJogador = new ArrayList<Carta>();

    /**
     * Retorna o nome do jogador
     * @return nome - nome atual do jogador
     */
    public String getNome() {
        LOGGER.info("Nome retornado: {}", nome);
        return nome;
    }

    /**
     * Retorna a quantidade de cartas atual do jogador
     * @return Quantidade de cartas que o jogador possui atualmente
     */
    public int getQuantidadeCartas(){
        int qtdCartas = this.maoJogador.quantCarta();
        LOGGER.info("{} possui {} cartas",this.getNome(), qtdCartas);
        return qtdCartas;
    }

    /**
     * Altera o nome do jogador
     * @param nome (nome a ser atualizado para o jogador)
     */
    public void setNome(String nome) {
        LOGGER.info("{} alterou o nome para {}", this.getNome(), nome);
        this.nome = nome.trim();
    }

    /**
    *
    * Inicializa a maoJogador a partir de uma lista de cartas
    * @param cartasIniciais - Lista de cartas iniciais do jogador
    * @see MaoCartas
    **/
    public void inicializarMao(ArrayList<Carta> cartasIniciais){
        LOGGER.trace("Instanciando objeto de MaoCartas a partir de lista de cartas");
        this.maoJogador = new MaoCartas(cartasIniciais);
        LOGGER.info("MaoCartas iniciada: {}", this.maoJogador.toString());
    }

    /**
    *
    * Inicializa a maoJogador sem nenhuma carta
    * @see MaoCartas
    **/
    private void inicializarMao(){
        LOGGER.trace("Instanciando objeto de MaoCartas vazia");

        this.maoJogador = new MaoCartas();
    }

    /**
    *
    * Compra uma lista de cartas, adicionando-as a maoJogador
    * @see MaoCartas
    **/
    //@Override
    public void comprar(ArrayList<Carta> listaCartas){
        LOGGER.trace("Comprando (recebendo) lista de cartas");
        this.maoJogador.receberCartas(listaCartas);
    }

    /**
    *
    * Compra uma carta, adicionando uma carta a maoJogador,
    * @see MaoCartas
    **/
    //@Override
    public void comprar(Carta carta){
        this.maoJogador.receberCarta(carta);
        LOGGER.info("Carta adicionada: {}", carta.toString());
    }

     /**
    *
    * Descarta uma carta, retirando uma carta de maoJogador,
    * adicionando-a ao monte de descarte
    * @see MaoCartas
    **/
    //@Override
    public void descartar(Carta carta, Roda roda){
        LOGGER.info("Descartando carta");
        
        this.maoJogador.descartarCarta(carta, roda);
    }

    /**
     * Realiza uma jogada a partir da analize da situação atual
     * da Roda do Jogo.
     * @see Roda
     * @see Jogo
     * @see Acao
     */
    public void realizarJogada(Roda roda){
        LOGGER.info("Realizando jogada");
        
        Carta carta = defineCartaDaJogada(roda);
        
        this.maoJogador.descartarCarta(carta, roda);
        try {
			carta.getAcao().realizar(roda);
		} catch (CartaSemAcao e) {
		}
    }
    
    private Carta defineCartaDaJogada(Roda roda)
    {
    	Carta ultimo = roda.getUltimaCarta();
    	/*
    	 * Sequência de uso das cartas:
    	 * 1º carta especial com cor: bloqueio, reverso, +2
    	 * 2º carta normal
    	 * 3º carta especial sem cor: trocacor e +4
    	 */
    	
    	// Busca bloqueio, reverso e +2
    	for(Carta c : this.getMaoJogador().getCartas())
    	{
    		if(!(c instanceof CartaEspecialComCor))
    			continue;
    		
    		CartaEspecialComCor ca = (CartaEspecialComCor)c;
    		
    		// Verifica se é a mesma cor ou se é a mesma ação pra poder jogar
    		if(ca.getCor() == ultimo.getCor() || (ultimo instanceof CartaEspecialComCor && ca.getAcao() == ((CartaEspecialComCor)ultimo).getAcao()))
    		{
    			return ca;
    		}
    	}
    	
    	// Busca cartas normais
    	for(Carta c : this.getMaoJogador().getCartas())
    	{
    		if(!(c instanceof CartaNormal))
    			continue;
    		
    		CartaNormal cn = (CartaNormal)c;
    		
    		// Se for a mesma cor pode jogar
    		if(cn.getCor() == ultimo.getCor())
    			return c;
    		
    		// Se for o mesmo número também pode jogar
    		if(ultimo instanceof CartaNormal && ((CartaNormal)ultimo).getNumero() == cn.getNumero())
    			return c;
    	}
    	
    	// Busca +4 e troca cor
    	for(Carta c : this.getMaoJogador().getCartas())
    	{
    		if(!(c instanceof CartaEspecialSemCor))
    			continue;
    		
    		// +4 e troca cor pode ser jogado de qualquer forma
    		return c;
    	}
    	
    	// Se não conseguir jogar nenhuma tem que comprar e tentar de novo
    	roda.comprar(1, this);
    	return this.defineCartaDaJogada(roda);
    }
    
    public MaoCartas getMaoJogador() {
		return maoJogador;
	}

	/**
     * Retorna nome, quantidade de cartas e apresentação de todas
     * as cartas do objeto de Jogador em uma String
     * @return String com informações de Jogador.
     */
    @Override
    public String toString(){
        return String.format("Nome jogador:%s\nQuantidade de cartas:%d\nCartas:%s",
                            this.nome, this.getQuantidadeCartas(), this.maoJogador.toString());
    }

}
