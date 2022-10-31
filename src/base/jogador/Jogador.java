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
        LOGGER.info("Retornando nome de jogador");
        LOGGER.info("Nome retornado: {}", nome);
        return nome;
    }

    /**
     * Retorna a quantidade de cartas atual do jogador
     * @return Quantidade de cartas que o jogador possui atualmente
     */
    public int getQuantidadeCartas(){
        int qtdCartas = this.maoJogador.getQuantidadeCartas();

        LOGGER.info("Retornando quantidade de cartas");
        LOGGER.info("Quantidade de cartas: {}", qtdCartas);

        return qtdCartas;
    }

    /**
     * Altera o nome do jogador
     * @param nome (nome a ser atualizado para o jogador)
     */
    public void setNome(String nome) {
        LOGGER.info("Alterando nome de jogador");
        this.nome = nome.trim();

        LOGGER.info("Nome setado: {}", this.nome);
    }

    /**
    *
    * Inicializa a maoJogador a partir de uma lista de cartas
    * @param cartasIniciais - Lista de cartas iniciais do jogador
    * @see MaoCartas
    **/
    public void inicializarMao(ArrayList<Carta> cartasIniciais){
        LOGGER.info("Instanciando objeto de MaoCartas a partir de lista de cartas");

        this.maoJogador = new MaoCartas(cartasIniciais);
    }

    /**
    *
    * Inicializa a maoJogador sem nenhuma carta
    * @see MaoCartas
    **/
    private void inicializarMao(){
        LOGGER.info("Instanciando objeto de MaoCartas vazia");

        this.maoJogador = new MaoCartas();
    }

    /**
    *
    * Compra uma lista de cartas, adicionando-as a maoJogador
    * @see MaoCartas
    **/
    //@Override
    public void comprar(ArrayList<Carta> listaCartas){
        LOGGER.info("Comprando (recebendo) lista de cartas");

        this.maoJogador.receberCartas(listaCartas);
    }

    /**
    *
    * Compra uma carta, adicionando uma carta a maoJogador,
    * @see MaoCartas
    **/
    //@Override
    public void comprar(Carta carta){
        LOGGER.info("Comprando (recebendo) uma carta");

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
        LOGGER.info("Descartando carta");

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
        LOGGER.info("Realizando jogada");

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
