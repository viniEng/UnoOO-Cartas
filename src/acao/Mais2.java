package acao;
import base.Roda;
import base.Jogada;
/**
 * @author Felippe
 * @Version 1.0
 */

public class Mais2 extends Acao {

/**
 * @param roda é um objeto da Classe Roda que é um vetor um ciclo (roda do jogo).
 * A função faz o proximo Jogador da roda comprar 2 cartas, após a compra o mesmo perde a vez,
 * pulando para o proximo jogador - roda.pular - 
 * 
 */

  public String getAcao(){
    return "Mais2";
  }

  public void relizar(Roda roda, int n) { 
    roda.comprar(n, roda.jogadores[roda.proximoJogador]);
    roda.pular(); 
  }
  public void realizar(Roda roda, int n) {
    return;
  }
  public void realizar (Jogada jogada) {
    return;
  }
  public void realizar (Jogada jogada, Roda roda, int n) {
    return;
  }
 
}
