package acao;
import base.Roda;
import cartas.Cor;
/**
 * @author Lucas Patrizi
 * @version 4.0
 * @since 31/10/22
 * @see Roda
 */

public class Bloqueio extends Acao {
  /**
   * Pula a jogada de um jogador, usando a função pular da roda
   * (roda.pular())
   * 
   * @param roda - é a roda usada no próprio jogo
   * @return
   * 
   */
  public void pular(Roda roda) {
    roda.pular();
    LOGGER.info("Jogador pulado\n");
    return;
  }

  /**
   * Informar acesso indevido de função
   * @param roda
   */
  public void inverter (Roda roda){
    LOGGER.info("Bloqueio não pode inverter\n");
    return;
  }

  /**
   * Informar acesso indevido de função
   * @param roda
   */
  public void comprar (Roda roda){
    LOGGER.info("Bloqueio não pode comprar\n");
    return;
  }

  /**
   * Informar acesso indevido de função
   * @return Cor SEMCOR
   */
  public abstract Cor trocaCor (){
    LOGGER.info("Bloqueio não pode trocar cor\n");
    return Cor.SEMCOR;
  }

  @Override
  public String toString(){
    return "BLOQUEIO";
  }
}