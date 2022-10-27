package acao;
import base.Roda;
/**
 * @author Felippe
 * @Version 2.0
 */

public class Mais2 extends Acao {

/**
 * @param roda é um objeto da Classe Roda que é um vetor um ciclo (roda do jogo).
 * A função faz o proximo Jogador da roda comprar 2 cartas,
 * 
 */

  public void realizar (Roda roda) {
    roda.comprar(2, roda.jogadorDaVez());
    return;
  }
}