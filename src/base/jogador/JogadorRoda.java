package base.jogador;
import base.Jogo;
import cartas.Carta;

public class JogadorRoda extends Jogador {
    public JogadorRoda(String nome){
        super(nome);
    }

    @Override
    public Jogada realizarJogada(){
        LOGGER.trace("Jogador {} realizando jogada", this.getNome());
        Carta carta = null;
        Jogada jogadaRealizada = null;

        if(Jogo.roda.temAcumulo()){
            
        }
        return null;
    }
}

