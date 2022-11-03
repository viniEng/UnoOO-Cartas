package base.jogador;

import java.util.ArrayList;
import base.*;
import cartas.*;
import acao.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MaoCartas extends Baralho{
    private static final Logger LOGGER = LoggerFactory.getLogger(MaoCartas.class);
    public static final short tamInicial = 7;
    
    /**
     * Construtor que recebe uma lista inicial de cartas para
     * a MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais para MaoCartas
     */
    public MaoCartas(ArrayList<Carta> cartasIniciais){
        super(Baralho.NORMAL);
        LOGGER.trace("Instanciando objeto de MaoCartas a partir de lista de cartas inicial");

        this.inicializar(cartasIniciais);
    }

    /**
     * Construtor que retorna uma MaoCartas totalmente vazia
     * (sem cartas).
     */
    public MaoCartas(){
        super(Baralho.NORMAL);
        LOGGER.trace("Instanciando objeto de MaoCartas com nenhuma carta");
    }

    /**
     * Realiza a inicialização do objeto de MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais de MaoCartas
     */
    private void inicializar(ArrayList<Carta> cartasIniciais){
        LOGGER.trace("Inicializando lista de cartas interna a partir de uma lista de cartas");

        cartas = cartasIniciais;
    }

    /**
     * Realiza a adição de uma lista de cartas na lista de cartas
     * interna de MaoCartas.
     * @param listaCartas - Lista de cartas a ser adicionada em MaoCartas
     */
    public void receberCartas(ArrayList<Carta> listaCartas){
        LOGGER.trace("Adicionando lista de cartas em lista de cartas interna");
        
        cartas.addAll(listaCartas);
    }


    /**
     * Retorna uma String que contem todas as cartas de MaoCartas
     * @return String com todas as cartas no objeto de MaoCartas
     * @see Carta
     */
    @Override
    public String toString(){
        String cartasEmString = "";
        for(Carta carta : this.cartas){
            cartasEmString=carta.toString()+"\n";
        }
        return cartasEmString;
    }

}