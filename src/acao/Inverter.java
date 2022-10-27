package acao;
import base.Roda;
/**
  * @author Pedro;
  * @version 5.0;
  */

public class Inverter extends Acao {
 /**
  * @deprecated;
  * Função para inverter o sentido do jogo;
  * @param Roda representa objeto referente a classe Roda;
  * recebe o sentido e inverte, retornando a jogada para o jogador anterior;
  */

  public void realizar(Roda roda) {
    roda.inverter();
  }

  

}
