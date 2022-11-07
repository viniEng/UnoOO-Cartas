package base.jogador;

public enum Jogada{

    DESCARTAR, COMPRAR, COMPRAR_ACUMULADO;

}

//Deprecated
// import java.util.ArrayList;

// import cartas.Carta;

// public interface Jogada{

//     // Descrição Antiga >>> jogada de compra: caso o jogador não detiver de nenhuma carta que combine com a que está na 
//     // mesa, ou outro jogador anterior lançar uma das cartas especiais (+2 ou +4), deve ser retirado uma 
//     // carta do baralho de compra e adicionada ao baralho do jogador em questão.

//     /**
//     *
//     * Compra uma lista de cartas, adicionando-as a maoJogador
//     * @see MaoCartas
//     **/
//     public void comprar(ArrayList<Carta> listaCartas);

//     /**
//     *
//     * Compra uma carta, adicionando uma carta a maoJogador,
//     * @see MaoCartas
//     **/
//     public void comprar(Carta carta);
    
//     // Descrição Antiga >>> jogada de descarte: caso o jogador detiver de alguma carta que combine com a que foi jogada 
//     // anteriormente, a carta deve ser selecionada e retirada do baralho do jogador e colocada no baralho 
//     // de descarte, caso o jogador detiver de mais uma carta que combine com a da mesa, ele deve 
//     // selecionar um das duas.
//      /**
//     *
//     * Descarta uma carta, retirando uma carta de maoJogador,
//     * adicionando-a ao monte de descarte
//     * @see MaoCartas
//     **/
//     public void descartar();
    
//     /**
//      * Realiza uma jogada a partir da análise da situação atual
//      * da Roda do Jogo. A função busca uma carta adequada para ser
//      * jogada. Se encontra uma carta adequada, ele a descarta e, caso
//      * a carta possua uma Ação, ele a 'realiza'. Se não encontra
//      * nenhuma carta adequada, o jogador adquire uma carta, adiciona
//      * ela em sua MaoCartas, e 'passa a vez'.
//      * @see Roda
//      * @see Jogo
//      * @see Acao
//      * @see Carta
//      * @see MaoCartas
//      */
//     public void realizarJogada();

// }