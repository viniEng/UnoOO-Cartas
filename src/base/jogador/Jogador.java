package base.jogador;

import java.util.ArrayList;
import base.*;
import cartas.*;

public class Jogador {//implements Jogada{

    private String nome;
    private MaoCartas maoJogador;

    // ArrayList<Carta> maoJogador = new ArrayList<Carta>();

    /**
     * Retorna o nome do jogador
     * @return nome - nome atual do jogador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome do jogador
     * @param nome (nome a ser atualizado para o jogador)
     */
    public void setNome(String nome) {
        this.nome = nome.toLowerCase().trim();;
    }

    /**
    *
    * Inicializa a maoJogador a partir de uma lista de cartas
    * @param cartasIniciais - Lista de cartas iniciais do jogador
    * @see MaoCartas
    **/
    public void inicializarMao(ArrayList<Carta> cartasIniciais){
        this.maoJogador = new MaoCartas(cartasIniciais);
    }

    /**
    *
    * Inicializa a maoJogador sem nenhuma carta
    * @see MaoCartas
    **/
    private void inicializarMao(){
        this.maoJogador = new MaoCartas();
    }

    /**
    *
    * Compra uma lista de cartas, adicionando-as a maoJogador
    * @see MaoCartas
    **/
    public void comprar(ArrayList<Carta> listaCartas){
        this.maoJogador.receberCartas(listaCartas);
    }

    /**
    *
    * Compra uma carta, adicionando uma carta a maoJogador,
    * @see MaoCartas
    **/
    public void comprar(Carta carta){
        this.maoJogador.receberCarta(carta);
    }

     /**
    *
    * Descarta uma carta, retirando uma carta de maoJogador,
    * adicionando-a ao monte de descarte
    * @see MaoCartas
    **/
    //@Override
    public void descartar(){
        //
    }

    /**
     * Retorna a quantidade de cartas atual do jogador
     * @return Quantidade de cartas que o jogador possui atualmente
     */
    public int getQuantidadeCartas(){
        return this.maoJogador.getQuantidadeCartas();
    }

    /**
     * Realiza uma jogada a partir da analize da situação atual
     * da Roda do Jogo.
     * @see Roda
     * @see Jogo
     * @see Acao
     */
    public void realizarJogada(){

    }

    /**
     * Construtor que recebe um nome para o jogador e um objeto de MaoCartas
     * @see MaoCartas
     * @param nome
     * @param maoInicial
     */
    public Jogador(String nome, MaoCartas maoInicial){
        this.nome = nome.toLowerCase().trim();
        this.maoJogador = maoInicial;
    }

    /**
     * Construtor que recebe o nome do jogador
     * e inicializa uma maoJogador (objeto de MaoCartas) sem
     * nenhuma carta.
     * @param nome - Nome inicial do jogador
     * @see MaoCartas
     */
    public Jogador(String nome){
        this.nome = nome.toLowerCase().trim();
        this.inicializarMao();
    }

}
