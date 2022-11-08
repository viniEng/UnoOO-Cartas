package acao;
import base.Jogo;
import java.lang.System.Logger;
/**
 * @author Vinicius 
 * @version 4.0
 * @since 07/11/2022
 */

public class TrocaCor extends Acao {
  /**
   * @deprecated 
   *
   *
   * Função recebe uma cor que deseja alterar e retorna ela
   */
   public void acaoInstantanea() { /**Trocar função void para Cor*/
    Jogo.roda.trocarCor(Jogo.roda.jogadorDaVez().sorteiaCor());
    LOGGER.info("Cor trocada\n");
    return;
  }

  /**
  * @param roda
  * Função de compra
  */
    public void acaoAcumulada(){
    LOGGER.info("Troca Cor não realiza ações acumuladas\n");
    return;
  }
  @Override
  public String toString(){
    return "TROCACOR";
  }
}