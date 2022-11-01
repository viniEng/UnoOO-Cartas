package acao;
import base.Roda;
import cartas.*;
import base.SimulUnoOO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Acao {
  protected static final Logger LOGGER = LoggerFactory.getLogger(Acao.class);

  /**
   * Função que serve para avançar para o próximo jogador
   * @param roda
   */
  public abstract void pular (Roda roda);

  /**
   * Função que serve para inverter o sentido da roda
   * @param roda
   */
  public abstract void inverter (Roda roda);

  /**
   * Função que serve para adicionar n cartas do monte à mão do jogador
   * @param roda
   */
  public abstract void comprar (Roda roda);

  /**
   * Função que serve para trocar a cor de uma carta pela cor escolhida pelo jogador
   * @return Cor - cor escolhida pelo jogador
   */
  public abstract Cor trocaCor ();
}

/**
 * @author Fernando Favaro Moreira
 * @since 31/10/2022
 * @version 5.0
 * @see Roda, Jogada
 */