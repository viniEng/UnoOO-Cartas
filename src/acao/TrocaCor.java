package acao;

import base.Jogada;

/**
 * @author Felippe, Fernando, Lucas Patrizi, Pedro Nicolette, Roberto, Vinicius
 * @version 1.0
 *          - O autor original dessa parte seria o Vinicius, porem faltou Luz na
 *          casa dele, assim não conseguiu efetivar as mudanças -
 *          - Logo, o grupo adianta sua parte para nao atrasar a correção/Cod.
 *          dos outros -
 *          - [Ninguem saira prejudicado, pois todo passo a passo sera explicado
 *          para o membro faltante] -
 */

public class TrocaCor extends Acao {
  /**
   * @deprecated
   * @param jogada representa objeto do tipo referente a classe Jogada
   *               Na função "realizar", supostamente deve utilizar
   *               "jogada.mudarCor", de forma que altere para a cor desejada
   */

  public void realizar(Jogada jogada) {
    jogada.mudarCor();
  }
}
