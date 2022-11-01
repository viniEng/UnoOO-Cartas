package acao;
import base.Roda;
import cartas.*;
import java.util.Scanner;
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
   * Função recebe uma cor que deseja alterar e retorna ela
   */
  public Cor trocaCor () { // 
  
    Scanner sc;
    String resposta;
    sc= new Scanner(System.in);

    System.out.println("Que cor?");
    resposta=sc.nextLine();
    resposta=resposta.toUpperCase();

    if(resposta=="AMARELO"){
      trocacor.setCor(Cor.AMARELO);
      LOGGER.info("Cor trocada \n");
      return Cor.AMARELO;
    }
    else if(resposta=="AZUL"){
      trocacor.setCor(Cor.AZUL);
      LOGGER.info("Cor trocada \n");
      return Cor.AZUL;
    }
    else if(resposta=="VERMELHO"){
      trocacor.setCor(Cor.VERMELHO);
      LOGGER.info("Cor trocada \n");
      return Cor.VERMELHO;
    }
    else if(resposta=="VERDE"){
      trocacor.setCor(Cor.VERDE);
      LOGGER.info("Cor trocada\n");
      return Cor.VERDE;
    }
    else{
      LOGGER.info("Essa cor não existe");
      return Cor.SEMCOR
    }
    
  }
  public void pular (Roda roda){
    LOGGER.info("TrocaCor não pode pular a vez");
   }

  public void inverter (Roda roda){
    LOGGER.info("TrocaCor não pode inverter");
   }
  
  public void comprar (Roda roda){
    LOGGER.info("TrocaCor não pode comprar");
  }

  @Override
  public String toString(){
    return "TROCACOR";
  }
}