package acao;
import base.Roda;
import base.Jogada;
/**
 * @author RobertoFortes;
 * @version 2.0;
 */

public class Mais4 extends Acao {
/**
 * @deprecated
 * @param roda representa objeto do tipo referente a classe Roda que funciona de forma cíclica;
 * @param jogada representa objeto do tipo referente a classe Jogada;
 * @param n representa o inteiro que indica a quantidade de vezes que a carta Mais4 foi acumulada/repetida;
 * dentro da função realizar deve-se chamar, supostamente, "Jogada.mudarCor()";
 * Espera-se a junção de (jogador/jogada) e a implementação do seu código para execução mais precisa do código;
 * Agora, teremos que acumular os mais quatro e indicar o jogador que deverá comprar o respectivo número de cartas;
 * A primeira chamada de rodar.proximoJogador(retorna) significa a passagem de Acao para o proximo jogador;
 * ao final, chama-se a função "roda.pular()" para passar-se a vez para o jogador após o que comprou as cartas;
 */
  
  public String getAcao(){
    return "Mais4";
  }

  public void realizar(Roda roda, Jogada jogada, int n) {
    jogada.mudarCor(); /**  jogador 1 (ultimo a jogar a carta referente ao "Mais4") // espera-se mudança (jogada/jogador) */
    int x;
    x = roda.proximoJogador();  /** jogador 1 -> jogador 2 // a função retorna inteiro que identifica o jogador */
    for(int cont = 0; cont < n*4 ; cont++){
      roda.comprarCarta(roda.jogadores[x]); /** jogador 2 recebe cartas // acessa-se o jogador correspondente no vetor */
    }
    roda.pular(); /**  jogador 2 -> jogador 3 */
  }
  /**
  * foi adicionada a função getAcao tipo String;
  */
  

  /**
  Todas as funções a partir deste comentário são para evitar bugs e alertar sobre uso errado da cartaAção
  */
  public void realizar (Roda roda) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }
  public void realizar (Jogada jogada) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }
  public void realizar(Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }
}