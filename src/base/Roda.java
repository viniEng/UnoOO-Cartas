package base;

import java.util.ArrayList;
import cartas.*;
public class Roda {
	Baralho compra;
	Baralho descarte = new Baralho(false);

            
	ArrayList<Jogador> jogadores = new ArrayList<>();

	private int sentido;

    private int posicaoAtual;
	/**
	 * 
	 * @param recebido
	 * @param jogadoresRecebidos
	 */
    public Roda(Baralho recebido, Jogador jogadoresRecebidos[]){
	  compra = recebido;
      for(int i = 0; i < jogadoresRecebidos.length; i++){
        this.jogadores.add(jogadoresRecebidos[i]);
      }
	 for(int i = 0; i < jogadores.size(); i ++){
         for(int j = 0; j < 7; j++){
		 //jogadores.get(i).adicionarCarta(comprarCartaRoda());
         }
	   }
	 do{
	   descarte.receberCarta(compra.comprarCarta());
	 }while(descarte.getCartas().get(descarte.quantCarta() - 1).getAcao() != "Esta carta não possui ação");
   }

  	/**
	   * 
	   * @param recebida
	   */
	public void descartarCarta(Carta recebida) {
	  descarte.receberCarta(recebida);
	}
  
	public void transformaDescarte() {
	
	}
	/**
	 * 
	 */
	public void inverter() {
        	sentido *= -1;
	}
	/**
	 * 
	 */
	public void pular() {
	  
	}
	/**
	 * 
	 */
	public void circular() {

	}
  
  
	/**
	 * 
	 */
	public Jogador proximoJogador() {
            return jogadores.get(posicaoAtual + 1);
	}
	/**
	 * 
	 * @param idJogador
	 */




  }
