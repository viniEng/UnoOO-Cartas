package acao;
import base.Roda;

public class Mais2 extends Acao {

  public Mais2() {
  }

  public void Soma(Roda roda) {
    for(int cont = 0; cont<2 ; cont++){
    roda.comprarCarta(roda.proximoJogador());
    
  }
  roda.pular();
}
