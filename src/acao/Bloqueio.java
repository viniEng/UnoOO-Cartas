package Acao;
import base.Roda;

public class Bloqueio extends Acao {
  public Bloqueio() {
  }

  public void block(Roda roda) {
    roda.proximoJogador();
  }
}