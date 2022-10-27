package base.jogador;

import java.util.ArrayList;
import base.*;
import cartas.*;
import acao.*;


public class MaoCartas extends Baralho{
    private ArrayList<Carta> cartas;
    public static final short tamInicial = 7;
    
    /**
     * Realiza a inicialização do objeto de MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais de MaoCartas
     */
    private void inicializar(ArrayList<Carta> cartasIniciais){
        this.cartas = cartasIniciais;
    }

    /**
     * Realiza a adição de uma carta na lista de cartas
     * atuais no objeto de MaoCartas
     * @param carta - Carta a ser adicionada em MaoCartas
     */
    public void receberCarta(Carta carta){
        this.cartas.add(carta);
    }
    /**
     * Realiza a adição de uma lista de cartas na lista de cartas
     * interna de MaoCartas.
     * @param listaCartas - Lista de cartas a ser adicionada em MaoCartas
     */
    public void receberCartas(ArrayList<Carta> listaCartas){
        this.cartas.addAll(listaCartas);
    }
    /**
     * Retorna a quantidade atual de cartas na lista de cartas
     * de MaoCartas
     * @return
     */
    public int getQuantidadeCartas() {
        return this.cartas.size();
    }
    /**
     * Construtor que recebe uma lista inicial de cartas para
     * a MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais para MaoCartas
     */
    public MaoCartas(ArrayList<Carta> cartasIniciais){
        super(Baralho.NORMAL);
        this.inicializar(cartasIniciais);
    }
    /**
     * Construtor que retorna uma MaoCartas totalmente vazia
     * (sem cartas).
     */
    public MaoCartas(){
        super(Baralho.NORMAL);
    }

}