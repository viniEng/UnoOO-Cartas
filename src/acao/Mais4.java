package acao;

import base.Roda;
import base.Jogada;

/**
 * @author RobertoFortes;
 * @version 1.0;
 */

public class Mais4 extends Acao {
/**
 * @deprecated
 * @param roda representa objeto do tipo referente a classe Roda que funciona de forma cíclica;
 * @param jogada representa objeto do tipo referente a classe Jogada;
 * dentro da função realizar deve-se chamar, supostamente, "Jogada.mudarCor()";
 * pode-se também buscar implementar a função "comprarCarta", contabilizando a quantidade de repetições de mais4;
 * ao final, chama-se a função "roda.pular()" para pular a vez de quem comprou as cartas;
 * 
 */
  public void realizar(Roda roda, Jogada jogada) {
    for(int cont = 0; cont<4 ; cont++){
    roda.comprarCarta(roda.proximoJogador());
    roda.pular();
    jogada.mudarCor();
  }
}
