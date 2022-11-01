package acao;
import base.Roda;
/**
 * @author Lucas Patrizi
 * @version 4.0
 * @since 03/10/22
 * @see Roda
 */

public class Bloqueio extends Acao {
  /**
   * Pula a jogada de um jogador, usando a função pular da roda
   * (roda.pular()), para o proximo jogador
   * 
   * @param roda - é a roda usada no próprio jogo
   * @return
   * 
   */
  public void pular(Roda roda) {
    roda.pular();
    LOGGER.info("Jogador pulado\n");
  }
  @Override

  public String toString(){
    return "BLOQUEIO";
  }
}