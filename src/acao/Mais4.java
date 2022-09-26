package acao;
import base.Roda;
//import base.Jogada;

public class Mais4 extends Acao {
  public Mais4() {
  }

  public void compra4(Roda roda) {
    for(int cont = 0; cont<4 ; cont++){
    roda.comprarCarta(roda.proximoJogador());
    //Jogada.mudarCor();
  }
  roda.pular();
}
