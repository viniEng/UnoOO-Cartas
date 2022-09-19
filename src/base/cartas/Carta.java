package cartas;

public class Carta {
	public final static String MAIS2 = "+2";
	public final static String MAIS4 = "+4";
	public final static String BLOQ = "bloqueio";
	public final static String INVERTE = "reverso";
	public final static String TROCACOR = "trocaCor";
	
	public final static String AZUL = "azul";
	public final static String AMARELO = "amarelo";
	public final static String VERMELHO = "vermelho";
	public final static String VERDE = "verde";
	
	private String cor;
	private int numero;
	private String acao;
	
	public String getCor(){
		return this.cor;
	}
	public String getAcao(){
		return this.acao;
	}
	public int getNumero(){
		return this.numero;
	}
	
	public void setCor(String c){
		this.cor = c;
	}
	public void setAcao(String ac){
		this.acao = ac;
	}
	public void setNumero(int n){
		this.numero = n;
	}
	
	@Override
	public String toString() {
		String carta;
		if(this.cor == null) {
			carta = "CESC: " + this.acao;
		} else if(this.acao == null) {
			carta = "CNCC: " + this.numero + " " + this.cor;
		} else {
			carta = "CECC: " + this.acao + " " + this.cor;
		}
		return carta;
	}
}
