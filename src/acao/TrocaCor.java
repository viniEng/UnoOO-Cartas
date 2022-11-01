package acao;
import base.Roda;
//import cartas.Cor;
//import java.util.Scanner;
/**
 * @author Vinicius 
 * @version 3.5
 * @since 26/10/2022
 */

public class TrocaCor extends Acao {
  /**
   * @deprecated 
   *
   *
   * Função realizar que ira pegar um clone de cor do troca cor e alterar sua cor
   */
  public void realizar (Roda roda) { // trocar função de void para Carta
  /**
    Carta trocacor;
    Scanner sc;
    String resposta;
    sc= new Scanner(System.in);
    trocacor=roda.getUltimaCarta();
    System.out.println("Que cor?");
    resposta=sc.nextLine();
    resposta=resposta.toUpperCase();
    while(true){
     if(resposta=="AMARELO"){
       trocacor.setCor(Cor.AMARELO);
       break;
      }
      else if(resposta=="AZUL"){
        trocacor.setCor(Cor.AZUL);
        break;
      }
     else if(resposta=="VERMELHO"){
       trocacor.setCor(Cor.VERMELHO);
       break;
     }
      else if(resposta=="VERDE"){
        trocacor.setCor(Cor.VERDE);
        break;
      }
      else{
        System.out.println("Essa cor não existe");
      }
    }
    LOGGER.info("Cor trocada\n");
    return trocacor;
  */
  }
}