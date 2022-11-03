//Somos nós, os amigos de todos vós
package base.jogador;

import java.util.ArrayList;
import base.*;
import cartas.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public void descartar(){
        LOGGER.trace("Descartando carta");

        //
    }

    /**
     * Realiza uma jogada a partir da analize da situação atual
     * da Roda do Jogo.
     * @see Roda
     * @see Jogo
     * @see Acao
     */
     //@Override
    public void realizarJogada(){
        LOGGER.trace("Realizando jogada");

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
