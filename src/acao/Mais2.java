package acao;
import base.Jogo;
import java.lang.System.Logger;
/**
 * @author Felippe
 * @Version 6.0
 */

public class Mais2 extends Acao {

  /**
   * A função vai ser chamada instantaneamente que blockeia/pula o proximo jogador
   */
  public void acaoInstantanea(){
    Jogo.roda.pular();
    LOGGER.info("Jogador pulado\n");
    return;
  }

  /**
   * @param roda é um objeto da Classe Roda que é um vetor um ciclo (roda do jogo).
   * A função faz o proximo Jogador da roda comprar 2 cartas.
   */
  public void acaoAcumulada(){
    Jogo.roda.comprar(2, Jogo.roda.jogadorDaVez());
    LOGGER.info("2 cartas compradas\n");
    return;
}
  
  @Override 
  public String toString(){
    return "MAIS2";
  }
}