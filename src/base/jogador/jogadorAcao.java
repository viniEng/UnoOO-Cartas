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
        1 - prox bot 1 carta - se possível lançar urgentemente carta de acumulo; (feito)
        2 - prox prox bot 1 carta - se possível não lançar carta de ação; (feito)
        3 - se só 2 cartas na mão priorizar carta sem cor; (feito)
        4 - Cartas sem cores possuem a menor prioridade; (feito)
        5 - Jogar as cartas da cor que o bot mais possue na mão; (feito)
     */
    public Carta defineCartaDaJogada()
    {
    	Carta ultimo = Jogo.roda.getUltimaCarta();
        ArrayList<Jogador> lJogadores = Jogo.roda.getJogadores();
        int[] lfreqCor = freqCor();
        Cor corFreq;
        int cont;
        if(lJogadores.get(Jogo.roda.getPosicaoAtual()+1).getQuantidadeCartas()==1){
            for(Carta c : this.getMaoJogador().getCartas())
    	    {
    		if(!(c instanceof CartaEspecialComCor))
    			continue;
    		
    		CartaEspecialComCor ca = (CartaEspecialComCor)c;
    		
    		// Verifica se é a mesma cor ou se é a mesma ação pra poder jogar
    		if(ca.getCor() == ultimo.getCor() || (ultimo instanceof CartaEspecialComCor && ca.getAcao() == ((CartaEspecialComCor)ultimo).getAcao()))
    		{
    		    	return ca;
    		}
    	    }
            for(Carta c : this.getMaoJogador().getCartas())
    	    {
                if(c instanceof CartaEspecialSemCor){

                    CartaEspecialSemCor ca = (CartaEspecialSemCor)c;
        
                            return ca;
                }
    		
    		}
    	}
        else if(this.getQuantidadeCartas()==2){
            for(Carta c:this.getMaoJogador().getCartas()){
                if(c instanceof CartaEspecialSemCor){
                    return c;
                }
            }
            for(cont=0;cont<4;cont++)
            {
                corFreq=maiorCor(lfreqCor);
            for(Carta c : this.getMaoJogador().getCartas())
                {
                    if(c.getCor()==ultimo.getCor()){
                        if(!(c instanceof CartaNormal))
                            continue;
                        
                        CartaNormal cn = (CartaNormal)c;
                        
                        // Se for a mesma cor pode jogar
                        if(cn.getCor() == ultimo.getCor())
                            return c;
                        
                        // Se for o mesmo número também pode jogar
                        if(ultimo instanceof CartaNormal && ((CartaNormal)ultimo).getNumero() == cn.getNumero())
                            return c;
                    }
                }
            for(cont=0;cont<4;cont++){
                corFreq=maiorCor(lfreqCor);
                for(Carta c:this.getMaoJogador().getCartas()){
                    if(c instanceof CartaEspecialComCor){
                        if(c.getCor()==corFreq){
                            if(c.getCor()==ultimo.getCor() || ultimo instanceof CartaEspecialComCor){
                                return c;
                            }
                        }
                    }
                }
            }
        }
    }
        else{
            for(cont=0;cont<4;cont++)
            {
                corFreq=maiorCor(lfreqCor);
            for(Carta c : this.getMaoJogador().getCartas())
                {
                    if(c.getCor()==ultimo.getCor()){
                        if(!(c instanceof CartaNormal))
                            continue;
                        
                        CartaNormal cn = (CartaNormal)c;
                        
                        // Se for a mesma cor pode jogar
                        if(cn.getCor() == ultimo.getCor())
                            return c;
                        
                        // Se for o mesmo número também pode jogar
                        if(ultimo instanceof CartaNormal && ((CartaNormal)ultimo).getNumero() == cn.getNumero())
                            return c;
                    }
                }
            for(cont=0;cont<4;cont++){
                corFreq=maiorCor(lfreqCor);
                for(Carta c:this.getMaoJogador().getCartas()){
                    if(c instanceof CartaEspecialComCor){
                        if(c.getCor()==corFreq){
                            if(c.getCor()==ultimo.getCor() || ultimo instanceof CartaEspecialComCor){
                                return c;
                            }
                        }
                    }
                }
            }
            for(Carta c:this.getMaoJogador().getCartas()){
                if(c instanceof CartaEspecialSemCor){
                    return c;
                }
            }
        }
    }
    	// Busca cartas normais
    	for(Carta c : this.getMaoJogador().getCartas())
    	{
    		if(!(c instanceof CartaNormal))
    			continue;
    		
    		CartaNormal cn = (CartaNormal)c;
    		
    		// Se for a mesma cor pode jogar
    		if(cn.getCor() == ultimo.getCor())
    			return c;
    		
    		// Se for o mesmo número também pode jogar
    		if(ultimo instanceof CartaNormal && ((CartaNormal)ultimo).getNumero() == cn.getNumero())
    			return c;
    	}
    	
    	// Busca +4 e troca cor
    	for(Carta c : this.getMaoJogador().getCartas())
    	{
    		if(!(c instanceof CartaEspecialSemCor))
    			continue;
    		
    		// +4 e troca cor pode ser jogado de qualquer forma
    		return c;
    	}
    	
    	// Se não conseguir jogar nenhuma tem que comprar
    	//return this.defineCartaDaJogada();
        return null;
    }
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
