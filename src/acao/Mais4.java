package acao;
import java.lang.System.Logger;

import base.Jogo;
/**
 * @author RobertoFortes
 * @since 07/11/2022
 * @version 6.0
 */

public class Mais4 extends Acao {
/**
 * @deprecated
 * Resumo: A Roda ficou responsável de fazer a acumulação da quantidade de compras, logo, teremos a acaoInstantanea que deverá aplicar assim que chamada a troca de cor e pular a vez
 * e a função acaoAcumulada que representará a quantidade de cartas que devem ser compradas, que é +4.
 * Ressaltando que Roda criará o acúmulo
 */


 /**
  * 
 */
  public void acaoInstantanea() {
    Jogo.roda.mudarCor((Jogo.roda.jogadorDaVez()).sorteiaCor());
    LOGGER.info("Cor alterada\n");
    Jogo.roda.pular();
    LOGGER.info("Vez pulada\n");
    
  }

  /**
  * Função de compra
  */
    public void acaoAcumulada(){
    Jogo.roda.comprar(4, Jogo.roda.jogadorDaVez());
    LOGGER.info("4 cartas compradas\n");
    return;
  }

  @Override
  public String toString(){
    return "MAIS4";
  }
}