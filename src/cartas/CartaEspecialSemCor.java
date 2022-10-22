package cartas;

import acao.*;

/**
 * Representa a abstração de uma Carta Especial Sem Cor
 * 
 * @author grupo Cartas
 *
 */
public class CartaEspecialSemCor extends CartaComAcao {
	
	private Acao ac;



	public CartaEspecialSemCor (){

	}

	public CartaEspecialSemCor(Acao ac){
		this.acao = ac;
	}

	@Override
	public Acao getAcao()  {
		return this.acao;
	}
	
	@Override
	public void setAcao(Acao ac)  {
		this.acao = ac;
	}
	@Override public final void setCor(Cor c){
		return;
	}


	/**
	 * 
	 * @param ac do tipo Acao
	 */
	@Override
	public Cor getCor() {
		return Cor.SEMCOR;
	}
}
