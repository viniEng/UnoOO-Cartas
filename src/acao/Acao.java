package acao;
import base.Roda;
import base.Jogada;

abstract class Acao {
  /**
   * getAcao é uma função que descreve qual a ação a ser tomada, serve para padronizar a entrada de informação para outras funções.
   * @return 
   */
  abstract String getAcao();

  /**
   * Função que serve para padronizar a nomeação dos métodos para a função Mais2.
   * @param roda roda que nós usamos na função.
   * @param n valor de um inteiro n que representa o número de ações chamadas por um jogador; (é a quantidade de vezes que um jogador lança uma carta de ação à mesa).
   * @return
   */
  abstract void realizar (Roda roda, int n);

  /**
   * Função que serve para padronizar a nomeação dos métodos para a função Mais4.
   * @param jogada jogada atual do jogo que usamos na função para mudar a cor.
   * @param roda roda que nós usamos na função.
   * @param n valor de um inteiro n que representa o número de ações chamadas por um jogador; (é a quantidade de vezes que um jogador lança uma carta de ação à mesa).
   * @return
   */
  abstract void realizar (Jogada jogada, Roda roda, int n);

  /**
   * Função que serve para padronizar a forma dos métodos da ação de bloqueio e inverter.
   * @param roda
   */
  abstract void realizar (Roda roda);

  /**
   * Função que serve para padronizar a forma dos métodos da ação de troca de cor.
   * @deprecated
   * @param jogada
   */
  abstract void realizar (Jogada jogada);
}

/**
 * @author Fernando Favaro Moreira
 * @since 03/10/2022
 * @version 2.0
 * @see Roda, Jogada
 */