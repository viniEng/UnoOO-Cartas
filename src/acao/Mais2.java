package acao;

import base.Roda;

/**
 * @author Felippe
 * @Version 1.0
 * 
 * 
 */

public class Mais2 extends Acao {

  /**
   * @param roda é um objeto da Classe Roda que é um vetor um ciclo (roda do
   *             jogo).
   *             A função faz o proximo Jogador da roda comprar 2 cartas, após a
   *             compra o mesmo perde a vez,
   *             pulando para o proximo jogador - roda.pular -
   * 
   */

  public void relizar(Roda roda) {
    for (int cont = 0; cont < 2; cont++) {
      roda.comprarCarta(roda.proximoJogador());
    }

    roda.pular();

  }
}
