package base.jogador;

/**
 * Subclasse da superclasse 'Jogador' que representa o jogador criado pelo grupo baralho
 * 
 * @author Jecelen Adriane Campos e Guilherme Bispo Cupertino. Grupo Baralho.
 *
 */
public class JogadorBaralho extends Jogador{
	/**
	 * Método construtor que recebe como parâmetro o nome do jogador que representa o grupo baralho.
	 * E também a jogada que será realizada pelo jogador.
	 * @param nome 
	 * @param jogadaRealizada
	 */
	public JogadorBaralho(String nome){
		super(nome);
		LOGGER.info("JogadorBaralho criado com sucesso\n");
	}
	
	public Jogada realizarJogada(Jogada jogadaRealizada){
		super(jogadaRealizada);
		LOGGER.info("Jogada do JogadorBaralho realizada\n");
		
	}
}
