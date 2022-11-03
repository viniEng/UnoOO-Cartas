package acao;
import base.Roda;
import cartas.Cor;
/**
 * @author Felippe
 * @Version 4.0
 */

public class Mais2 extends Acao {

/**
 * @param roda é um objeto da Classe Roda que é um vetor um ciclo (roda do jogo).
 * A função faz o proximo Jogador da roda comprar 2 cartas, 
 */
  public void comprar(Roda roda) {
    roda.comprar(2, roda.jogadorDaVez());
    LOGGER.info("2 cartas compradas\n");
    return;
  }

 /**
   * Função que serve para avançar para o próximo jogador
   * @param roda
   */
  public void pular(Roda roda){
    roda.pular();
    return; 
  }

  /**
   * @param roda
   * A função serve para alertar que o programados realizou um acesso indevido das funções
   */
  public void inverter(Roda roda){
    LOGGER.info("Mais2 não pode inverter\n");
    return;
  }

  /**
   * A função serve para alertar que o programados realizou um acesso indevido das funções
   */
  public Cor trocaCor(){
    LOGGER.info("Mais2 não troca cor\n");
    return Cor.SEMCOR;
  }

  @Override 
  public String toString(){
    return "MAIS2";
  }
}