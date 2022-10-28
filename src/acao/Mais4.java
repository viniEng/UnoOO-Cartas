package acao;
import java.util.Scanner;
import base.Roda;
import cartas.Carta;
//import cartas.*;
//import java.util.Scanner;
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
  public void realizar(Roda roda) { /**trocar função de void para Carta*/
    /**roda.mudarCor();*/
    /**Carta trocacor;
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
    LOGGER.info("Cor trocada");
    return trocacor;
    }
    */
    /** Precisamos conversar com outros integrantes para realizar mudanças nessa etapa de mudarCor*/
    roda.comprar(4, roda.jogadorDaVez()); /**indica a compra de quatro cartas para o jogador correspondente*/
    LOGGER.info("Jogador compra 4\n");
  }
}