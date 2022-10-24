package acao;
import base.Roda;
/**
  * @author Pedro;
  * @version 2.0;
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

  public void realizar(Roda roda, int n) {
    return;
  }

  public void realizar () {
    return;
  }
  
  public void realizar (Roda roda, int n) {
    return;
  }
  
  /**
  * Função para retornar qual a ação da carta
  * @return String Inverter
  */

  public String getAcao(){
    return "Inverter";
  }

}
