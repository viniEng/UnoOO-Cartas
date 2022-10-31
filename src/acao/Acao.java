package acao;
import base.Roda;
import base.SimulUnoOO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Acao {
  protected static final Logger LOGGER = LoggerFactory.getLogger(Acao.class);
  /**
   * Função que serve para padronizar a forma dos métodos da ação.
   * Bloqueio pula o próximo jogador da roda.
   * Inverter reverte o sentido da roda.
   * @param roda
   */
  public abstract void realizar (Roda roda);
  /**
   * Função que serve para padronizar metódos de cartas especiais sem cor (+4, troca cor)
   * @param roda
   * @return Carta
   */
  //public abstract void Carta (Roda roda);
}

/**
 * @author Fernando Favaro Moreira
 * @since 26/10/2022
 * @version 4.0
 * @see Roda, Jogada
 */