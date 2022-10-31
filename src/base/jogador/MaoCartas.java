package base.jogador;

import java.util.ArrayList;
import base.*;
import cartas.*;
import acao.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MaoCartas extends Baralho{
    private static final Logger LOGGER = LoggerFactory.getLogger(MaoCartas.class);
    private ArrayList<Carta> cartas;
    public static final short tamInicial = 7;
    
    /**
     * Construtor que recebe uma lista inicial de cartas para
     * a MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais para MaoCartas
     */
    public MaoCartas(ArrayList<Carta> cartasIniciais){
        super(Baralho.NORMAL);
        LOGGER.info("Instanciando objeto de MaoCartas a partir de lista de cartas inicial");

        this.inicializar(cartasIniciais);
    }

    /**
     * Construtor que retorna uma MaoCartas totalmente vazia
     * (sem cartas).
     */
    public MaoCartas(){
        super(Baralho.NORMAL);
        LOGGER.info("Instanciando objeto de MaoCartas com nenhuma carta");
        
        this.cartas = new ArrayList<>();
    }

    /**
     * Retorna a quantidade atual de cartas na lista de cartas
     * de MaoCartas
     * @return
     */
    public int getQuantidadeCartas() {
        LOGGER.info("Retornando quantidade de cartas em lista de cartas interna");

        return this.cartas.size();
    }

    /**
     * Realiza a inicialização do objeto de MaoCartas
     * @param cartasIniciais - Lista de cartas iniciais de MaoCartas
     */
    private void inicializar(ArrayList<Carta> cartasIniciais){
        LOGGER.info("Inicializando lista de cartas interna a partir de uma lista de cartas");

        this.cartas = cartasIniciais;
    }

    /**
     * Realiza a adição de uma carta na lista de cartas
     * atuais no objeto de MaoCartas
     * @param carta - Carta a ser adicionada em MaoCartas
     */
    public void receberCarta(Carta carta){
        LOGGER.info("Adicionando carta em lista de cartas interna");

        this.cartas.add(carta);
    }

    /**
     * Realiza a adição de uma lista de cartas na lista de cartas
     * interna de MaoCartas.
     * @param listaCartas - Lista de cartas a ser adicionada em MaoCartas
     */
    public void receberCartas(ArrayList<Carta> listaCartas){
        LOGGER.info("Adicionando lista de cartas em lista de cartas interna");
        
        this.cartas.addAll(listaCartas);
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