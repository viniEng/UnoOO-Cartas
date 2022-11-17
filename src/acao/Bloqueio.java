package acao;
import java.lang.System.Logger;
import base.Jogo;
/**
 * @author Lucas Patrizi
 * @version 5.0
 * @since 07/11/22
 * @see Roda
 */

public class Bloqueio extends Acao {
  /**
   * Ação que será chamada e vai instantaneamente bloquear o próximo jogador.
   * @param roda - é a roda usada no próprio jogo
   * @return
   * 
   */
  public void acaoInstantanea(){
    Jogo.roda.pular();
    LOGGER.info("Jogador pulado\n");
    return;
  }
  /**
   * 
   */
  public void acaoAcumulada(){
    LOGGER.info("Um bloqueio não pode acumular\n");
    return;
  }

  @Override
  public String toString(){
    return "BLOQUEIO";
  }

}