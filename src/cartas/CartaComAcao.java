package cartas;

public abstract class CartaComAcao extends Carta {

	// Acao do tipo Acao que vai vir do Grupo Ação:
	// Muda desde Carta ou altera apenas aqui ?

	@Override
	public final int getNumero() throws CartaSemNumero {
		// Dar um jeito de tratar essa retorno
		throw new CartaSemNumero("Cartas de Ação não possuem número");
	}

	@Override
	public final void setNumero(int n) throws CartaSemNumero {
		throw new CartaSemNumero("Cartas de Ação não possuem número");
	}
}
