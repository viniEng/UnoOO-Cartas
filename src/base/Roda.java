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
	 * Método construtor: Recebe um objeto do tipo baralho, e uma lista de objetos do tipo Jogador.
     * Cria o "monte de compra" e determina uma sequência para os jogadores
     * Distribui sete cartas para cada jogador.
     * Define a primeira carta do monte de descarte para que o jogo possa ser de fato inicializado.
     * Verifica se a primeria carta do monte de descarte é numérica e com cor.
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
		 //jogadores.get(i).adicionarCarta(comprarCarta());
         }
	   }
	 do{
	   descarte.receberCarta(compra.comprarCarta());
	 }while(descarte.getCartas().get(descarte.quantCarta() - 1).getAcao() != "Esta carta não possui ação");
   }

  	/**
	   * Recebe uma carta e a insere no monte de descarte.
	   * @param recebida
	   */
	public void descartarCarta(Carta recebida) {
	  descarte.receberCarta(recebida);
	}
  
    public Carta entregarCarta(){
        if(compra.size() < 1){
            transformaDescarte();
        }
        return compra.comprarCarta();
    }


	public void transformaDescarte() {
        for(int i = 0; i < desarte.size()-1; i++){
            compra.receberCarta(descarte.comprarCarta());
        }
        compra.embaralhar();
	}



	/**
	 * Altera o sentido do jogo(horário e anti-horário)
	 */
	public void inverter() {
        sentido *= -1;
	}



	/**
     * Retorna o índice do próximo jogador e verifica se a posição atual não extrapola o tamanho do vetor de jogadores
     * @param i
     * @return
     */
	public int proximo(int i) {
      int x = i + sentido;  
      if(x > jogadores.size()){
          x = x - jogadores.size();
      }
      if(x < 0){
          x = x + jogadores.size();
      }
      return x;
	}

    /**
     * Método chamado pela classe ação para informar que pulou um jogador
     */
    public void pular(){
        sentido *= 2;
    }

  
	/**
     * Recebe um jogador, e determina sua posição na roda
     * @param jogadorRecebido
     * @return
     */
	public Jogador proximoJogador(Jogador jogadorRecebido) {
        int i = 0;
        while(jogadorRecebido != jogadores.get(i)){
            i++;
        } 
        i = proximo(i);
        if(sentido % 2 == 0){
            sentido /= 2;
        }
        return jogadores.get(i);   
    }

    //Perguntar par ao professor qual é a classe responsável pelo acúmulo de cartas que devem ser compradas
  }
