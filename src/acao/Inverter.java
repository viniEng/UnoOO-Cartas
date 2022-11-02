package acao;
import base.Roda;
import cartas.Cor;

/**
  * @author Pedro;
  * @version 5.1;
  */

public class Inverter extends Acao {
 /**
  * @deprecated;
  * Função para inverter o sentido do jogo;
  * @param Roda representa objeto referente a classe Roda;
  * recebe o sentido e inverte, retornando a jogada para o jogador anterior;
  */

  public void inverter(Roda roda) {
    roda.inverter();
    LOGGER.info("Direção invertida\n");
  }

  /**
   * Informar uso incorreto da função
   * @param roda
   */
  public void comprar (Roda roda){
    LOGGER.info("Inverter não pode comprar\n");
    return;
  }

  /**
   * Informar uso incorreto da função
   * @param roda
   */
  public void pular (Roda roda){
    LOGGER.info("Inverter não pode pular\n");
    return;
  }

  /**
   * Informar uso incorreto da função
   * @param roda
   */
  public Cor trocaCor (){
    LOGGER.info("Inverter não pode trocar cor\n");
    return Cor.SEMCOR;
  }


  @Override

  public String toString(){
    return "INVERTER";
  }

}