package acao;
import base.Roda;
/**
 * @author RobertoFortes
 * @since 17/10/2022
 * @version 4.0
 */

public class Mais4 extends Acao {
/**
 * @deprecated
 * @param roda representa objeto do tipo referente a classe Roda que funciona de forma cíclica
 */


 /**
 * Resumo: O jogo ficou responsável de fazer a acumulação da quantidade de compras
 */
  public void realizar(Roda roda) {
    /**roda.mudarCor();*/ 
    /** Precisamos conversar com outros integrantes para realizar mudanças nessa etapa de mudarCor*/
    roda.comprar(4, roda.jogadorDaVez()); /**indica a compra de quatro cartas para o jogador correspondente*/
  }
}