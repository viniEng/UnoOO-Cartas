package base.jogador;
import java.util.ArrayList;

import acao.*;
import base.*;
import cartas.*;
import cartas.CartaNormal;

public class jogadorAcao extends Jogador{
    public jogadorAcao(String nome) {
        super(nome);
        this.inicializarMao();
    }
    public int[] freqCor(){
        int[] lsCor= new int[4];
        lsCor[0]=0;
        lsCor[1]=0;
        lsCor[2]=0;
        lsCor[3]=0;
        for(Carta c: this.getMaoJogador().getCartas()){
            if(c instanceof CartaComCor){
                if(c.getCor()==Cor.AMARELO){
                    lsCor[0]++;
                }
                else if(c.getCor()==Cor.AZUL){
                    lsCor[1]++;
                }
                else if(c.getCor()==Cor.VERDE){
                    lsCor[2]++;
                }
                else if(c.getCor()==Cor.VERMELHO){
                    lsCor[3]++;
                }
            }
        }
        return  lsCor;
    }
    public Cor maiorCor(int[] lsCor){
        lsCor=new int[4];
        int big=0;
        Cor cartasCor=null;
        if(big<lsCor[0]){
            big=lsCor[0];
            cartasCor=Cor.AMARELO;
        }
        else if(big<lsCor[1]){
            big=lsCor[1];
            cartasCor=Cor.AZUL;
        }
        else if(big<lsCor[2]){
            big=lsCor[2];
            cartasCor=Cor.VERMELHO;
        }
        else if(big<lsCor[3]){
            big=lsCor[3];
            cartasCor=Cor.VERDE;
        }
        //descoberta a maior cor
        if(cartasCor==Cor.AMARELO){
            lsCor[0]=0;
        }
        else if(cartasCor==Cor.AZUL){
            lsCor[1]=0;
        }
        else if(cartasCor==Cor.VERMELHO){
            lsCor[2]=0;
        }
        else if(cartasCor==Cor.VERDE){
            lsCor[3]=0;
        }
        return cartasCor;
    }
    public Carta defineCartaParaAcumulo(Acao acaoDoAcumulo){
        int[] lsCor = freqCor();
        Cor mCor;
        if(Jogo.roda.getUltimaCarta() instanceof CartaEspecialSemCor){
            for(Carta c : this.getMaoJogador().getCartas()){

                if(c instanceof CartaComAcao){
                    try{                    
                        if(c.getAcao() == acaoDoAcumulo)
                            return c;
                    }catch(CartaSemAcao e){
                        LOGGER.error("Erro ao tentar comparar ação de carta com ação de acúmulo: {}", e);
                    }
                }
            }
        }
        else{
            for(Carta c : this.getMaoJogador().getCartas()){
                for(int cont=0;cont<4;cont++){
                    mCor=maiorCor(lsCor);
                    if(c instanceof CartaComAcao && c.getCor()==mCor){
                        try{                    
                            if(c.getAcao() == acaoDoAcumulo)
                                return c;
                        }catch(CartaSemAcao e){
                            LOGGER.error("Erro ao tentar comparar ação de carta com ação de acúmulo: {}", e);
                        }
                    }
                }
            }
        }
        return null;
    }
    /*
        - Jogar as cartas da cor que o bot mais possue na mão
        - Cartas sem cores possuem a menor prioridade
        - Se possuir só uma carta de cor na mão, priorizar as sem cor
        - Se próximo jogador tiver apenas uma carta na mão, priorizar carta especial
     */
    
    public Cor sorteiaCor(){
        int[] lst;
        lst = freqCor();
        Cor maiorCor;
        maiorCor = maiorCor(lst);
        return maiorCor;
    }
}
    //defineCartaDaJogada();
    //escolhaCor();