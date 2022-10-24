package acao;
import base.Roda;
import base.Jogada;
/**
 * @author RobertoFortes
 * @since 17/10/2022
 * @version 3.0
 */

public class Mais4 extends Acao {
/**
 * @deprecated
 * @param roda representa objeto do tipo referente a classe Roda que funciona de forma cíclica
 * @param n variável usada para marcar o acúmulo total de cartas +4
 */


 /**
 * Resumo: O primeiro jogador muda a cor, o segundo compra as cartas e se passa a jogada para um terceiro jogador
 */
  public void realizar(Roda roda, int n) {
    //.mudarCor(); /** Precisamos conversar com outros integrantes para realizar mudanças nessa etapa (apenas exemplo, provavelmente está errado e será modificado)*/
    int x;
    x = roda.proximoJogador();  /** jogador 1 -> jogador 2 --- a função retorna inteiro que identifica o jogador */
    for (int cont = 0; cont < n ; cont++) {
      roda.comprar(n*4, jogadorDaVez()); /** jogador 2 recebe cartas --- acessa-se o jogador correspondente no vetor */
    }
    roda.pular(); /**  jogador 2 -> jogador 3 */
  }

  /**
  * foi adicionada a função getAcao tipo String
  */
  public String getAcao(){
    return "Mais4";
  }

  /**
  Todas as funções a partir deste comentário são para evitar bugs e alertar sobre uso errado da cartaAção
  */

    /**
   * @param roda
   */
  public void realizar (Roda roda) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }

  /**
   * @param jogada
   */
  public void realizar () {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }

  /**
   * @param roda
   * @param n
   */
  public void realizar(Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }
  
  /**
   * @param jogada
   * @param roda
   * @param n
   */
  void realizar(Roda roda, int n) {
    
  }


}