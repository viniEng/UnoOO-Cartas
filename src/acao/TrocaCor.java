package acao;
import base.Roda;
import base.Jogada;
/**
 * @author Vinicius 
 * @version 2.0
 * - O autor original dessa parte seria o Vinicius, porem  faltou Luz na casa dele, assim não conseguiu efetivar as mudanças  -
 * - Logo, o grupo adianta sua parte para nao atrasar a correção/Cod. dos outros -
 * - [Ninguem saira prejudicado, pois todo passo a passo sera explicado para o membro faltante] -
 */

public class TrocaCor extends Acao {
  /**
   * @deprecated 
   * @param jogada representa objeto do tipo referente a classe Jogada
   * Na função "realizar", supostamente deve utilizar "jogada.mudarCor", de forma que altere para a cor desejada  
   */

  public void realizar(Jogada jogada) {
    jogada.mudarCor();
  }
  public String getAcao(){
    return "TrocaCor";
  }
  public void realizar (Roda roda) {
    return;
  }
  public void realizar(Roda roda, int n) {
    return;
  }
  public void realizar (Jogada jogada, Roda roda, int n) {
    return;
  }
}
