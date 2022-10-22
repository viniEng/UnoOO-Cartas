package cartas;


import acao.*;

/**
 * Representa a abstração de uma Carta com Cor, que na nossa abstração não ira conter ação
 * 
 * @author grupo Cartas
 *
 */
public abstract class CartaComCor extends Carta {
	
	
	
	@Override
	public final Acao getAcao() throws CartaSemAcao {
		throw new CartaSemAcao("Cartas com cor e número não possuem ação");
	}
	
	@Override
	public final void setAcao(Acao c) throws CartaSemAcao {
	   throw new CartaSemAcao("Cartas com cor e número não possuem ação");
	}
	
}

