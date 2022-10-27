package base.jogador;

import java.util.ArrayList;
import base.*;
import cartas.*;

public class Jogador implements Jogada{

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
        this.nome = nome;
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
    * Compra n cartas, adicionando as cartas na MaoJogador
    * @deprecated - deve ser consultado futaramente com Jogo, ou Roda.
    **/
    @Override
    public void comprar(int quant){
        for(int i = 0; i<quant; i++){
            //maojogador.add(carta do topo do monte de compras)
            // Retirar carta do topo do monte de compras
        }
    }
        /**
    *
    * Compra uma carta, adicionando uma carta a MaoJogador,
    *
    **/
    public void comprar(Carta carta){
        
    }
     /**
    *
    * Descarta uma carta, retirando uma carta a MaoJogador,
    * adicionando-a ao monte de descarte
    *
    **/
    @Override
    public void descartar(){
        //
    }
    /**
     * Retorna a quantidade de cartas atual do jogador
     * @return Quantidade de cartas que o jogador possui atualmente
     */
    public int getQuantidadeCartas(){
        return 0;
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
