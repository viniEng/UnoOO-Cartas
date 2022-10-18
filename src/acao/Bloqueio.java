package acao;

/**
 * @author Lucas Patrizi
 * @version 1.0
 * @since 03/10/22
 * @see Roda
 */
import base.Roda;

public class Bloqueio extends Acao {
  /**
   * @param roda - é a roda usada no próprio jogo
   * @return
   *         Pula a jogada de um jogador, usando a função pular da roda
   *         (roda.pular()), para o proximo jogador
   * 
   */
  public void realizar(Roda roda) {
    roda.pular();
  }
}