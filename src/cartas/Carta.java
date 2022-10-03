package cartas;

import acao.Acao;
import acao.Mais2;

public abstract class Carta {
	/**
	 * Trocar para ação
	 */
	public final static Acao MAIS2 = new Mais2();
	public final static String MAIS4 = "+4";
	public final static String BLOQ = "bloqueio";
	public final static String INVERTE = "reverso";
	public final static String TROCACOR = "trocaCor";

	private Cor cor;

	private int numero;
	private String acao;

	public abstract Cor getCor();

	public abstract String getAcao();

	/**
	 * 
	 * @return
	 * @throws CartaSemNumero
	 */
	public abstract int getNumero() throws CartaSemNumero;

	public abstract void setCor(Cor c);

	public abstract void setAcao(String ac);

	public abstract void setNumero(int n) throws CartaSemNumero;

	@Override
	public String toString() {
		
		String carta;
		if (this.cor == null) {
			carta = "CESC: " + this.acao;
		} else if (this.acao == null) {
			carta = "CNCC: " + this.numero + " " + this.cor;
		} else {
			carta = "CECC: " + this.acao + " " + this.cor;
		}
		return carta;
	}
}
