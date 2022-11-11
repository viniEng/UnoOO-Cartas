package base.jogador;

public class jogadorBaralho{
	protected String nome;
	protected MaoCartas maoJogador;

	public jogador(String nome){
		this.nome = nome;
		LOGGER.info("Jogador criado com sucesso\n");
	}
	public String getNome(){
		return nome;
	}
}