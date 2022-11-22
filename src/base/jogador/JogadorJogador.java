package base.jogador;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cartas.*;

public class JogadorJogador extends Jogador{
    protected static final Logger LOGGER = LoggerFactory.getLogger(JogadorJogador.class);
    public JogadorJogador(String nome){
        super(nome);
    }
    @Override

    public Cor sorteiaCor(){
        LinkedHashMap <Cor, Integer> contaCor = new LinkedHashMap<Cor, Integer>();
        for(Carta carta : this.getMaoJogador().getCartas()){
            if(carta instanceof CartaComCor){
                int qtdAtualCor = (contaCor.get(carta.getCor()) != null ? contaCor.get(carta.getCor()) : 0);
                contaCor.put(carta.getCor(), qtdAtualCor+1);
            }
        }
        Map.Entry<Cor,Integer> maiorCor = null;
        for(Map.Entry<Cor,Integer> corAtual : contaCor.entrySet() ){
            if(maiorCor == null || corAtual.getValue() > maiorCor.getValue()){
                maiorCor = corAtual;
            }
        }
        Cor corEscolhida;
        if(maiorCor != null){
            corEscolhida = maiorCor.getKey();
        }else{
            corEscolhida = super.sorteiaCor();
        }
        LOGGER.info("Jogador {} escolheu trocar a cor para: {}", this.getNome(), corEscolhida.toString());
        return corEscolhida;
    }
    
}
