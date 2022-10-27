package acao;
import base.Roda;
/
 * @author Vinicius 
 * @version 3.5
 * @since 26/10/2022
 */

public class TrocaCor extends Acao {
  /
   * @deprecated 
   *
   *
   * Na função "realizar", supostamente deve utilizar "jogada.mudarCor", de forma que altere para a cor desejada
   /

  public void realizar() {
    //.mudarCor(); /** jogador atual irá escolher para qual cor deseja alterar (apenas exemplo, provavelmente está errado e será modificado)/ 
  }
  public void realizar (Roda roda) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }
}