package acao;

import base.Roda;

/**
 * @author Pedro;
 * @version 1.0;
 */

public class Inverter extends Acao {
  /**
   * @deprecated;
   * Função para inverter o sentido do jogo;
   * 
   * @param Roda representa objeto referente a classe Roda;
   *             recebe o sentido e inverte, retornando a jogada para o jogador
   *             anterior;
   *             pode ser cumulativo, invertendo-se varias vezes o sentido e
   *             passando a jogada
   *             para o jogador resultante das constantes trocas;
   * 
   */

  public void realizar(Roda roda) {
    roda.inverter();
  }
}
