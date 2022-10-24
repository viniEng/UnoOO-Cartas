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
   * Função que fará o próximo jogador comprar +2 cartas n vezes, onde n representa a quantidade de acúmulos de +2 feitos nas jogadas anteriores; Serve para padronizar a nomeação dos métodos para a função Mais2.
   * @param roda roda que nós usamos na função.
   * @param n representa o número de ações chamadas por um jogador; (é a quantidade de vezes que um jogador lança uma carta de ação à mesa).
   * @return
   */
  abstract void realizar (Roda roda, int n);

  /**
   * Função que fará o jogador atual escolher uma cor para substituir a cor original da carta, e depois fará o próximo jogador comprar +4 cartas n vezes, onde n representa a quantidade de acúmulos de +4 feitos nas jogadas anteriores; Serve para padronizar a nomeação dos métodos para a função Mais4.
   * @param jogada jogada atual do jogo; Usamos na função para mudar a cor.
   * @param roda roda que nós usamos na função.
   * @param n representa o número de ações chamadas por um jogador; (é a quantidade de vezes que um jogador lança uma carta de ação à mesa).
   * @return
   */
  abstract void realizar (Jogada jogada, Roda roda, int n);

  /**
   * Função que serve para padronizar a forma dos métodos da ação de bloqueio e inverter.
   * Bloqueio pula o próximo jogador da roda.
   * Inverter reverte o sentido da roda.
   * @param roda
   */
  abstract void realizar (Roda roda);

  /**
   * Função que fará o jogador atual escolher uma cor para substituir a cor original da carta; Serve para padronizar a forma dos métodos da ação de troca de cor.
   * @deprecated
   * @param jogada
   */
  abstract void realizar (Jogada jogada);
}

/**
 * @author Fernando Favaro Moreira
 * @since 17/10/2022
 * @version 3.0
 * @see Roda, Jogada
 */