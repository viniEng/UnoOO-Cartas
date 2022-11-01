package acao;
import base.Roda;
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
    LOGGER.info("Direção invertida");
  }

  @Override

  public String toString(){
    return "INVERTER";
  }

}