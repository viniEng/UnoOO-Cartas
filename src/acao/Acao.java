package acao;
import base.Roda;

public abstract class Acao {
  /**
   * Função que serve para padronizar a forma dos métodos da ação.
   * Bloqueio pula o próximo jogador da roda.
   * Inverter reverte o sentido da roda.
   * @param roda
   */
  public abstract void realizar (Roda roda);
}

/**
 * @author Fernando Favaro Moreira
 * @since 26/10/2022
 * @version 4.0
 * @see Roda, Jogada
 */