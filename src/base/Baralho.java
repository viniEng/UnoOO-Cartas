package base;
import java.util.ArrayList;
import cartas.Carta;
import java.util.Collections;


/**
 * Representa a abstração de um conjunto de cartas
 * 
 * @author luciano.silva
 *
 */
public class Baralho {
	public static final boolean NORMAL = false;
	public static final boolean INICIAL = true;

	private ArrayList<Carta> cartas = new ArrayList<>();
	private boolean tipo;

	// private Carta[] baralho = new Carta[112];

	/**
	 * 
	 * @param tipo Baralho.INICIAL se for baralho inicial, ou Baralho.Normal para os
	 *             demais tipos de baralho.
	 */
	public Baralho(boolean tipo) {
		this.tipo = tipo;
		if (tipo == Baralho.INICIAL) {
			gerarCartas();
			embaralhar();
		}

	}

	/**
	 * Esse método somente será chamado quando o baralho criado for do tipo inicial.
	 */
	public void gerarCartas() {
		for (int i = 0; i < 2; i++){
        		for (int n = 0; n < 10; n++) {
          			cartas.add(new CartaNormal(cartas.Cor.AMARELO, n));
          			cartas.add(new CartaNormal(Cor.VERDE, n));
          			cartas.add(new CartaNormal(Cor.AZUL, n));
          			cartas.add(new CartaNormal(Cor.VERMELHO, n));
        		}
        	}

        	for(i=0; i<2; i++){
        		cartas.add(new CartaEspecialComCor(Cor.AMARELO, Carta.MAIS2));
    			cartas.add(new CartaEspecialComCor(Cor.AZUL, Carta.MAIS2));
    			cartas.add(new CartaEspecialComCor(Cor.VERDE, Carta.MAIS2));
    			cartas.add(new CartaEspecialComCor(Cor.VERMELHO, Carta.MAIS2));
	
        		cartas.add(new CartaEspecialComCor(Cor.AZUL, Carta.INVERTE));
        		cartas.add(new CartaEspecialComCor(Cor.AMARELO, Carta.INVERTE));
        		cartas.add(new CartaEspecialComCor(Cor.VERDE, Carta.INVERTE));
        		cartas.add(new CartaEspecialComCor(Cor.VERMELHO, Carta.INVERTE));
	
        		cartas.add(new CartaEspecialComCor(Cor.VERMELHO, Carta.BLOQ));
        		cartas.add(new CartaEspecialComCor(Cor.VERDE, Carta.BLOQ));
        		cartas.add(new CartaEspecialComCor(Cor.AZUL, Carta.BLOQ));
        		cartas.add(new cartas.CartaEspecialComCor(Carta.Cor.AMARELO, Carta.BLOQ));
      			}

      		for(i=0; i<4; i++){
      			cartas.add(new CartaEspecialSemCor(Carta.MAIS4));
      			cartas.add(new CartaEspecialSemCor(Carta.TROCACOR));
      			}
      }


	public void embaralhar() {
		Collections.shuffle(cartas);
	}


	/**
	 * 
	 * @return a primeira carta do baralho
	 */
	public Carta comprarCarta() {
		return this.cartas.remove(0);
	}

	/**
	 * 
	 * @param c
	 */
	public void receberCarta(Carta c) {
		this.cartas.add(c);
	}

	public int quantCarta() { // para verificar a quantidade de cartas
		return this.cartas.size();
		
	}

  	public Carta ultimaCarta() { // para verificar a última carta
  		Carta ultima = cartas.get(quantCarta()-1);
		System.out.println(ultima.getNumero() +" "+ultima.getCor()+" "+ultima.getAcao());
		return ultima;
		}

	/**
	 * @return the baralho
	 */
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	/**
	 * @param cartas the baralho to set
	 */
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	/**
	 * @return the tipo
	 */
	public boolean isTipo() {
		return tipo;
	}

}
