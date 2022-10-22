package cartas;

import acao.*;

/**
 * Representa a abstração de uma Carta Especial com Cor
 * 
 * @author grupo Cartas
 *
 */
public class CartaEspecialComCor extends CartaComAcao {
	
	
	private Acao acao;
	private Cor cor;
	

	/**
	 * 
	 * @param c do tipo Cor
	 * @param ac do tipo Acao
	 */



	 public CartaEspecialComCor (){

	 }


	public CartaEspecialComCor(Cor c, Acao ac){
		
		this.cor = c;
		this.acao = ac;
	}





	@Override
	public Acao getAcao() {
		return this.acao;
	}

	@Override
	public void setCor(Cor c) {
		this.cor = c;
	}

	@Override
	public void setAcao(Acao ac) {
		this.acao = ac;
	}

	@Override
	public Cor getCor(){
		return this.cor;
	}




}
